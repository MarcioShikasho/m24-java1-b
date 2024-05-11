import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a Bala no jogo
 * 
 * @author Marcio
 * @version 2024-04-27
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Movimento da bala
        setLocation(getX(), getY() - 5);
        //remoção do Alien
        removerAlien();
        //remoção da bala
        if (isAtEdge()){
            //getWorld().removeObject(this);
            ((SpaceInvadersWorld) getWorld()).removerBala();
        }
    }
    /**
     * metódo que verifica se a bala atingiu o alien e remove este caso foi atingido.
     */
    public void removerAlien(){
        if (isTouching(Alien.class)){
            removeTouching(Alien.class);
            //criando um novo Alien
            getWorld().addObject(new Alien(), Greenfoot.getRandomNumber(getWorld().getWidth()), 50);
        }
    }
}
