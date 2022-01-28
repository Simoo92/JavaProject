package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Articolo;

public class Articoli {

	private static Map<Integer, Articolo> ALL = new HashMap<>();

	static {

		String[] tech = { "Computer", "Monitor", "Telefono", "Tastiera", "Mouse", "Stampante", "Scanner" };

		for (String art : tech) {
			Articolo a = new Articolo(art, 100);
			ALL.put(a.getId(), a);
		}

	}
	
	public static Map<Integer, Articolo> getALL() {
		return ALL;
	}
	
	public static Articolo getArticoloById(int id) {
		return ALL.get(id);
	}
	
	public static List<Articolo> getAsList() {
		List<Articolo> temp= new ArrayList<Articolo>(ALL.values());
		return temp;
	}

}
