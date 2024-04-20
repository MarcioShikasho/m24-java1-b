import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Marcio 
 * @version 20-04-2024
 */
public class Abelha extends Actor
{
    /**
     * Método que será executado quando apertado o botão Act.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        // Se teclar para a esquerda, gira -10º.
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        // Se teclar para a direita, gira -10º.
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }
}
