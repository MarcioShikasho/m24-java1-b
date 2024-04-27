import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Marcio
 * @version 20-04-2024
 */
public class Mosca extends Inseto
{
    /**
     * Método act é executado sempre que apertarmos o botão Act ou 
     * ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        verificarCanto();
    }
}
