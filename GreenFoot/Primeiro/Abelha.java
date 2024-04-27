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
        
        verificarPosicao();
        
        capturaMosca();
    }
    /**
     * Método que verifica se está na direita do mundo
     */
    
    public boolean isNaDireita(){
        if (getX() > getWorld().getWidth() - 10){
            return true;
        } 
        return false;
    }
    /**
     * Método que verifica se está na esquerda do mundo
     */
    
    public boolean isNaEsquerda(){
        return (getX() < 10);
    }
    /**
     * Método que verifica se está na base do mundo
     */
    
    public boolean isNaBase(){
        return (getY() > getWorld().getHeight() -10);
    }
        /**
     * Método que verifica se está no topo do mundo
     */
    
    public boolean isNoTopo(){
        return (getY() < 10);
    }
    /**
     * Método que veririca se a Abelha está nos cantos e reposiciona ela
     */
    public void verificarPosicao(){
        //verificando se está na direita
        if (isNaDireita()){
            setLocation(10, getY());
        } 
        //Verifica se está na esquerda
        if (isNaEsquerda()){
            setLocation(getWorld().getWidth() -10, getY());
        }
        //Verifica se está no topo
        if (isNoTopo()) {
            setLocation(getX(), getWorld().getHeight() - 10);
        }
        //Verifica se está na base
        if (isNaBase()) {
            setLocation(getX(), 10);
        }
    }
    /**
     * Método que captura a mosca
     */
    public void capturaMosca(){
        if (isTouching(Mosca.class)){
            //removendo a mosca
            removeTouching(Mosca.class);
            //adicionando nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
}
