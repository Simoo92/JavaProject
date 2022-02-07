package dal;

import java.util.List;

import model.CapoAbbigliamento;

public interface CapoAbbigliamentoDAO {
	
	void addCapo(CapoAbbigliamento capo);
	
	CapoAbbigliamento getCapoAbb(int codArt);
	List<CapoAbbigliamento> getCapiAbb();
	void updCapoAbb(CapoAbbigliamento capo);
	void delCapoAbb(int codArt);
	
	

}
