package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = entrada.nextLine();
		//Utilizando o Scanner para separar os nomes
		
		//passando a entrada para o nome
		Scanner entrada1 = new Scanner(nomeCompleto);
		//utilizando o While
		String primeiroNome="", ultimoNome="";
		while (entrada1.hasNext()) {
			ultimoNome = entrada1.next();
			if(primeiroNome.equals("")) {
				primeiroNome = ultimoNome;
			}
		}
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Último nome: " + ultimoNome);
		
		entrada.close();
		entrada1.close();
	}
}
