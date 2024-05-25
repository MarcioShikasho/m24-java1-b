package br.com.senaisp.bauru.marcio.licao04;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
	String nome1 = entrada.next();
	//String nome1 = "marcio";
	String nome2 = "marcio";
	//comparando endereços de memória quando é OBJETO
	if (nome1 == nome2) {
		System.out.println("São iguais");
	}else {
		System.out.println("São diferentes");
	}
	
	if (nome1.equals(nome2)) {
		System.out.println("São iguais no conteúdo");
	}else {
		System.out.println("São diferentes no conteúdo");
	}
	//nome1 > nome2
	if(nome1.compareTo(nome2) > 0) {
		System.out.println("nome1 é maior que nome2");
	}
	//nome1 < nome2
	if(nome1.compareTo(nome2) < 0) {
		System.out.println("nome1 é menor que nome2");
	}
	//nome1 = nome2
	if(nome1.compareTo(nome2) == 0) {
		System.out.println("nome1 é igual ao nome2");
	}
	}

}
