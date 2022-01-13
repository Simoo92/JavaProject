package model;

public class Cliente {
	
	private String nome;
	private String cognome;
	private int et�;
	
	public Cliente(String nome, String cognome, int et�) {
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
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

	public int getEt�() {
		return et�;
	}

	public void setEt�(int et�) {
		this.et� = et�;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", et�=");
		builder.append(et�);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
