/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

/**
 * 
 * @author edarsow
 */
public interface CrashTestable {
    /**
     * 
     * @return int of the vehicle model year
     */
    public int getVehicleYear();
    
    /**
     * 
     * @return the enum driving mode
     */
    public DrivingMode getDrivingMode();
    
    /**
     * 
     * @return the double of the vehicles weight 
     */
    public double getVehicleWeight();
    
    /**
     * 
     * @return a double of the front bumper weight
     */
    public double getFrontBumperHeight();
    
    /**
     * 
     * @return a String with the frame material identifier 
     */
    public String frameMaterialIdentifer();
    
    /**
     * 
     * @return a boolean.  True if there is a driver airbag.  False if there isn't 
     */
    public boolean driverAirbagPresent();
    
    // for determining center of gravity
    /**
     * 
     * @return a double with the length of the wheelbase
     */
    public double getLengthOfWheelBase();
    
    /**
     * 
     * @return the front wheel weight while vehicle is level
     */
    public double getFrontWeightLevelWeight();
    
    /**
     * 
     * @return the front wheel weight while the vehicle is raised 
     */
    public double getFrontWeightWhenRaised();
    
}
