package br.com.senaisp.bauru.marcio.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.senaisp.bauru.marcio.licao07.Utils;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor01, valor02;
		//Garantindo a entrada do primeiro valor
		do {
			System.out.println("Digite o primeiro valor: ");
			try {
				valor01 = entrada.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("O valor deve ser inteiro!");
				entrada.nextLine(); //captura do enter
				valor01 = 0;				
			}
		}while(valor01 <= 0);
		valor02 = Utils.lerInteiro(entrada, "Digite o segundo valor", 1, Integer.MAX_VALUE);
		
		int valor03 = valor01/valor02;
		
		System.out.println("Resultado: " + valor03);
		entrada.close();
	}
}
