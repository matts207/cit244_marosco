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
public class Automobile implements Accelerate, Turnable{
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        this.speed += mph;
    }

    @Override
    public void decelerate(int mph) {
        this.speed -= mph;
    }
    
   
}
