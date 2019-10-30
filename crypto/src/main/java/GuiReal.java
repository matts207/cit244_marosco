
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matts207
 */
public class GuiReal{
    private String ct = "";
    private byte[] filecontent;
    
    public void setFileContent(byte[] fc){
        filecontent = fc;
    }
    
    public byte[] getFileContent(){
        return filecontent;
    }
    

    public void runGui(){
        JFrame frame = new JFrame("ENCRYPT");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel(new GridLayout(3,1,2,2));
        JPanel buttonpanel = new JPanel();
        JPanel olpanel = new JPanel();
        JPanel otpanel = new JPanel();
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(2,1,10,10));
        frame.add(panel1);
        frame.add(panel2);
        
        
        JTextArea ptinput = new JTextArea(15,40);
        ptinput.setText("Enter your plain text here:");
        JTextField outputtext = new JTextField();

                
        JButton go = new JButton("HASH");
        
        go.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String pt = ptinput.getText();
                System.out.println(pt);
                EncryptAndCreateFile f = new EncryptAndCreateFile();
                f.encryptmd5(pt.getBytes());
                String ct = f.getHashedText();
                System.out.println(f.getHashedText());
                outputtext.setText(ct);
            }
            
        });
        

         
        ButtonGroup group = new ButtonGroup();
        
        JRadioButton textChoice = new JRadioButton();
        JRadioButton fileChoice = new JRadioButton();
        textChoice.setText("Hash Text");
        fileChoice.setText("Hash A File");
        group.add(fileChoice);
        group.add(textChoice);
        textChoice.setSelected(true);
                
        JFileChooser filechooser = new JFileChooser();

        
        JButton filechooserbutton = new JButton("Choose File");
        filechooserbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int returnVal = filechooser.showOpenDialog(filechooserbutton);
                if(returnVal == JFileChooser.APPROVE_OPTION){
                    go.setEnabled(true);
                    try {
                        File file = filechooser.getSelectedFile();
                        setFileContent(Files.readAllBytes(file.toPath()));
                        
                        System.out.println(getFileContent());
                    } catch (IOException ex) {
                        Logger.getLogger(GuiReal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        });
        filechooserbutton.setEnabled(false);
        
        
//        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//        filechooser.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                if(ae.getSource() == filechooserbutton){
//                    int returnVal = 1;
//                    
//                }
//            }
//            
//        });
//        
        
        

        ptinput.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
                ptinput.setText("");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            
            
        });
        
        fileChoice.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ptinput.setEnabled(false);
                filechooserbutton.setEnabled(true);
                
                go.setEnabled(false);
                go.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    EncryptAndCreateFile f = new EncryptAndCreateFile();
                    f.encryptmd5(getFileContent());
                    String ct = f.getHashedText();
                    System.out.println(f.getHashedText());
                    outputtext.setText(ct);                    

            }
            
        });
            }
        });
                
        
        textChoice.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ptinput.setEnabled(true);
                filechooserbutton.setEnabled(false);
                
                go.setEnabled(true);
                
                go.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String pt = ptinput.getText();
                    System.out.println(pt);
                    EncryptAndCreateFile f = new EncryptAndCreateFile();
                    f.encryptmd5(pt.getBytes());
                    String ct = f.getHashedText();
                    System.out.println(f.getHashedText());
                    outputtext.setText(ct);
            }
            
        });
            }
            
            
            
        });
        
        panel1.add(textChoice);
        panel1.add(fileChoice);
        panel1.add(filechooserbutton);
//        panel1.add(new JLabel("Enter your plain text here:"));
        panel1.add(ptinput);
        
        
        JLabel outputlb = new JLabel("OUTPUT");
        outputtext.setEditable(false);
        outputtext.setPreferredSize(new Dimension(300,40));
        panel2.add(buttonpanel);
        buttonpanel.add(go);
        olpanel.add(outputlb);
        panel2.add(olpanel);
        otpanel.add(outputtext);
        panel2.add(otpanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        frame.setVisible(true);
    }
    
    public void setCt(String s){
        this.ct = s;
    }
    
    public String getCt(){
        return this.ct;
    }
    
    
    
}
