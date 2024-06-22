package br.com.senaisp.bauru.marcio.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Digite um valor: ");
			int valor01 = entrada.nextInt();
			System.out.println("Digite outro valor: ");
			int valor02 = entrada.nextInt();
			
			//calculando
			int valor03 = valor01 / valor02;
			System.out.println("Resultado: " + valor03);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma divisão por 0");
		} catch (InputMismatchException e) {
			System.out.println("Digitar somente números inteiros!");
		}
		
		entrada.close();
	}	

}
