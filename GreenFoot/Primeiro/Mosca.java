import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Marcio
 * @version 20-04-2024
 */
public class Mosca extends Inseto
{
    //campo
    private int velocidade;    
    //Construtor padrão (não recebe parâmetros)
    public Mosca(){
        velocidade = 1;
    }
    //contrutor personalizado com sobrecarga de método
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang); //colocando no angulo que eu passar
    }
    /**
     * Método act é executado sempre que apertarmos o botão Act ou 
     * ficará em execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();
    }
}
