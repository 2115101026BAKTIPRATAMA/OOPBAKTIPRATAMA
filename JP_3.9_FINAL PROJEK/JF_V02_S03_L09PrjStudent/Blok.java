import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blok extends Actor
{
    /**
     * Act - do whatever the Blok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int turnspeed;
    
    public Blok(int maxturnspeed)
    {
        turnspeed=(Greenfoot.getRandomNumber(maxturnspeed)+1);
        if(turnspeed ==0){
            turnspeed = 1;
        }
    }
    public void act()
    {
        turn(turnspeed);
        
        // Add your action code here.
    }
}
