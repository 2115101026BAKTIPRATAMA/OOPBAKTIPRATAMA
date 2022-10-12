import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage robotimage3;
    private int lives;
    private int pizzaEaten;
    private int score;
    int timer = 1000;
    int MAXTIMER = 2000;
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Robot(){
         robotimage1= new GreenfootImage("man01.png");
         robotimage2= new GreenfootImage("man02.png");
         robotimage3= new GreenfootImage("gameover.png");
         animate();
         lives = 3;
         pizzaEaten = 0;
    }
    
    public void animate(){
    if(getImage()==robotimage1)
        setImage(robotimage2);
    else    
        setImage(robotimage1);
    }
    
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
        updateTimer();
        
        
    }
    
    public void robotMovement()
    {
    animate();
    if (Greenfoot.isKeyDown("w")){
           setLocation(getX(),getY()-5);
        }
    if (Greenfoot.isKeyDown("s")){
           setLocation(getX(),getY()+5);
        }
    if (Greenfoot.isKeyDown("d")){
           setLocation(getX()+5,getY());
        }
    if (Greenfoot.isKeyDown("a")){
           setLocation(getX()-5,getY());
        }
    }
    
    public void detectWallCollision()
    {
    if(isTouching(Wall.class)){
            //setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
      
    
    public void detectBlockCollision()
    {
    if(isTouching(Blok.class)){
            //setLocation(48,50); 
            
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }    
    }
    public void detectHome(){
        if(isTouching(Home.class) && pizzaEaten == 5){
            setLocation(48,50);
            
            Greenfoot.playSound("yipee.wav");
            //Greenfoot.stop();
            pizzaEaten =0;
            increaseScore();
            
            RobotWorld RobotWorld = (RobotWorld)getWorld();
            RobotWorld.increaseLevel();
                       
            //getWorld().addObject(new Pizza(), Greenfoot.getRandomNumber(getWorld(). getWidth()),
                                              //Greenfoot.getRandomNumber(getWorld(). getHeight()));
        }
    }
    
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            timer = timer + 200;
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
            
        }
    }
    
    public void removeLife(){
        showStatus();
        //increaseScore();
        updateTimer();
        lives--;
        if (lives == 0  ){
           testEndGame();
           setImage(robotimage3);
        }
        resetPosition();
        
        
    }
    
    public void testEndGame(){
        Greenfoot.stop();
        
    }
    
    public void increaseScore(){
    score++;
    showStatus();
    }
    
    public void showStatus(){
        getWorld().showText("pizzaEaten : " + pizzaEaten,71, 527);
        getWorld().showText("lives : " + lives,71, 554);
        getWorld().showText("score : " + score,71, 581);
    }
    
    public void updateTimer(){
        timer--;
        if (timer == 0 ){
            lives--;
            resetTimer();
            
            
        }else if (lives == 0){
        testEndGame();
        setImage(robotimage3);
        }
        getWorld().showText("timer : " + timer,60, 10);
    }
    
    public void resetPosition(){
        setLocation(48,50);
    }
    
    public void resetTimer(){
        resetPosition();
        timer = 1000;
    }
    
}
