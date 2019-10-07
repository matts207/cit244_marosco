/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

import inheritancepractice.DrivingMode;
import java.util.Random; 
import inheritancepractice.CrashTestable;


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
        SuperCar noSurvivors = new SuperCar();
        noSurvivors.accelerate(20);
        noSurvivors.accelerate(200);
        noSurvivors.decelerate(25);
        //System.out.println("Speed = " + m.getSpeed());
        noSurvivors.setModelYear(2019);
        noSurvivors.setFrameMaterial(FrameMaterial.STEEL);
        noSurvivors.setDriverAirbagPresent(true);
        double c  = crash(noSurvivors);
        System.out.println(String.format("Score: %.1f/5", c));
        System.out.println(c);
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
        Random ranvar = new Random();
        double r = ranvar.nextDouble() / 2;
        System.out.println("ran: " + r);
        
        score -= (frame.getValue() * r);
        
        System.out.println(frame);
        
        if (year > 0 && year <= 1980){
            score -= (2 * r);
        }
        else if (year > 1980 && year <= 1995){
            score -= (1 * r);
        }
        else if (year > 1995 && year < 2005){
            score -= (.5 * r);
        }
        
        if (airbag == false && airbag) {
            score -= (3 * r);
        }
        
        if (weight < 4000 && weight > 2000 && weight != 0){
            score -= (.5 * r);
        }
        else if (weight < 2000 && weight != 0){
            score -= (1 * r);
        }
        
        System.out.println(weight);
        
        return score;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
