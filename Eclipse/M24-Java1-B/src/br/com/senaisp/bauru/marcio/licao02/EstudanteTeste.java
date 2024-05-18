package br.com.senaisp.bauru.marcio.licao02;

public class EstudanteTeste {

	public static void main(String[] args) {
		Estudante e1 = new Estudante();
		e1.setNome("Marcio");
		e1.setId(1);
		e1.setMedia(5.5f);
		
		System.out.println("Nome: " + e1.getNome());
		
		System.out.println(e1.toString());
		
		Estudante e2 = new Estudante(2, "Gabi", "123456789", 8.5f, false, 20.0);
		
		System.out.println("\n" + e2.toString());
	}

}
