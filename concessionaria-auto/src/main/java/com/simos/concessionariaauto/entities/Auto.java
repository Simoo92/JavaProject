package com.simos.concessionariaauto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "automobili")
public class Auto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Marca;
	private String modello;
	private double prezzo;
	private int km;
	private int anno;
	
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	public Auto(int id, String marca, String modello, double prezzo, int km, int anno) {
		super();
		this.id = id;
		Marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.km = km;
		this.anno = anno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", Marca=" + Marca + ", modello=" + modello + ", prezzo=" + prezzo + ", km=" + km
				+ ", anno=" + anno + "]";
	}

	
	

}
