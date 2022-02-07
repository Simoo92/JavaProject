package controller;

import java.util.ArrayList;
import java.util.List;

import dal.CapoAbbigliamentoDAO;
import dal.CapoAbbigliamentoDAOImpl;
import model.CapoAbbigliamento;
import model.Maglia;
import model.Pantalone;

public class CapiAbbigliamentoCtrl {

	private CapoAbbigliamentoDAO capi;

	public CapiAbbigliamentoCtrl() {
		super();
		this.capi = new CapoAbbigliamentoDAOImpl();
	}
	
	public void addMaglia(Maglia m) {
		this.capi.addCapo(m);
	}
	
	public void addMPantalone(Pantalone p) {
		this.capi.addCapo(p);
	}
	
	public Pantalone getPantalone(int codArt) {
		if (this.capi.getCapoAbb(codArt) instanceof Pantalone)
		return (Pantalone) this.capi.getCapoAbb(codArt);
		return null;
	}
	
	public Maglia getMaglia(int codArt) {
		if (this.capi.getCapoAbb(codArt) instanceof Maglia)
		return (Maglia) this.capi.getCapoAbb(codArt);
		return null;
	}
	
	public List<Pantalone> getPantaloni(){
		
		List<Pantalone> pantaloni = new ArrayList<>();
		for (CapoAbbigliamento capoAbb : this.capi.getCapiAbb()) {
			if (capoAbb instanceof Pantalone)
				pantaloni.add((Pantalone) capoAbb);
		}
		
		return pantaloni;
		
	}
	
	public List<Maglia> getMaglia(){
		
		List<Maglia> maglie = new ArrayList<>();
		for (CapoAbbigliamento capoAbb : this.capi.getCapiAbb()) {
			if (capoAbb instanceof Maglia)
				maglie.add((Maglia) capoAbb);
		}
		
		return maglie;
		
	}
	
	
	
	
}

