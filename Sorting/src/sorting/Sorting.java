/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static sorting.HeapSort.heapSort;

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
//        BubbleSort n = new BubbleSort();
        Random ran = new Random();
//        List<Integer> list = new ArrayList<Integer>();
//        for(int i = 0;i < 100000; i++){
//            list.add(ran.nextInt(1000000));
//        }
//        
//        System.out.println("After sort:" + n.sort(list));
        
        int length = 100000;
        Integer[] list2 = new Integer[length];
        for (int i = 0;i < length; i ++){
            list2[i] = ran.nextInt(100000000);
        }
        heapSort(list2);


        for (int i = 0; i < list2.length; i++){
            System.out.println(list2[i] + " ");
            
        }
    }
    
    public static void heapsorting(int length){}
    
    
    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<E>();
        
        for (int i = 0;i < list.length; i++){
            heap.add(list[i]);
        }
        
        for (int i = list.length - 1; i >= 0; i--){
            list[i] = heap.remove();
        }
    }
    
}
