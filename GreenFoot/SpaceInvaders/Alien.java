import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Classe que representa o alien
 * 
 * @author Marcio 
 * @version 2024-04-27
 */
public class Alien extends Actor
{
    public int pX = 1;
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // movimentação do Alien
        move(pX);
        
        if (isAtEdge()){
            pX *= -1;
        }
    }
}
