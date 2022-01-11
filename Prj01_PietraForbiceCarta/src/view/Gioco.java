package view;

import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {

		// sequenza, selezione, iterazione
		String sceltaUmano = "";
		String sceltaPc = "";
		String risultato = "";
		int vittorieUmano = 0;
		int vittoriePc = 0;
		int numeroPartite = 5;

		for (int i = 0; i < 5; i++) {// ciclo che ripete 5 volte le istruzioni

			sceltaPc = sceltaCasualePc();
			sceltaUmano = sceltaUmano();
			risultato = valutaScelte(sceltaPc, sceltaUmano);
			if (risultato.equals("vince umano")) {
				vittorieUmano = vittorieUmano + 1;
			} else if (risultato.equals("vince pc")) {
				vittoriePc += 1;
			}
			// System.out.println("il valore di i è:" + i);
			System.out.println(risultato);
		}
		System.out.println("partite giocate" + numeroPartite);
		System.out.println("vittorie umano" + vittorieUmano);
		System.out.println("vittorie pc" + vittoriePc);
	}// fine main

	private static String valutaScelte(String sceltaPc, String sceltaUmano) 
	{
		String res ="";
		
		if(sceltaUmano.equals(sceltaPc)) 
		{
			res="pareggio";
			
		} //fine blocco if
			else 
		{
				if(sceltaUmano.equals("pietra")) {
					if(sceltaPc.equals("forbici")) {
						res= "vince Umano";
					} else 
					{
						res="vince pc";
					}
				}
				else {
					if(sceltaUmano.equals("forbici")) {
						if(sceltaPc.equals("carta")) {
							res= "vince umano";
							} 
							else 
							{
							res="vince pc";	}	}
							else
							{
					if(sceltaUmano.equals("carta")) {
								if(sceltaPc.equals("pietra")) {
									res= "vince Umano";
								} else 
								{
									res="vince pc";
								}
						}	
					}
						
					}// fine blocco else		

			} return res;
		
		
		}

	private static String sceltaUmano() {
		System.out.println("scegli tra p: pietra, f: forbici, c: carta");

		Scanner input = new Scanner(System.in);// metodo costruttore dell'oggetto di tipo scanner

		String risposta = input.nextLine();

		return risposta;
	}

	// scrivo il metodo per far scegliere casualmente una stringa tra
	// pietra,forbice,carta

	public static String sceltaCasualePc() {
		String scelta = "";

		double casuale = Math.random();// numero reale casuale compreso tra 0.0 e minore di 1.0

		if (casuale < 0.33) {
			scelta = "pietra";
		} else if (casuale < 0.66) {
			scelta = "forbici";
		} else {
			scelta = "carta";
		}

		return scelta;
	}

}// fine classe
