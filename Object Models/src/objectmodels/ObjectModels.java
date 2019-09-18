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
public class ObjectModels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperCar mattsCar = new SuperCar();
        mattsCar.setMake("Honda");
        mattsCar.setModel("Civic SI");
        mattsCar.setModelYear(2009);
        mattsCar.accelerate(60);
        System.out.println(mattsCar.accelerate(60));
        mattsCar.setVinNumber("dsagklljwalj3");
        System.out.println(mattsCar.getVinNumber());
    }
    
}
