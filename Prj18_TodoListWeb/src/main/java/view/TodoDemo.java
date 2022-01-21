package view;

import java.util.Scanner;

import controller.TodoCtrl;
import model.Todo;

public class TodoDemo {

	public static void main(String[] args) {

		TodoCtrl ctrl = new TodoCtrl ();
		
		
		String azione = "";
		
		switch(azione) {
		
		
		
		case "aggiungi":
		// chiedi all'utente una stringa
		
		String s = chiediUtente();
		
		// con quella stringa crea il todo e inseriscilo
		
		ctrl.addTodo(s);
			break;
	
		case "show":
		//vedi l' elenco completo dei todo
		
		for (Todo df : ctrl.getTodos()) {
			System.out.println(df);
			
		}
			break;
			
		case "show complete":
		//vedere solo i todo completi
		for (Todo df: ctrl.getTodos()) {
			if (df.isDone() == true)
				System.out.println(df);
		}
			break;
			
			case "show da completare":
		//vedere solo i todo da completare
			for (Todo df: ctrl.getTodos()) {
				if (df.isDone() != true)
					System.out.println(df);
				}
				
			break;
			
			case "completa":
			//completa un todo in base alla posizione/id
				
		int completare = chiediUtenteQuale();
			break;
			
		}
		
//		ctrl.completeTodo(1);
//		
//		ctrl.addTodo("Latte");
//		ctrl.addTodo("Pane");
//		ctrl.addTodo("Vino");
//		ctrl.addTodo("Aceto");
//		ctrl.addTodo("Mele");
//		
//		
//		Todo t  = new Todo ("Biscotti");
//		
//		
//		ctrl.addTodo(t);
//		
//		
//		
//		ctrl.completeTodobyId(0);
//		
//		ctrl.addTodo(new Todo ("Prezzemolo"));
		
	
		
	}

	private static int chiediUtenteQuale() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quale todo vuoi comprare");
		return sc.nextInt();
		
	}

	private static String chiediUtente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("cosa da fare");
		return sc.next();
	}

}
