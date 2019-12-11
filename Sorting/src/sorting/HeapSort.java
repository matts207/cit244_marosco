/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Random;
import static java.util.Collections.list;

/**
 *
 * @author marosco
 */
public class HeapSort {
    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<E>();
        
        for (int i = 0;i < list.length; i++){
            heap.add(list[i]);
        }
        
        for (int i = list.length - 1; i >= 0; i--){
            list[i] = heap.remove();
        }
    }
    
    public static void main(String[] args) {
        int length = 1000000;
        Random ran = new Random();
        Integer[] list2 = new Integer[length];
        for (int i = 0;i < length; i ++){
            list2[i] = ran.nextInt(100000000);
        }
        heapSort(list2);
        for (int i = 0; i < list2.length; i++){
            System.out.println(list2[i] + " ");
        }
    }
}
