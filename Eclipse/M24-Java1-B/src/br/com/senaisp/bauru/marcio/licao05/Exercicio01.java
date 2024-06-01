package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o operando 1: ");
		int valor1 = entrada.nextInt();
		entrada.nextLine();//captura do enter
		System.out.println("Digite a operação: ");
		String operacao = entrada.nextLine();
		System.out.println("Digite o operando 2: ");
		int valor2 = entrada.nextInt();
		
		//verificando as operações
		int valor = 0;
		if (operacao.equals("+")) {
			valor = valor1 + valor2;
		}else if (operacao.equals("-")) {
			valor = valor1 - valor2;
		}else if (operacao.equals("/")) {
			valor = valor1 / valor2;
		}else if (operacao.equals("*")) {
			valor = valor1 * valor2;
		}else {
			System.out.println("Operação inválida");
		}
		System.out.println("Resultado: " + valor);
		entrada.close();
	}
}
