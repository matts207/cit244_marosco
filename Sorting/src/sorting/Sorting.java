/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matts207
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort n = new BubbleSort();
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(10032);
        list.add(45);
        list.add(900);
        list.add(485);
        
        System.out.println("After sort:" + n.sort(list));
    }
    
}
