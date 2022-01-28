package model;

import java.time.LocalDate;

public class Movimento {

	private String descrizione;
	private int quantita;
	private LocalDate dataMovimento;
	private Articolo articolo;
	
	public Movimento(String descrizione, int quantita, Articolo a) {
		super();
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.dataMovimento=LocalDate.now();
		this.articolo= a;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public LocalDate getDataMovimento() {
		return dataMovimento;
	}
	
	public Articolo getArticolo() {
		return articolo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movimento [descrizione=");
		builder.append(descrizione);
		builder.append(", quantita=");
		builder.append(quantita);
		builder.append(", dataMovimento=");
		builder.append(dataMovimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
