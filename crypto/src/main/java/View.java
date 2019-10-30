
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
public class View {
    
    private JFrame mainframe;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel buttonPanel;
    private JPanel outputLabelPanel;
    private JPanel outputTextPanel;
    private JTextArea plaintextInput;
    private JTextField outputTextField;
    private JButton hashButton;
    private ButtonGroup buttonGroup;
    private JRadioButton textChoice;
    private JRadioButton choiceChoice;
    private JFileChooser fileChooser;
    private JButton fileChooserButton;
    private JLabel outputTextLabel;
    
    public View(){
        mainframe = new JFrame("Hash Some Shit");
        panel1 = new JPanel();
        panel2 = new JPanel(new GridLayout(3,1,2,2));
        buttonPanel = new JPanel();
        outputLabelPanel = new JPanel();
        outputTextPanel = new JPanel();
        mainframe.setSize(500, 400);
        mainframe.setLayout(new GridLayout(2,1,10,10));
        mainframe.add(panel1);
        mainframe.add(panel2);
        panel2.add(buttonPanel);
        panel2.add(outputLabelPanel);
        panel2.add(outputTextPanel);
    }

    /**
     * @return the mainframe
     */
    public JFrame getMainframe() {
        return mainframe;
    }

    /**
     * @param mainframe the mainframe to set
     */
    public void setMainframe(JFrame mainframe) {
        this.mainframe = mainframe;
    }

    /**
     * @return the panel1
     */
    public JPanel getPanel1() {
        return panel1;
    }

    /**
     * @param panel1 the panel1 to set
     */
    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    /**
     * @return the panel2
     */
    public JPanel getPanel2() {
        return panel2;
    }

    /**
     * @param panel2 the panel2 to set
     */
    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    /**
     * @return the buttonPanel
     */
    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    /**
     * @param buttonPanel the buttonPanel to set
     */
    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    /**
     * @return the outputLabelPanel
     */
    public JPanel getOutputLabelPanel() {
        return outputLabelPanel;
    }

    /**
     * @param outputLabelPanel the outputLabelPanel to set
     */
    public void setOutputLabelPanel(JPanel outputLabelPanel) {
        this.outputLabelPanel = outputLabelPanel;
    }

    /**
     * @return the outputTextPanel
     */
    public JPanel getOutputTextPanel() {
        return outputTextPanel;
    }

    /**
     * @param outputTextPanel the outputTextPanel to set
     */
    public void setOutputTextPanel(JPanel outputTextPanel) {
        this.outputTextPanel = outputTextPanel;
    }

    /**
     * @return the plaintextInput
     */
    public JTextArea getPlaintextInput() {
        return plaintextInput;
    }

    /**
     * @param plaintextInput the plaintextInput to set
     */
    public void setPlaintextInput(JTextArea plaintextInput) {
        this.plaintextInput = plaintextInput;
    }

    /**
     * @return the outputTextField
     */
    public JTextField getOutputTextField() {
        return outputTextField;
    }

    /**
     * @param outputTextField the outputTextField to set
     */
    public void setOutputTextField(JTextField outputTextField) {
        this.outputTextField = outputTextField;
    }

    /**
     * @return the hashButton
     */
    public JButton getHashButton() {
        return hashButton;
    }

    /**
     * @param hashButton the hashButton to set
     */
    public void setHashButton(JButton hashButton) {
        this.hashButton = hashButton;
    }

    /**
     * @return the buttonGroup
     */
    public ButtonGroup getButtonGroup() {
        return buttonGroup;
    }

    /**
     * @param buttonGroup the buttonGroup to set
     */
    public void setButtonGroup(ButtonGroup buttonGroup) {
        this.buttonGroup = buttonGroup;
    }

    /**
     * @return the textChoice
     */
    public JRadioButton getTextChoice() {
        return textChoice;
    }

    /**
     * @param textChoice the textChoice to set
     */
    public void setTextChoice(JRadioButton textChoice) {
        this.textChoice = textChoice;
    }

    /**
     * @return the choiceChoice
     */
    public JRadioButton getChoiceChoice() {
        return choiceChoice;
    }

    /**
     * @param choiceChoice the choiceChoice to set
     */
    public void setChoiceChoice(JRadioButton choiceChoice) {
        this.choiceChoice = choiceChoice;
    }

    /**
     * @return the fileChooser
     */
    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    /**
     * @param fileChooser the fileChooser to set
     */
    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    /**
     * @return the fileChooserButton
     */
    public JButton getFileChooserButton() {
        return fileChooserButton;
    }

    /**
     * @param fileChooserButton the fileChooserButton to set
     */
    public void setFileChooserButton(JButton fileChooserButton) {
        this.fileChooserButton = fileChooserButton;
    }

    /**
     * @return the outputTextLabel
     */
    public JLabel getOutputTextLabel() {
        return outputTextLabel;
    }

    /**
     * @param outputTextLabel the outputTextLabel to set
     */
    public void setOutputTextLabel(JLabel outputTextLabel) {
        this.outputTextLabel = outputTextLabel;
    }
    
    
}
