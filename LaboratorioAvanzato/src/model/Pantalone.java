package model;

public class Pantalone extends CapoAbbigliamento {
	
	//protected vuol dire visibile come se fosse pubblico per i discendenti della classe mentre privati x il resto del mondo

	public Pantalone(String descrizione, Taglia taglia) {
		this.descrizione = descrizione;
		this.taglia = taglia;
		this.sigla = "P000" + this.codArt;
	}
}
