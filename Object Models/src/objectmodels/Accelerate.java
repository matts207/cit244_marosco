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
public interface Accelerate {
    
    
    public void accelerate(int mph);
    public void decelerate(int mph);
    public void fullbrake();
    public void shiftup();
    public void shiftdown();
    
}
