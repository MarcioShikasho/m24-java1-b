package br.com.senaisp.bauru.marcio.licao07;

public class Gato extends Mamifero {
	private boolean quadrupede;

	//getters e setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	//métodos
	@Override
	public void falar() {
		System.out.println("Miau!");
	}
}
