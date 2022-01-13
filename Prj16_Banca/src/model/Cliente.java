package model;

import java.time.LocalDate;
import java.time.ZoneId;

public class Cliente {
	
	private String nome;
	private String cognome;
	private int et�;
	private LocalDate dataNascita;
	
	public Cliente(String nome, String cognome, String data) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = LocalDate.parse(data);
		
		
		LocalDate stop = LocalDate.now(ZoneId.of("Europe/Rome"));
		long years = java.time.temporal.ChronoUnit.MONTHS.between(dataNascita, stop);
		
		
		this.et� = (int) years;
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
		builder.append("Cliente nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", et�=");
		builder.append(et�);
		
		
		return builder.toString();
	}
	
	
	
	

}
