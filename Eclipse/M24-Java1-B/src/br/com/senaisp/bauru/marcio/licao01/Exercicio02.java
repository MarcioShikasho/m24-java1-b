package br.com.senaisp.bauru.marcio.licao01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		String nome;
		//Mostrando a mensagem para o usuário
		System.out.println("Digite seu nome completo: ");
		nome = entrada.nextLine();
		//Vamos separar nome de sobrenome
		String primeiroNome = nome.substring(0, (nome + " ").indexOf(" "));
		//pegar o último sobrenome
		String lastName = nome.substring(nome.lastIndexOf(" ") +1);
		
		System.out.println(primeiroNome);
		System.out.println(lastName);
		entrada.close();
	}

}
