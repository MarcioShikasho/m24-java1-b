package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		entrada.nextLine();//Para capturar o enter da entrada numérica acima
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua cidade:");
		String cidade = entrada.nextLine();
		
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade);
		entrada.close();
	}

}
