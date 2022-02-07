package dal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.CapoAbbigliamento;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class CapoAbbigliamentoDAOImpl implements CapoAbbigliamentoDAO {

	Map<Integer, CapoAbbigliamento> inventario = new HashMap<>();

	{
		String[] capi = { "Maglia Marlena", "Pantalone Body", "Maglia Lady", "Pantalone Skinny", };

		for (String string : capi) {
			if (string.startsWith("Maglia")) {
				Maglia m1 = new Maglia(string, Taglia.S);
				Maglia m2 = new Maglia(string, Taglia.M);
				Maglia m3 = new Maglia(string, Taglia.L);
				inventario.put(m1.getCodArt(), m1);
				inventario.put(m2.getCodArt(), m2);
				inventario.put(m3.getCodArt(), m3);
			} else if (string.startsWith("Panta")) {
				Pantalone p1 = new Pantalone(string, Taglia.S);
				Pantalone p2 = new Pantalone(string, Taglia.M);
				Pantalone p3 = new Pantalone(string, Taglia.L);
				Pantalone p4 = new Pantalone(string, Taglia.XL);
				inventario.put(p1.getCodArt(), p1);
				inventario.put(p2.getCodArt(), p2);
				inventario.put(p3.getCodArt(), p3);
				inventario.put(p4.getCodArt(), p4);
			}

		}

	}

	@Override
	public void addCapo(CapoAbbigliamento capo) {
		this.inventario.put(capo.getCodArt(), capo);

	}

	@Override
	public CapoAbbigliamento getCapoAbb(int codArt) {
		return this.inventario.get(codArt);
	}

	@Override
	public List<CapoAbbigliamento> getCapiAbb() {
		List<CapoAbbigliamento> capiAbb = new ArrayList<CapoAbbigliamento>();
		Collection<CapoAbbigliamento> values = this.inventario.values(); //è una collection
		for (CapoAbbigliamento capoAbbigliamento : values) {
			capiAbb.add(capoAbbigliamento);
		}
		return capiAbb;
	}

	@Override
	public void updCapoAbb(CapoAbbigliamento capo) {
		this.inventario.put(capo.getCodArt(), capo);
	}

	@Override
	public void delCapoAbb(int codArt) {
		this.inventario.remove(codArt);

	}

}
