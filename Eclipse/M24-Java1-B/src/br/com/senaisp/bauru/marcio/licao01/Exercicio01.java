package br.com.senaisp.bauru.marcio.licao01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//solicitar a entrada via teclado pelo usuário
		System.out.println("Digite a quantidade de galões: ");
		galoes = entrada.nextDouble();
		entrada.close();
		
		
		//fazendo as contas
		litros = galoes*gal2lt;
		//mostrar resultado
		System.out.println(galoes + " Galões equivalem a " + litros + " litros");
		
	}
}
