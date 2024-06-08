package br.com.senaisp.bauru.marcio.licao06;

public class Carta {
	public static final String [] NAIPES = {"♦", "♠", "♥", "♣"};
	public static final String [] NUMEROS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String naipe;
	private String numero;
	
	//construtor
	public Carta (int np, int valor) {
		if (np < 1 || np > 4) {
			System.out.println("Naipe Inválido!");
		}
		if (valor < 1 || valor > 13) {
			System.out.println("Número da carta inválido!");
		}
		naipe = NAIPES[np -1];
		numero = NUMEROS[valor -1];
	}

	@Override
	public String toString() {
		String txt = "┌───────┐\n"+
					 "│##     │\n"+
					 "│   &   │\n"+
					 "│     ##│\n"+
					 "└───────┘\n";
		txt = txt.replaceFirst("##", numero);
		txt = txt.replace("&", naipe);
		txt = txt.replaceFirst("##", numero);		
		return txt;
	}
	
	
}
