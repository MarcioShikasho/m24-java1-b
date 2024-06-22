package br.com.senaisp.bauru.marcio.licao07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {	
	public static int lerInteiro(Scanner entrada, String mensagem, int faixaInicial, int faixaFinal) {
		int ret = 0;
		
		do {
			System.out.println(mensagem); 
			try {
				ret = entrada.nextInt();
				if (ret<faixaInicial || ret > faixaFinal) {
					System.out.println("Valor fora das faixas iniciais e finais! Redigite!");
				}
			} catch (InputMismatchException e) {
				ret = faixaInicial - 1;
				System.out.println("Valor inválido!!! Redigite!");
				entrada.nextLine();
			}
		}while(ret < faixaInicial || ret > faixaFinal);
		
		
		return ret;
	}
}
