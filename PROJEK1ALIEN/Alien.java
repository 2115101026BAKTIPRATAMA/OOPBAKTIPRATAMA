import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Alien (){
        setRotation(180);
        //getWorld().addObject(new Alien() , Greenfoot.getRandomNumber(595),1);
    }
    
    public Alien (int speed){
        setRotation(180);
        this.speed=speed;
    }
    
    public int speed = 2;
    
    public void act()
    {
        // Add your action code here.
        //move(speed);
        //setLocation(getX()-1,getY());
        move(2);
        if(isAtEdge()){
            getWorld().removeObject(this);
            //   setLocation(595,Greenfoot.getRandomNumber(getWorld().getWidth()));
        }
        
    }
    
    
    
    
}

