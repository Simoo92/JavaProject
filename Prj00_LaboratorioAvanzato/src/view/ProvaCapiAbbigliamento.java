package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONObject;

import controller.CapiAbbigliamentoCtrl;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class ProvaCapiAbbigliamento {

	public static void main(String[] args) throws FileNotFoundException {

		CapiAbbigliamentoCtrl ctrl = new CapiAbbigliamentoCtrl();
		
		ctrl.addMaglia(new Maglia("Maglia verde", Taglia.M));
		ctrl.addMPantalone(new Pantalone("Pantalone classico", Taglia.XL));
		System.out.println("maglie ---------------------------");
		JSONArray array = new JSONArray();
		
		for (Maglia m : ctrl.getMaglia()) {
			JSONObject obj = new JSONObject(m);
			array.put(obj);;
			System.out.println(m);
		}
		
		System.out.println("pantaloni -----------------------");
		ctrl.getPantaloni().forEach(System.out::println);
		
		
		System.out.println("JSON -------------------------------");
		System.out.println(array.toString());
		
		PrintWriter pw = new PrintWriter(new File("files/maglie.json"));
		pw.println(array.toString());																	
		pw.close();
		
	}

}
