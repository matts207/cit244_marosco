
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matts207
 */
public class MarkProject {
    
    public static int money =0;
    public static int answer;
    public static int input;
    
    public static void run(){
    for(int i = 0; i<20;i++){
        
        Random ran = new Random();
        int l = ran.nextInt(10);
        System.out.println(l);
        
        if(input == answer){
            money += 50;
        }
        else{
            money -= 50;
        }
        
    }
    
    
    }
    public static void main(String[] args) {
        run();
    }
    
}
