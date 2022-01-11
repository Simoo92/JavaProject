package view;

import controller.DoniCtrl;

public class DemoDoni {

	public static void main(String[] args) {

		DoniCtrl controller = new DoniCtrl();
 
		controller.aggiungiBabbo(" Babbo Pippo");
		controller.aggiungiSacco(1);

		controller.aggiungiDono(" trenino", 0.5);

		controller.aggiungiDono(" bambola", 0.4);

		controller.aggiungiDono(" casetta", 0.4);

		controller.aggiungiDono(" macchinina", 0.4);

		controller.aggiungiDono(" ferrari", 0.4);

		controller.aggiungiDono(" xbox one", 0.4);

		controller.aggiungiDono( "Ps5", 0.4);
		
		controller.aggiungiDono(" trenino", 0.5);
		
		controller.aggiungiDono(" bambola", 0.4);
		
		controller.aggiungiDono(" casetta", 0.4);
		
		controller.aggiungiDono(" macchinina", 0.4);
		
		controller.aggiungiDono(" ferrari", 0.4);
		
		controller.aggiungiDono(" xbox one", 0.4);
		
		controller.aggiungiDono(" Ps5", 0.4);

		controller.AssegnaSacco();

		String contenuto = controller.getBabbo().getSacco().etichetta();
		System.out.println(contenuto);
		double pesoSacco = controller.getPesoSacco();
		
		System.out.println("il sacco di" + controller.getBabbo().getNome() + " pesa " + pesoSacco + "Kg");
	}

}
