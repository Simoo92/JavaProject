package controller;

import java.util.ArrayList;

import model.Articolo;
import model.Movimento;

public class MagazzinoCtrl {

	private ArticoliCtrl ctrlArtricoli;
	private MovimentiCtrl ctrlMovimenti;
	
	public MagazzinoCtrl() {
		this.ctrlArtricoli = new ArticoliCtrl();
		this.ctrlMovimenti = new MovimentiCtrl(new ArrayList<>());
		this.init();
	}
	
	private void init() {
		
		for (  Articolo a : db.Articoli.getAsList()   ) {
			this.ctrlArtricoli.addArticolo(a);
			}
	}
	
	public ArticoliCtrl getCtrlArtricoli() {
		return ctrlArtricoli;
	}
	public MovimentiCtrl getCtrlMovimenti() {
		return ctrlMovimenti;
	}
	public void caricaMagazzino(Articolo a, int q, String desc) {
		//creo un oggetto di tipo movimento
		Movimento m = new Movimento("Carico magazzino "+ desc, q, a);
		//aggiungo il movimento alla list di movimenti del ctrl movimenti
		this.ctrlMovimenti.addMovimento(m);
		//modifico la quantità di oggetti disponibili per l'articolo a
		this.ctrlArtricoli.caricaArticolo(a, q);
	}
	public void scaricaMagazzino(Articolo a, int q,String desc) {
		//creo un oggetto di tipo movimento
		Movimento m = new Movimento("Scarico magazzino " + desc, q, a);
		//aggiungo il movimento alla list di movimenti del ctrl movimenti
		
		if (this.ctrlArtricoli.scaricaArticolo(a, q)) {
			this.ctrlMovimenti.addMovimento(m);
			
		}
	}
}
