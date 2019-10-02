/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

import inheritancepractice.CrashTestable;
import inheritancepractice.DrivingMode;

/**
 *
 * @author matts207
 */
public class Automobile implements Accelerate, Turnable, MattsCrashTestable, CrashTestable{
    private String vinNumber;
    private String engineType;
    private int numberOfWheels;
    private int numberOfSeats;
    private double cargoCapacity;
    private int range;
    private String transmissionType;
    private String driveTrain;
    private int numberOfGears;
    private int numberOfDoors;
    private int numberOfCupholders;
    private double zeroToSixtyMPH;
    private String color;
    private int weight;
    private int speed;
    private double centerOfGravity;
    private String make;
    private String model;
    private int modelYear;
    private boolean airbagsDeployed;
    private boolean driverAirbagPresent;
    private DrivingMode drivemode;
    private double frontBumperHeight;
    private String frameMaterialIdentifier;
    private FrameMaterial frameMaterial;
    private double wheelbaseLength;
    private double frontWeightLevel;
    private double frontWeightRaised;
    
    

    /**
     * @return the vinNumber
     */
    public String getVinNumber() {
        return vinNumber;
    }

    /**
     * @param vinNumber the vinNumber to set
     */
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    /**
     * @return the engineType
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * @param engineType the engineType to set
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * @return the numberOfWheels
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * @param numberOfWheels the numberOfWheels to set
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * @return the numberOfSeats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * @param numberOfSeats the numberOfSeats to set
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * @return the cargoCapacity
     */
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * @param cargoCapacity the cargoCapacity to set
     */
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * @return the range
     */
    public int getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(int range) {
        this.range = range;
    }

    /**
     * @return the transmissionType
     */
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * @param transmissionType the transmissionType to set
     */
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    /**
     * @return the driveTrain
     */
    public String getDriveTrain() {
        return driveTrain;
    }

    /**
     * @param driveTrain the driveTrain to set
     */
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    /**
     * @return the numberOfGears
     */
    public int getNumberOfGears() {
        return numberOfGears;
    }

    /**
     * @param numberOfGears the numberOfGears to set
     */
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    /**
     * @return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param numberOfDoors the numberOfDoors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * @return the numberOfCupholders
     */
    public int getNumberOfCupholders() {
        return numberOfCupholders;
    }

    /**
     * @param numberOfCupholders the numberOfCupholders to set
     */
    public void setNumberOfCupholders(int numberOfCupholders) {
        this.numberOfCupholders = numberOfCupholders;
    }

    /**
     * @return the zeroToSixtyMPH
     */
    public double getZeroToSixtyMPH() {
        return zeroToSixtyMPH;
    }

