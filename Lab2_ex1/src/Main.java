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
        Student st1 = new Student();
        
        st1.setSurname("Katsilidis");
        st1.setName("Nikos");
        st1.setAM("321/2014081");
        
        st1.printStudent();
    }
    
}
