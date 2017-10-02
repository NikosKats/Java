/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikoskatsilidis
 */
public class Clock {
    private int hours, minutes, seconds;
    
    public Clock() { // default constructor hours = 0;
        minutes = 0;
        seconds = 0; 
    }
    
    public Clock (int h, int min, int sec) 
    { /* overloaded constructor*/
        if ((sec >= 0) && (sec < 60) && (min >= 0) && (min < 60) && (h >= 0) && (h < 24))
        {
            hours = h;
            minutes = min;
            seconds = sec;
        }
        else 
        {
            hours = 0;
            minutes = 0;
            seconds = 0;
        } 
    }
    
    public Clock(int h)
    {
        if ((h >= 0) && (h < 24))
        {
            hours = h;
            minutes = 0;
            seconds = 0;
        }
        else
        {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }
    
    public Clock(int h,int m)
    {
        if ((h >= 0) && (h < 24) && (m >= 0) && (m < 60))
            {
                hours = h;
                minutes = m;
                seconds = 0;
            }
        else
        {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }
    
    public void display_Clock() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    } 
}
