package model;

public class Studente {

	private static int contatore = 1;
	private int matricola;
	private String nome;
	private String cognome;

	// public Studente () {} costruttore di default

	public Studente(String nome, String cognome) {
		this.matricola = contatore++;
		this.nome = nome;
		this.cognome = cognome;
	}

//	public Studente(int matricola, String nome) {
//		this.nome = nome;
//		this.matricola = matricola;
//	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "" + matricola + ")" + nome + " " + cognome;
	}

}