    /**
     * @param zeroToSixtyMPH the zeroToSixtyMPH to set
     */
    public void setZeroToSixtyMPH(double zeroToSixtyMPH) {
        this.zeroToSixtyMPH = zeroToSixtyMPH;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the centerOfGravity
     */
    public double getCenterOfGravity() {
        return centerOfGravity;
    }

    /**
     * @param centerOfGravity the centerOfGravity to set
     */
    public void setCenterOfGravity(double centerOfGravity) {
        this.centerOfGravity = centerOfGravity;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the modelYear
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * @param modelYear the modelYear to set
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * @return the airbagsDeployed
     */
    public boolean isAirbagsDeployed() {
        return airbagsDeployed;
    }

    /**
     * @param airbagsDeployed the airbagsDeployed to set
     */
    public void setAirbagsDeployed(boolean airbagsDeployed) {
        this.airbagsDeployed = airbagsDeployed;
    }

    @Override
    public void fullbrake() {
        this.setSpeed(0);
    }

    @Override
    public void shiftup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shiftdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accelerate(int mph) {
        this.setSpeed(this.getSpeed() + mph);
    }

    @Override
    public void decelerate(int mph) {
        this.setSpeed(this.getSpeed() - mph);
    }

    @Override
    public void turn(int deg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVehicleYear() {
        return this.getModelYear();
    }

    @Override
    public DrivingMode getDrivingMode() {
        return this.getDrivemode();
    }

    @Override
    public double getVehicleWeight() {
        return this.getWeight();
    }

    @Override
    public String frameMaterialIdentifer() {
        return this.getFrameMaterialIdentifier();
    }

    @Override
    public boolean driverAirbagPresent() {
        return this.isDriverAirbagPresent();
    }

    @Override
    public double getLengthOfWheelBase() {
        return this.getWheelbaseLength();
    }

    @Override
    public double getFrontWeightLevelWeight() {
        return this.getFrontWeightLevel();
    }

    @Override
    public double getFrontWeightWhenRaised() {
        return this.getFrontWeightRaised();
    }

    /**
     * @return the driverAirbagPresent
     */
    public boolean isDriverAirbagPresent() {
        return this.driverAirbagPresent;
    }

    /**
     * @param driverAirbagPresent the driverAirbagPresent to set
     */
    public void setDriverAirbagPresent(boolean driverAirbagPresent) {
        this.driverAirbagPresent = driverAirbagPresent;
    }

    /**
     * @return the drivemode
     */
    public DrivingMode getDrivemode() {
        return this.drivemode;
    }

    /**
     * @param drivemode the drivemode to set
     */
    public void setDrivemode(DrivingMode drivemode) {
        this.drivemode = drivemode;
    }

    /**
     * @return the frontBumperHeight
     */
    public double getFBumperHeight() {
        return this.getFrontBumperHeight();
    }

    /**
     * @param frontBumperHeight the frontBumperHeight to set
     */
    public void setFBumperHeight(double frontBumperHeight) {
        this.setFrontBumperHeight(frontBumperHeight);
    }

    /**
     * @return the frameMaterialIdentifier
     */
    public String getFrameMaterialIdentifier() {
        return this.frameMaterialIdentifier;
    }

    /**
     * @param frameMaterialIdentifier the frameMaterialIdentifier to set
     */
    public void setFrameMaterialIdentifier(String frameMaterialIdentifier) {
        this.frameMaterialIdentifier = frameMaterialIdentifier;
    }

    /**
     * @return the wheelbaseLength
     */
    public double getWheelbaseLength() {
        return this.wheelbaseLength;
    }

    /**
     * @param wheelbaseLength the wheelbaseLength to set
     */
    public void setWheelbaseLength(double wheelbaseLength) {
        this.wheelbaseLength = wheelbaseLength;
    }

    /**
     * @return the frontWeightLevel
     */
    public double getFrontWeightLevel() {
        return this.frontWeightLevel;
    }

    /**
     * @param frontWeightLevel the frontWeightLevel to set
     */
    public void setFrontWeightLevel(double frontWeightLevel) {
        this.frontWeightLevel = frontWeightLevel;
    }

    /**
     * @return the frontWeightRaised
     */
    public double getFrontWeightRaised() {
        return frontWeightRaised;
    }

    /**
     * @param frontWeightRaised the frontWeightRaised to set
     */
    public void setFrontWeightRaised(double frontWeightRaised) {
        this.frontWeightRaised = frontWeightRaised;
    }

    @Override
    public FrameMaterial frameMaterial() {
        return this.getFrameMaterial();
    }

    @Override
    public double getFrontBumberHeight() {
        return this.getFBumperHeight();
    }

    /**
     * @return the frontBumperHeight
     */
    public double getFrontBumperHeight() {
        return frontBumperHeight;
    }

    /**
     * @param frontBumperHeight the frontBumperHeight to set
     */
    public void setFrontBumperHeight(double frontBumperHeight) {
        this.frontBumperHeight = frontBumperHeight;
    }

    /**
     * @return the frameMaterial
     */
    public FrameMaterial getFrameMaterial() {
        return this.frameMaterial;
    }

    /**
     * @param frameMaterial the frameMaterial to set
     */
    public void setFrameMaterial(FrameMaterial frameMaterial) {
        this.frameMaterial = frameMaterial;
    }




   
}
