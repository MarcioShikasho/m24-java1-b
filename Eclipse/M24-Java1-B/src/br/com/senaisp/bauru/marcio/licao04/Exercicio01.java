package br.com.senaisp.bauru.marcio.licao04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavraSecreta = "java";
		
		System.out.println("Digite uma letra:");
		String letra = entrada.next();
		
		if (palavraSecreta.indexOf(letra.charAt(0)) > -1) {
			System.out.println("A palavra contém a letra " + letra + "\" que digitou na posição " + palavraSecreta.indexOf(letra.charAt(0)));
		}
		
		entrada.close();
	}

}
