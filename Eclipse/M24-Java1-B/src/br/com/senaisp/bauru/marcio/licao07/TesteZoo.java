package br.com.senaisp.bauru.marcio.licao07;

public class TesteZoo {

	public static void main(String[] args) {
		Mamifero mam = new Gato();
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
		((Gato) mam).setQuadrupede(true);
		mam.falar();
		System.out.println(mam.toString());
	}

}
