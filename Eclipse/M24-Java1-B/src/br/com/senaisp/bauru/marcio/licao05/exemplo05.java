package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class exemplo05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println((idade > 17 ? "Você é maior de idade" : "Você é menor de idade"));
		
		entrada.close();
	}

}
