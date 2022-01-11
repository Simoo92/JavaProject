package controller;

import model.Esame;

public class Libretto {
	
	String nomeStudente = "";
	Esame[] esamiSostenuti = new Esame[10]; // array base - non ridimensionabile
	
	public void aggiungiEsame(int pos, int voto, String nomeEsame) {
		
		Esame e = new Esame();
		e.materia = nomeEsame;
		e.voto = voto;
		
		esamiSostenuti[pos]= e;
		
		System.out.println();
		
	}
	
	public double calcolaMedia() {
		
		double totale=0;
		int contaEsami=0;
		
		for (int i = 0; i < esamiSostenuti.length; i++)  { 
			if(esamiSostenuti[i]!= null) {  //valore null ovvero che non son stati istanziati
			totale += esamiSostenuti[i].voto;
			contaEsami+=1;
			 }
		}
		return totale/ contaEsami;
	 
	}

}
