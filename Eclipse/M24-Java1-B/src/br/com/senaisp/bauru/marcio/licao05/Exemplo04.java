package br.com.senaisp.bauru.marcio.licao05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(Exemplo04.class.getResourceAsStream("dados.cvs"));
		
		String linha = entrada.nextLine();
		Scanner entrada2 = new Scanner(linha);//Linha do cabeçalho
		entrada2.useDelimiter(";");//Colocando como delimitador do next o ponto e vírgula (;), eis que o padrão é o espaço em branco
		//Usando laço de repetição para impressão do cabeçalho
		while (entrada2.hasNext()) {
			System.out.print(entrada2.next() + "\t\t");
		}
		//fechando o scanner da linha
		System.out.println();
		entrada2.close();
		
		//percorrendo os itens do arquivo
		while (entrada.hasNext()) {
			linha = entrada.nextLine();
			entrada2 = new Scanner(linha);
			entrada2.useDelimiter(";");
			while (entrada2.hasNext()) {
				System.out.print(entrada2.next() + "\t\t");
			}
			System.out.println();//pulando linha
			entrada2.close();//fechando a linha
		}
		entrada.close();
	}
}
