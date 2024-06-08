package br.com.senaisp.bauru.marcio.licao05;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	private String palavraSecreta;
	private int erros;
	private String visualizacao;
	
	public Forca() {
		palavraSecreta = sortearPalavra();
		erros = 0;
		visualizacao = "";
		//carregar os traços na visualização
		int i = 0;
		while (i < palavraSecreta.length()) {
			visualizacao += "-";
			i++;
		}
	}
	
	private String sortearPalavra() {
		Scanner entrada = new Scanner(Forca.class.getResourceAsStream("palavras.txt"));
		Random random = new Random();
		int linSort = random.nextInt(180) + 1;
		int lin = 0;
		String retorno = "";
		while (entrada.hasNextLine()) {
			lin++;
			String linha = entrada.nextLine();
			if (lin == linSort) {
				retorno = linha;
				break; //forçando saida do while
			}
		}
		entrada.close();
		return retorno;
	}
	
	public void mostrarForca() {
		String linhaSuperior = (erros == 0 ? "   " :
								erros == 1 ? " O " :
								erros == 2 ? "\\O " :
								erros > 2 ? "\\O/" : " ");
		String linhaBody = erros >= 4 ? " |" : " ";
		String linhaInferior =  erros == 5 ? "/  " :
								erros >= 6 ? "/ \\" : " ";
		System.out.println(" +-----+");
		System.out.println(" |    " + linhaSuperior);
		System.out.println(" |    " + linhaBody);
		System.out.println(" |    " + linhaInferior);
		System.out.println(" |");
		System.out.println(" +========");
		System.out.println();
		System.out.println(visualizacao);
	}
	
	public boolean verificaLetra(char letra) {
		boolean retorno = false;
		if (palavraSecreta.indexOf(letra) > -1) {
			int i = 0;
			String apoio = "";
			while (i < palavraSecreta.length()) {
				if (palavraSecreta.charAt(i) == letra) {
					apoio += "" + letra;
				}else {
					apoio += "" + visualizacao.charAt(i);
				}
				i++;
			}
			visualizacao = apoio;
			retorno = true;
		}else {
			erros++;
		}
		return retorno;
	}
	public boolean isTerminado() {
		return erros >= 6 || visualizacao.indexOf('-') == -1;
	}
	
	public String mostrarPalavra() {
		return palavraSecreta;
	}
}
