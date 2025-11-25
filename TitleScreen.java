import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Adeline Lai 
 * @version November 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, 241, 107);
        prepare();
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,479,87);
        elephant.setLocation(456,284);
        elephant.setLocation(517,98);
        elephant.setLocation(454,87);
        elephant.setLocation(488,98);
        elephant.setLocation(445,87);
        elephant.setLocation(445,87);
        elephant.setLocation(462,96);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,336,302);
        label.setLocation(269,306);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,328,249);
        label2.setLocation(313,230);
        label2.setLocation(286,231);
        label2.setLocation(277,251);
        label2.setLocation(312,208);
        label2.setLocation(334,221);
        label2.setLocation(296,213);
        label2.setLocation(285,213);
        label.setLocation(381,272);
        label.setLocation(277,256);
        label.setLocation(281,279);
        label2.setLocation(275,250);
        label2.setLocation(351,216);
        label2.setLocation(283,222);
        label.setLocation(384,272);
        label.setLocation(284,276);
        label2.setLocation(357,229);
        label2.setLocation(286,225);
        label.setLocation(250,289);
        label.setLocation(250,289);
        label.setLocation(246,288);
        label.setLocation(283,272);
    }
}
