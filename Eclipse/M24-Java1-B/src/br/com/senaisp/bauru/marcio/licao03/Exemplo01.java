package br.com.senaisp.bauru.marcio.licao03;

public class Exemplo01 {
	public static int idade = 18;
	public static void main(String[] args) {
		byte vByte = 127;
		vByte++; //aqui ocorre o estouro do limite do byte = 127
		System.out.println(vByte); //mostra o limite inferior máximo = -128
		
		float vFloat = 600000f; //precisa colocar o "f" ao final para dizer que o valor é um float
		if (vByte == -128) {
			String nome = "Marcio";
			System.out.println("meu nome é: " + nome);
		}
		//aqui não existe a variável nome
		//System.out.println(nome);
		
		//alterando a variável idade 
		idade = 20;
		System.out.println(idade);
		int idade = 30;
		System.out.println(idade);
		idade += 20;
		System.out.println(idade);
	}

}
