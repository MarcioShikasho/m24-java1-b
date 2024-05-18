package br.com.senaisp.bauru.marcio.licao02;

import javax.management.RuntimeErrorException;

public class Estudante {
	// atributos ou variáveis
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEstudo;

	// constructors
	// constructor padrão
	public Estudante() {
		id = 0;
		nome = "sem nome";
		documento = "sem documento";
		media = 0.0f;
		fumante = false;
		bolsaEstudo = 0.0;
	}
	// constructor personalizado
	public Estudante(int id, String nome, String documento, float media, boolean fumante, double bolsa) {
		setId(id);
		setNome(nome);
		setDocumento(documento);
		setMedia(media);
		setFumante(fumante);
		setBolsaEstudo(bolsa);
	}

	// getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 2) {
			throw new RuntimeException("Nome deve ter pelo menos dois caracteres");
		}
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public double getBolsaEstudo() {
		return bolsaEstudo;
	}

	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}


	// Métodos
	@Override
	public String toString() {
		return " id= " + id + ",\n nome= " + nome + ",\n documento= " + documento + ",\n media= " + media + ",\n fumante= "
				+ fumante + ",\n bolsaEstudo= " + bolsaEstudo;
	}
	
}
