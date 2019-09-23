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
public class ObjectModels{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperCar m = new SuperCar();
        m.accelerate(20);
        m.accelerate(200);
        m.decelerate(25);
        System.out.println("Speed = " + m.getSpeed());
    }

}
