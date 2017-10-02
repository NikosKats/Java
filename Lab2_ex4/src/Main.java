/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikoskatsilidis
 */

import java.util.Random;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Dhmiourgia tuxaias timhs sto diasthma [20,50]
        
        
        int max = Integer.MIN_VALUE;
        
        System.out.println("The 10 random numbers in range [20,50] are: ");
        
        for(int i = 0;i<10;i++)
        {
            int random = (int)(Math.random()*31)+20;
            System.out.println(random);
            
            if(random>max)
                max = random;
        }
        
        System.out.println("The max number is: " + max);
    }
    
}
