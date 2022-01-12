package model;
				
public class Studente {

	
	private int nMat;
	private String nome;
	private String cognome;
	
	private static int matricolatore = 1; // static: appartiene alla classe
	
	
	
	
	public Studente(String nome, String cognome) {
		super();
		this.nMat = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
	}


	public int getnMat() {
		return nMat;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	//Classe che costruisce stringhe per creare string dinamica
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Studente [nMat=");
		builder.append(nMat);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
