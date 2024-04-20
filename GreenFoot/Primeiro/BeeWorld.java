import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author Marcio 
 * @version 2024-04-20
 */
public class BeeWorld extends World
{

    /**
     * Construtor da classe BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abelha abelha = new Abelha();
        addObject(abelha,55,60);
        Aranha aranha = new Aranha();
        addObject(aranha,92,335);
        Mosca mosca = new Mosca();
        addObject(mosca,545,179);
    }
}
