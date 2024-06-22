package br.com.senaisp.bauru.marcio.licao07;

public class Cachorro extends Mamifero {
	private boolean quadrupede;

	//construtor
	
	//getters e setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	//métodos
	public void falar() {
		System.out.println("Au AU AU!");
	}
	
	@Override
	public String toString() {
		return super.toString()+
				"Quadrupede: " + quadrupede + "\n";
		
	}
}
