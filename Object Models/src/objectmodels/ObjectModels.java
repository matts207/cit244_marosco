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
public class ObjectModels implements CrashTest{

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
        int crashtest = crash(m);
        System.out.println(crash(m) + " Stars");
    }

    @Override
    public int crash(Automobile car) {
        int year = car.getVehicleYear();
        DrivingMode drmode = car.getDrivingMode();
        double weight = car.getVehicleWeight();
        double frbumpheight = car.getFrontBumperHeight();
        String frame = car.getFrameMaterialIdentifier();
        boolean airbag = car.isDriverAirbagPresent();
        double wblen = car.getWheelbaseLength();
        double frontlevweight = car.getFrontWeightLevelWeight();
        double frontraisedweight = car.getFrontWeightWhenRaised();
        
        if(frame == FrameMaterial.STEEL && year < 2000){
            return 1;
        }
        else{
            return 3;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
