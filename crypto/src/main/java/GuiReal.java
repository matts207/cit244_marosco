
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    public void runGui(){
        JFrame frame = new JFrame("ENCRYPT");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2,1,10,2));
        frame.add(panel1);
        frame.add(panel2);
        panel1.add(new JLabel("Enter your plain text here:"));
        panel1.add(new JTextArea(15,40));
        JButton go = new JButton("ENCRYPT");
        JLabel output = new JLabel("output");
        panel2.add(go);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
