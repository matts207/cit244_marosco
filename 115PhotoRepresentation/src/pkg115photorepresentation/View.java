/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg115photorepresentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author matts207
 */
public class View {
    private JFrame inputframe;
    private JFrame menuframe;
    private JFrame photoviewframe;
    private ArrayList<Object> outerlist;
    private ArrayList<Object> innerlist;
    
    private JButton gotoinput;
    private JButton gotoview;
    private int buttonval;
    private Color color = Color.WHITE;
    
    
    private JPanel photopanel;
    private JPanel menupanel;
    private JPanel rowsliderpan;
    private JPanel colsliderpan;
    private JLabel rowsliderlab;
    private JLabel colsliderlab;
    private JRadioButton binaryrb;
    private JRadioButton rgbrb;
    private ButtonGroup repbg;
    private JSlider rowslider;
    private JSlider colslider;
    private int rowmin = 2;
    private int rowmax = 20;
    private int rowinit = 10;
    private int colmin = 2;
    private int colmax = 20;
    private int colinit = 10;
    private int rows;
    private int cols;
    
    
    
    public View(){
        menuframe = new JFrame("Photo Representations");
        JPanel menupanel1 = new JPanel(new GridLayout(1,2));
        JPanel menupanel2 = new JPanel(new GridLayout(2,1));
        menuframe.setLayout(new GridLayout(3,1));
        binaryrb = new JRadioButton("Binary");
        rgbrb = new JRadioButton("RGB");
        repbg = new ButtonGroup();
        
        binaryrb.setSelected(true);
        
        rowsliderpan = new JPanel(new GridLayout(2,1));
        colsliderpan = new JPanel(new GridLayout(2,1));
        
        rowsliderlab = new JLabel("Number of Rows", JLabel.CENTER);
        colsliderlab = new JLabel("Number of Columns", JLabel.CENTER);
        
        rowslider = new JSlider(JSlider.HORIZONTAL, getRowmin(), getRowmax(), getRowinit());
        colslider = new JSlider(JSlider.HORIZONTAL, getColmin(), getColmax(), getColinit());
        rowslider.setMinorTickSpacing(1);
        rowslider.setMajorTickSpacing(8);
        rowslider.setPaintLabels(true);
        rowslider.setPaintTicks(true);
        colslider.setMinorTickSpacing(1);
        colslider.setMajorTickSpacing(8);
        colslider.setPaintLabels(true);
        colslider.setPaintTicks(true);
        
        rowslider.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                setRowslider((JSlider)ce.getSource());
                if(!rowslider.getValueIsAdjusting()){
                    setRows((int)getRowslider().getValue());
                }
            }
            
        });
        
        colslider.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                setColslider((JSlider)ce.getSource());
                if(!colslider.getValueIsAdjusting()){
                    setCols((int)getColslider().getValue());
                }
            }
            
        });
        
        rowsliderpan.add(rowsliderlab);
        rowsliderpan.add(rowslider);
        colsliderpan.add(colsliderlab);
        colsliderpan.add(colslider);
        rows = 10;
        cols = 10;
        rowslider.setValue(10);
        colslider.setValue(10);
                
        gotoinput = new JButton("GO");
        gotoinput.addActionListener(new ActionListenerForRunButton());
        gotoinput.setPreferredSize(new Dimension(100,50));
        
        repbg.add(rgbrb);
        repbg.add(binaryrb);
        menuframe.setSize(400, 550);
        menupanel1.add(binaryrb);
        menupanel1.add(rgbrb);
        menupanel2.add(rowsliderpan);
        menupanel2.add(colsliderpan);
        menuframe.add(menupanel1);
        menuframe.add(menupanel2);
        JPanel buttonpanel = new JPanel(new BorderLayout());
        gotoinput.setVerticalAlignment(0);
        buttonpanel.add(gotoinput);

        menuframe.add(buttonpanel);
        
        menuframe.setLocationRelativeTo(null);
        menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuframe.setVisible(true);
        
    }
    
    
    
    public void inputScreenBin(int rows, int cols){
        JFrame frame = new JFrame("IO");
        frame.setLayout(new GridLayout(rows, cols));
        ArrayList<ArrayList> collist = new ArrayList();
        
        for(int i = 0;i < cols; i++){
            ArrayList<Integer> rowlist = new ArrayList();
            for(int s = 0;s < rows; s++){
                JPanel bp = new JPanel();
                bp.setBackground(color);
                JButton jcb = new JButton();
                jcb.addActionListener((ActionEvent ae) -> {
                    if(bp.getBackground() == color){
                        jcb.setBackground(Color.DARK_GRAY);
                        bp.setBackground(Color.DARK_GRAY);
                    }
                    else{                    
                        jcb.setBackground(Color.WHITE);
                        bp.setBackground(Color.WHITE);
                    }
                });
                bp.add(jcb);
                frame.add(bp);
            }
        }
        
//        frame.setSize(rows , cols);
        frame.setSize(cols*50, rows*50);
        frame.setVisible(true);
        
        
    }
    
    class CustomActionListenerForCheckbox implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(getButtonval() == 0){
                setButtonVal(1);
                setColor(Color.GRAY);
            }
            else if(getButtonval() == 1){
                setButtonVal(0);
                setColor(Color.WHITE);
            }
        }
    }
    
    class ActionListenerForRunButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(getBinaryrb().isSelected()){
                inputScreenBin(getRows(), getCols());
            }
            else if(getRgbrb().isSelected()){
                
            }
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(this.getButtonVal() == 0){
            this.setButtonVal(1);
        }else{
            this.setButtonVal(0);
        }
        
    }

    
    
    /**
     * @return the inputframe
     */
    public JFrame getInputframe() {
        return inputframe;
    }

    /**
     * @param inputframe the inputframe to set
     */
    public void setInputframe(JFrame inputframe) {
        this.inputframe = inputframe;
    }

    /**
     * @return the menuframe
     */
    public JFrame getMenuframe() {
        return menuframe;
    }

    /**
     * @param menuframe the menuframe to set
     */
    public void setMenuframe(JFrame menuframe) {
        this.menuframe = menuframe;
    }

    /**
     * @return the photoviewframe
     */
    public JFrame getPhotoviewframe() {
        return photoviewframe;
    }

    /**
     * @param photoviewframe the photoviewframe to set
     */
    public void setPhotoviewframe(JFrame photoviewframe) {
        this.photoviewframe = photoviewframe;
    }

    /**
     * @return the outerlist
     */
    public ArrayList getOuterlist() {
        return outerlist;
    }

    /**
     * @param outerlist the outerlist to set
     */
    public void setOuterlist(ArrayList outerlist) {
        this.outerlist = outerlist;
    }

    /**
     * @return the innerlist
     */
    public ArrayList getInnerlist() {
        return innerlist;
    }

    /**
     * @param innerlist the innerlist to set
     */
    public void setInnerlist(ArrayList innerlist) {
        this.innerlist = innerlist;
    }

    /**
     * @return the photopanel
     */
    public JPanel getPhotopanel() {
        return photopanel;
    }

    /**
     * @param photopanel the photopanel to set
     */
    public void setPhotopanel(JPanel photopanel) {
        this.photopanel = photopanel;
    }

    /**
     * @return the menupanel
     */
    public JPanel getMenupanel() {
        return menupanel;
    }

    /**
     * @param menupanel the menupanel to set
     */
    public void setMenupanel(JPanel menupanel) {
        this.menupanel = menupanel;
    }

    /**
     * @return the rowsliderpan
     */
    public JPanel getRowsliderpan() {
        return rowsliderpan;
    }

    /**
     * @param rowsliderpan the rowsliderpan to set
     */
    public void setRowsliderpan(JPanel rowsliderpan) {
        this.rowsliderpan = rowsliderpan;
    }

    /**
     * @return the colsliderpan
     */
    public JPanel getColsliderpan() {
        return colsliderpan;
    }

    /**
     * @param colsliderpan the colsliderpan to set
     */
    public void setColsliderpan(JPanel colsliderpan) {
        this.colsliderpan = colsliderpan;
    }

    /**
     * @return the rowsliderlab
     */
    public JLabel getRowsliderlab() {
        return rowsliderlab;
    }

    /**
     * @param rowsliderlab the rowsliderlab to set
     */
    public void setRowsliderlab(JLabel rowsliderlab) {
        this.rowsliderlab = rowsliderlab;
    }

    /**
     * @return the colsliderlab
     */
    public JLabel getColsliderlab() {
        return colsliderlab;
    }

    /**
     * @param colsliderlab the colsliderlab to set
     */
    public void setColsliderlab(JLabel colsliderlab) {
        this.colsliderlab = colsliderlab;
    }

    /**
     * @return the binaryrb
     */
    public JRadioButton getBinaryrb() {
        return binaryrb;
    }

    /**
     * @param binaryrb the binaryrb to set
     */
    public void setBinaryrb(JRadioButton binaryrb) {
        this.binaryrb = binaryrb;
    }

    /**
     * @return the rgbrb
     */
    public JRadioButton getRgbrb() {
        return rgbrb;
    }

    /**
     * @param rgbrb the rgbrb to set
     */
    public void setRgbrb(JRadioButton rgbrb) {
        this.rgbrb = rgbrb;
    }

    /**
     * @return the repbg
     */
    public ButtonGroup getRepbg() {
        return repbg;
    }

    /**
     * @param repbg the repbg to set
     */
    public void setRepbg(ButtonGroup repbg) {
        this.repbg = repbg;
    }

    /**
     * @return the rowslider
     */
    public JSlider getRowslider() {
        return rowslider;
    }

    /**
     * @param rowslider the rowslider to set
     */
    public void setRowslider(JSlider rowslider) {
        this.rowslider = rowslider;
    }

    /**
     * @return the colslider
     */
    public JSlider getColslider() {
        return colslider;
    }

    /**
     * @param colslider the colslider to set
     */
    public void setColslider(JSlider colslider) {
        this.colslider = colslider;
    }

    /**
     * @return the rowmin
     */
    public int getRowmin() {
        return rowmin;
    }

    /**
     * @param rowmin the rowmin to set
     */
    public void setRowmin(int rowmin) {
        this.rowmin = rowmin;
    }

    /**
     * @return the rowmax
     */
    public int getRowmax() {
        return rowmax;
    }

    /**
     * @param rowmax the rowmax to set
     */
    public void setRowmax(int rowmax) {
        this.rowmax = rowmax;
    }

    /**
     * @return the rowinit
     */
    public int getRowinit() {
        return rowinit;
    }

    /**
     * @param rowinit the rowinit to set
     */
    public void setRowinit(int rowinit) {
        this.rowinit = rowinit;
    }

    /**
     * @return the colmin
     */
    public int getColmin() {
        return colmin;
    }

    /**
     * @param colmin the colmin to set
     */
    public void setColmin(int colmin) {
        this.colmin = colmin;
    }

    /**
     * @return the colmax
     */
    public int getColmax() {
        return colmax;
    }

    /**
     * @param colmax the colmax to set
     */
    public void setColmax(int colmax) {
        this.colmax = colmax;
    }

    /**
     * @return the colinit
     */
    public int getColinit() {
        return colinit;
    }

    /**
     * @param colinit the colinit to set
     */
    public void setColinit(int colinit) {
        this.colinit = colinit;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the cols
     */
    public int getCols() {
        return cols;
    }

    /**
     * @param cols the cols to set
     */
    public void setCols(int cols) {
        this.cols = cols;
    }
    
    
    public void setButtonVal(int val){
        this.setButtonval(val);
    }
    
    public int getButtonVal(){
        return getButtonval();
    }

    /**
     * @return the gotoinput
     */
    public JButton getGotoinput() {
        return gotoinput;
    }

    /**
     * @param gotoinput the gotoinput to set
     */
    public void setGotoinput(JButton gotoinput) {
        this.gotoinput = gotoinput;
    }

    /**
     * @return the gotoview
     */
    public JButton getGotoview() {
        return gotoview;
    }

    /**
     * @param gotoview the gotoview to set
     */
    public void setGotoview(JButton gotoview) {
        this.gotoview = gotoview;
    }

    /**
     * @return the buttonval
     */
    public int getButtonval() {
        return buttonval;
    }

    /**
     * @param buttonval the buttonval to set
     */
    public void setButtonval(int buttonval) {
        this.buttonval = buttonval;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
}
