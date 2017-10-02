/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikoskatsilidis
 */
public class Student {
    private String surname;
    private String name;
    private String AM;
    
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAM(String AM)
    {
        this.AM = AM;
    }
    
    public String getAM()
    {
        return AM;
    }
    
    void printStudent()
    {
        System.out.println("Surname: " + surname + " Name: " + name + " AM: " + AM);
    }
    
}
