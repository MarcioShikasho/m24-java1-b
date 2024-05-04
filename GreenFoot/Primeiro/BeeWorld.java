import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author Marcio 
 * @version 2024-04-20
 */
public class BeeWorld extends World
{
    //Campos e Fields
    private Abelha abelha = null;
    
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
        abelha = new Abelha();
        addObject(abelha,55,60);
        Aranha aranha = new Aranha();
        addObject(aranha,92,335);
        
        //utilizando o laço FOR para criar as moscas
        for (int i = 0; i < 20; i++) {
            int pX = Greenfoot.getRandomNumber(getWidth());
            int pY = Greenfoot.getRandomNumber(getHeight());
            int vel = Greenfoot.getRandomNumber((5) + 1);
            int ang = Greenfoot.getRandomNumber(360);
            addObject(new Mosca(vel, ang), pX, pY);
        }
        abelha.setLocation(56, 60);
    }
    /**
     * Getter para obter a instância da abelha no mundo.
     */
    public Abelha getAbelha(){
        return abelha;
    }
}
