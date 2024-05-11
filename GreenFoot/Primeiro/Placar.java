import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que vai representar o placar no jogo BeeWorld
 * 
 * @author Marcio   
 * @version 2024-05-11
 */
public class Placar extends Actor
{
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    //Construtor
    public Placar(){
       texto = "Score = 0";
       tamanhoTexto = 20;
       corFonte = Color.BLUE;
       atualizarImagem();
    }
    //Getters Setters
    public String getTexto(){
        return texto;
    }
    
    public void setTexto(String value){
        texto = value;
        atualizarImagem();
    }
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void atualizarImagem(){
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(), tamanhoTexto);
        img.setColor(corFonte);
        img.setFont(new Font("Arial", true, false, tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img);
    }
}
