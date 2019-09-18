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
public interface Turnable {
    
    /**
     * Access point for users to specify a
     * turn radius in degrees
     * @param deg: the degrees of the turn
     * 0 represents no turning,
     * negative values 0 to -180 means left turn,
     * positive values 0 to 180 means right turn.
     */
    public void turn(int deg);
    //NO GUTS HERE
    
}
