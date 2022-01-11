package model;

public class Babbo {

	private String nome;
	private Sacco sacco;

	public Babbo(String nome) { //il costruttore istanzia una classe e da dei valori

		this.nome = nome; //this prende attributo nome e lo assegna al nome
	}

	public Sacco getSacco() {
		return sacco;
	}

	public void setSacco(Sacco sacco) {
		this.sacco = sacco;
	}

	public String getNome() {
		return nome;
	}

	
}
