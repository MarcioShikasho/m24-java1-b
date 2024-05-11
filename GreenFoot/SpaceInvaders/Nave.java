import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a nave do jogo
 * 
 * @author Marcio 
 * @version 2024-04-27
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // movimentação da nave
        if (Greenfoot.isKeyDown("left")){
            move(-1);
        }
        if (Greenfoot.isKeyDown("right")){
            move(1);
        }
        //Verificando se foi clickado a barra de espaço, se sim, criamos a ela
        if (Greenfoot.isKeyDown("space")){
            //getWorld().addObject(new Bala(), getX(), getY() - 45);
            ((SpaceInvadersWorld) getWorld()).criarBala(getX(), getY() - 45);
        }
    }
    
    
}
