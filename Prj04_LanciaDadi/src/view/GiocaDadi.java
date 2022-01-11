package view;

import model.Dado;

public class GiocaDadi {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();

		final int NUMERO_LANCI = 10000;
		int contaVittorie = 0;

		long start = System.currentTimeMillis();

		for (int i = 0; i < NUMERO_LANCI; i++) {// inizio for

			contaVittorie = gioco(d1, d2, contaVittorie);
		} // fine for

		report(NUMERO_LANCI, contaVittorie, start);

	}// fine main

	private static void report(final int NUMERO_LANCI, int contaVittorie, long start) {
		long stop = System.currentTimeMillis();
		System.out.println("l'elaborazione è durata" + (stop - start) + "ms");
		System.out.println("Hai giocato:" + NUMERO_LANCI + "volte");
		System.out.println("Hai vinto" + contaVittorie + "volte");
		double percentuale = (double) contaVittorie / NUMERO_LANCI * 100;
		System.out.println("La percentuale di successo è di:" + percentuale + "%");
	}

	private static int gioco(Dado d1, Dado d2, int contaVittorie) {
		int res1 = d1.lancia();
		int res2 = d2.lancia();

		if (res1 == res2) {
			System.out.println("hai vinto con una coppia di " + res1);
			contaVittorie++;
		} else {
//				System.out.println("dado1:" + res1);
//				System.out.println("dado2:" + res2);
//				System.out.println("non hai vinto, ritenta!");

		} // fine if e else
		return contaVittorie;
	}

}// fine classe
