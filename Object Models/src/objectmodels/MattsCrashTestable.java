/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

import inheritancepractice.CrashTestable;

/**
 * 
 * @author edarsow
 */
public interface MattsCrashTestable extends CrashTestable{
    /**
     * 
     * @return a String with the frame material identifier 
     */
    public FrameMaterial frameMaterial();
    

    
}
