import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Marcio 
 * @version 20-04-2024
 */
public class Abelha extends Actor
{
    //Constantes
    public static final int PONTOS = 100;
    //Campos ou Fields
    public int vidas = 0;
    public int score = 0;
    public int imgIdx = 0;
    //criando campo do tipo conjunto de imagens
    private GreenfootImage[] imagens;
    //Construtores
    public Abelha(){
        vidas = 3;
        score = 0;
        //definir tamanho do conjunto
        imagens = new GreenfootImage[4];
        //definir as imagens
        for (int i = 0; i < 4; i++){
            imagens[i] = new GreenfootImage("bee0" +(i + 1) + ".png");
        }
    }
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
        
        caputaradaPelaAranha();
        
        mostrarVidas();
        
        //mostrarScore();
        
        trocarImagem();
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
            //Greenfoot.playSound("slurp.wav");
            //removendo a mosca
            removeTouching(Mosca.class);
            //aumentar o score
            //score += PONTOS;
            //colocando o score do mundo
            ((BeeWorld) getWorld()).addScore(PONTOS);
            //adicionando nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
    /**
     * Método que irá capturar a abelha pela Aranha
     */
    public void caputaradaPelaAranha(){
        if (isTouching(Aranha.class)){
            //Greenfoot.playSound("ouch.wav");
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            vidas--;
            if (vidas < 1){
                Greenfoot.stop();
                getWorld().showText("Game Over", 400,300);
            }
        }
    }
    
    public void mostrarVidas(){
        getWorld().showText("Vidas: "+ vidas, 60, 20);
    }
    
    public void mostrarScore(){
        getWorld().showText("SCORE: " + score, 700, 20);
    }
    /**
     * Método que vai trocar a imagem da abelha, parecendo que a abelha está movimentando as asas
     */
    public void trocarImagem(){
        setImage(imagens[imgIdx]);
        imgIdx = (imgIdx + 1) % 4;
        /**imgIdx++;
        if(imgIdx >= 4){
            imgIdx = 0;
        }
        */
    }
}
