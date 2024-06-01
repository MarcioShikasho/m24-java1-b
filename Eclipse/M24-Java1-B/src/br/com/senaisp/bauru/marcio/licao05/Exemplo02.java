package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 3 valores separados por espaço");
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		int valor3 = entrada.nextInt();
		System.out.println("Seus valores são: ");
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		
		entrada.close();
	}

}
