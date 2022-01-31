package model;

import java.time.LocalDateTime;

public class Movimento {

	private LocalDateTime data;
	private String descrizione;
	private double entrate;
	private double uscite;
	
	public Movimento(String descrizione, double entrate, double uscite) {
		super();
		this.descrizione = descrizione;
		this.entrate = entrate;
		this.uscite = uscite;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getEntrate() {
		return entrate;
	}

	public double getUscite() {
		return uscite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movimento [data=");
		builder.append(data);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", entrate=");
		builder.append(entrate);
		builder.append(", uscite=");
		builder.append(uscite);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
