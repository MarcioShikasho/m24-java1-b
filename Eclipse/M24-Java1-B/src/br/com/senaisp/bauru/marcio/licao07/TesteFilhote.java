package br.com.senaisp.bauru.marcio.licao07;

public class TesteFilhote {

	public static void main(String[] args) {

		Filhote f1 = new Filhote("Filhote 1");
		Filhote f2 = new Filhote("Filhote 2");
		Filhote f3 = new Filhote("Filhote 3");
		
		//mostrando o nome e o id dos filhotes
		System.out.println(f1.getId() + "-" + f1.getNome());
		System.out.println(f2.getId() + "-" + f2.getNome());
		System.out.println(f3.getId() + "-" + f3.getNome());
	}

}
