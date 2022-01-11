package view;

import controller.RubricaController;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {
		
		RubricaController ctrl = new RubricaController();
		ctrl.addContatto("Pippo", "34446355253");
		ctrl.addContatto("Pino", "3444432434");
		ctrl.addContatto("Rino", "3444353466353");
		ctrl.addContatto("Mimmo", "344463675883");
		ctrl.addContatto("Pippo", "34446355253");
		ctrl.addContatto("Pino", "3444432434");
		ctrl.addContatto("Rino", "3444353466353");
		ctrl.addContatto("Mimmo", "344463675883");
		ctrl.addContatto("Pippo", "34446355253");
		ctrl.addContatto("Pino", "3444432434");
		ctrl.addContatto("Rino", "3444353466353");
		ctrl.addContatto("Mimmo", "344463675883");
		
//		for (int i = 0; i < ctrl.getContatti().length; i++) {
//			System.out.println(ctrl.getContatti()[i]);
//			
//		}
		for (Contatto c  : ctrl.getContatti()) {
			System.out.println(c);
			
		}
		
		
	}

}
