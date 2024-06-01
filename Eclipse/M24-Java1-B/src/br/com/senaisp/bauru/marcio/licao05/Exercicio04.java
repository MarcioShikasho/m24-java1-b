package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma data no formato dd/mm/aaaa: ");
		String linha = entrada.nextLine();
		Scanner entrada2 = new Scanner(linha);
		entrada2.useDelimiter("/");
		int dia = entrada2.nextInt();
		int mes = entrada2.nextInt();
		int ano = entrada2.nextInt();
		boolean valido = true;
		switch (mes) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia < 1 || dia > 31) {
				valido = false;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia < 1 || dia > 30) {
				valido = false;
			}
			break;
		case 2:
			if (dia < 1 || dia > 28) {
				valido = false;
			} else if (dia == 29 && ano % 4 != 0) {
				//condições do ano bisexto:
				//ano divisivel por 4, exceto
				//não pode ser divisivel por 100, exceto
				//divisivel por 400
				valido = false;
			} else if (dia == 29 && ano % 4 == 0 && ano % 100 == 0 && ano % 400 != 0) {
				valido = false;
			}
			break;
		default: System.out.println("Mês inválido!!!");
		valido = false;
		}//fim do switch
		if (valido) {
			System.out.println("Data é válida!");
		}else {
			System.out.println("Data é inválida!");
		}
		entrada.close();
	}

}
