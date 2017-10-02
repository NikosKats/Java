/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikoskatsilidis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock clk1 = new Clock();
        Clock clk2 = new Clock(2,56,34);
        Clock clk3 = new Clock(23,43);
        Clock clk4 = new Clock(12);
        
        clk1.display_Clock();
        clk2.display_Clock();
        clk3.display_Clock();
        clk4.display_Clock();
    }
    
}
