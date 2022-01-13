package model;

public class Cliente {
	
	private String nome;
	private String cognome;
	private int età;
	
	public Cliente(String nome, String cognome, int età) {
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
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

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", età=");
		builder.append(età);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
