/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

/**
 *
 * @author matts207
 */
public enum FrameMaterial {
    STEEL(1),
    ALLUMINUM(.5),
    CARBONFIBER(0);
    private final double value;
    private FrameMaterial(double des){
        this.value = des;
    }
    
    public double getValue(){
        return this.value;
    }
}