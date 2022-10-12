import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * Gede Bakti Pratama Putra_2115101026 
     * 
     */
        int currentMaxTurnSpeed = 2;
        int currentLevel = 1;
    public RobotWorld()
    {    

        super(800, 600, 1);
        prepare();
    }
    
    /**
     * 
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Robot(),48,50);
        //addObject(new Wall(),48,50);
        addObject(new Wall(),52,147);
        addObject(new Wall(),200,432);
        addObject(new Wall(),251,432);
        addObject(new Wall(),10,432);
        addObject(new Wall(),266,147);
        addObject(new Wall(),230,147);
        addObject(new Wall(),266,255);
        addObject(new Wall(),593,275);
        addObject(new Wall(),593,0);
        addObject(new Wall(),592,182);
        addObject(new Wall(),791,147);
        addObject(new Wall(),52,230);
        addObject(new Blok(2),529,430);
        addObject(new Blok(1),427, 145);  
        addObject(new Home(),751, 552);
        addObject(new ScorePanel(),71, 554);
        addObject(new Pizza(),720, 46);
        addObject(new Pizza(),433, 38);
        addObject(new Pizza(),183, 302);
        addObject(new Pizza(),682, 312);
        addObject(new Pizza(),417, 537);

        //295,255
    }
    
    public void setUpLevel()
    {
         if(currentLevel==2){
         currentMaxTurnSpeed = 2;    
         addObject(new Blok(2),427, 145);    
        addObject(new Pizza(),720, 46);
        addObject(new Pizza(),433, 38);
        addObject(new Pizza(),183, 302);
        addObject(new Pizza(),682, 312);
        addObject(new Pizza(),417, 537);    
             
         }else if (currentLevel==3){
             currentMaxTurnSpeed = 3;    
         addObject(new Blok(3),427, 145);    
        addObject(new Pizza(),720, 46);
        addObject(new Pizza(),433, 38);
        addObject(new Pizza(),183, 302);
        addObject(new Pizza(),682, 312);
        addObject(new Pizza(),417, 537);
         }else if (currentLevel==4){
             currentMaxTurnSpeed = 4;    
         addObject(new Blok(4),427, 145);    
        addObject(new Pizza(),720, 46);
        addObject(new Pizza(),433, 38);
        addObject(new Pizza(),183, 302);
        addObject(new Pizza(),682, 312);
        addObject(new Pizza(),417, 537);
    }
    }
    
    public void increaseLevel(){
        currentLevel++;
        setUpLevel();
        
    }
     
}
