package view;

import controller.Libretto;

public class GestioneUnito {

	public static void main(String[] args) {
		
		Libretto libretto52 = new Libretto();
		
		libretto52.aggiungiEsame(0, 20, "matematica");
		libretto52.aggiungiEsame(1, 26, "italiano");
		libretto52.aggiungiEsame(2, 21, "spagnolo");
		libretto52.aggiungiEsame(3, 29, "francese");
		
		System.out.println(libretto52.calcolaMedia());
		libretto52.aggiungiEsame(4, 30, "informatica");
		
		System.out.println(libretto52.calcolaMedia());
	}

}
