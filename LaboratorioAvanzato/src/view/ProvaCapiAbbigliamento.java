package view;

import controller.CapiAbbigliamentoCtrl;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class ProvaCapiAbbigliamento {

	public static void main(String[] args) {

		CapiAbbigliamentoCtrl ctrl = new CapiAbbigliamentoCtrl();
		
		ctrl.addMaglia(new Maglia("Maglia verde", Taglia.M));
		ctrl.addMPantalone(new Pantalone("Pantalone classico", Taglia.XL));
		System.out.println("maglie ---------------------------");
		
		for (Maglia m : ctrl.getMaglia()) {
			System.out.println(m);
		}
		
		System.out.println("pantaloni -----------------------");
		ctrl.getPantaloni().forEach(System.out::println);
		
	}

}
