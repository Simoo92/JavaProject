package controller;

import model.Babbo;
import model.Dono;
import model.Sacco;

public class DoniCtrl {

	Babbo babbo;
	Dono dono;
	Sacco sacco;
	
	
	public void aggiungiBabbo(String nome) {
		babbo= new Babbo(nome);
	}
	public Babbo getBabbo() {
		return babbo;
	}
	
	public void aggiungiDono(String descrizione, double peso) {
		dono = new Dono(descrizione,peso);
		AggiungiDonoAlSacco();
	}
	
	public Dono getDono() {
		return dono;
	}
	public void aggiungiSacco(int id) {
		sacco= new Sacco(id);
		
	}
	public void AggiungiDonoAlSacco(int pos) {
		this.sacco.getDoni()[pos] = this.dono;
	}
		public void AggiungiDonoAlSacco() {//overload del metodo
			int pos= primaPosizionelibera();
			if(pos>-1)
			this.sacco.getDoni()[pos] = this.dono;
			else
				System.out.println("Nun c'è più posto nel sacco");
	}
	public void AssegnaSacco() {
		this.babbo.setSacco(sacco);
	}
	public double getPesoSacco() {
		double peso =0;
		
		for (int i = 0; i < sacco.getDoni().length; i++) {
			if(sacco.getDoni()[i] != null) {//Non rischio null pointexeption
			peso += sacco.getDoni()[i].getPeso();//rischio null pointexeption
			}
		}//fine for
		return peso;
	}
	
	private int primaPosizionelibera() {
		for (int i = 0; i < sacco.getDoni().length; i++) {
			if(sacco.getDoni()[i] == null)
				return i;
			
		}
		return -1;
	}
	
	
}
