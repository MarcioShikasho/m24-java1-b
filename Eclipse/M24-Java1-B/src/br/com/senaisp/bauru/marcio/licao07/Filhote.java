package br.com.senaisp.bauru.marcio.licao07;

public class Filhote {
	
	private static int nSeq = 0;
	private int id;
	private String nome;
	
	//Constructor
	public Filhote(String nome) {
		id = ++nSeq;
		this.nome = nome;
	}
	
	//Getters e Setters

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
