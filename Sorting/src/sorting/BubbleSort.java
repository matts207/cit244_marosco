/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.List;

/**
 *
 * @author matts207
 */
public class BubbleSort {
    
    private boolean needsNextPass;
    
    public List<Integer> sort(List<Integer> list){
        setNeedsNextPass(true);
        for (int k = 1; k < list.size() && isNeedsNextPass(); k++) {
            setNeedsNextPass(false);
            for (int i = 0; i < list.size() - k; i++){
                if (list.get(i) > list.get((i + 1))){
                    int int1 = list.get(i);
                    int int2 = list.get(i + 1);
                    list.set(i, int2);
                    list.set((i + 1), int1);
                    setNeedsNextPass(true);
                }
            }
        }
        return list;
    }

    /**
     * @return the needsNextPass
     */
    public boolean isNeedsNextPass() {
        return needsNextPass;
    }

    /**
     * @param needsNextPass the needsNextPass to set
     */
    public void setNeedsNextPass(boolean needsNextPass) {
        this.needsNextPass = needsNextPass;
    }
    
}
