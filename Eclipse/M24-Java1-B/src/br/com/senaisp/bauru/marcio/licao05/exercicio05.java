package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Forca forca1 = new Forca();
		forca1.mostrarForca();
		
		String palavra = "";
		while (!forca1.isTerminado()) {
			System.out.println("Digite uma letra: ");
			palavra = entrada.nextLine();
			if (!forca1.verificaLetra(palavra.charAt(0))) {
				System.out.println("Letra não encontrada!!!");
			}
			forca1.mostrarForca();
		}
		entrada.close();
		System.out.println("A palavra secreta era " + forca1.mostrarPalavra());
	}
}
