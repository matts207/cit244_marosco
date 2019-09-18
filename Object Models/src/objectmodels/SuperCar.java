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
public class SuperCar extends Automobile{
    private boolean hasSpoiler;
    private String suspensionType;
    private int topSpeed;
    private boolean launchControl;
    private boolean supportsMultipleDrivingModes;

    
    @Override
    public void turn(int degrees){
        
    }
    
    /**
     * @return the hasSpoiler
     */
    public boolean isHasSpoiler() {
        return hasSpoiler;
    }

    /**
     * @param hasSpoiler the hasSpoiler to set
     */
    public void setHasSpoiler(boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    /**
     * @return the suspensionType
     */
    public String getSuspensionType() {
        return suspensionType;
    }

    /**
     * @param suspensionType the suspensionType to set
     */
    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    /**
     * @return the topSpeed
     */
    public int getTopSpeed() {
        return topSpeed;
    }

    /**
     * @param topSpeed the topSpeed to set
     */
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * @return the launchControl
     */
    public boolean isLaunchControl() {
        return launchControl;
    }

    /**
     * @param launchControl the launchControl to set
     */
    public void setLaunchControl(boolean launchControl) {
        this.launchControl = launchControl;
    }

    /**
     * @return the supportsMultipleDrivingModes
     */
    public boolean isSupportsMultipleDrivingModes() {
        return supportsMultipleDrivingModes;
    }

    /**
     * @param supportsMultipleDrivingModes the supportsMultipleDrivingModes to set
     */
    public void setSupportsMultipleDrivingModes(boolean supportsMultipleDrivingModes) {
        this.supportsMultipleDrivingModes = supportsMultipleDrivingModes;
    }

    
    
}
