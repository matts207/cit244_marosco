/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

import inheritancepractice.DrivingMode;

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
        //System.out.println("Speed = " + m.getSpeed());
        m.setModelYear(2010);
        m.setFrameMaterial(FrameMaterial.STEEL);
        System.out.println(crash(m));
    }

    public static double crash(MattsCrashTestable car) {
        double score = 5;
        int year = car.getVehicleYear();
        DrivingMode drmode = car.getDrivingMode();
        double weight = car.getVehicleWeight();
        double frbumberheight = car.getFrontBumberHeight();
        FrameMaterial frame = car.frameMaterial();
        boolean airbag = car.driverAirbagPresent();
        double wblen = car.getLengthOfWheelBase();
        double frontlevweight = car.getFrontWeightLevelWeight();
        double frontraisedweight = car.getFrontWeightWhenRaised();
        
        System.out.println(frame);
        
        if (year > 0 && year <= 1980){
            score -= 2;
        }
        else if (year > 1980 && year <= 1995){
            score -= 1;
        }
        else if (year > 1995 && year < 2005){
            score -= .5;
        }
        
        if (frame == FrameMaterial.ALLUMINUM || frame == FrameMaterial.CARBONFIBER){
            score -= .5;
        }
        
        if (airbag == false && airbag) {
            score -= 3;
        }
        
        if (weight < 4000 && weight > 2000){
            score -= .5;
        }
        
        
        
        return score;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
