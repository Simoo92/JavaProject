package controller;

import java.util.ArrayList;

import model.Libro;

public class LibriCtrl {
	
	private ArrayList<Libro> libri;

	public LibriCtrl() {
		
		this.libri = new ArrayList<Libro>();
		
		inizializza();
	}
	
	
	public void inizializza () {
		this.libri.add(new Libro("Vita", 50));
		this.libri.add(new Libro("Morte", 40));
		this.libri.add(new Libro("Miracoli", 30));
		this.libri.add(new Libro("Felicità", 20));
	}
	
	
	public void addlibro (String titolo, double prezzo){
		Libro l = new Libro(titolo, prezzo);
		
		libri.add(l);
		
	
		
	}
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
	

}
