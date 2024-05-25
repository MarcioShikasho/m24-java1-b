package br.com.senaisp.bauru.marcio.licao03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos calcular a área de um triângulo.\nComece digitando a base do triângulo: ");
		float base = entrada.nextFloat();
		System.out.println("Agora digite a altura do triângulo: ");
		float altura = entrada.nextFloat();
			
		float area = (base * altura) / 2;
		System.out.println("A área do seu triângulo é de: " + area + "m²");
		entrada.close();
	}

}
