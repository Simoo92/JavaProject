package controller;

import model.Todo;

public class TodoCtrl {

	private Todo[] spesa;

	public TodoCtrl() {
		this.spesa = new Todo[10];
	}

	public void addTodo(String desc, int pos) {
		Todo temp = new Todo(desc); // temp = riferimento temporaneo
		this.spesa[pos] = temp;
	}

	public void stampaLista() {
		for (int i = 0; i < spesa.length; i++) {
			if (spesa[i] != null) {
				
				if (spesa[i].isCompleto())
					System.out.print("[*]");
				else
					System.out.println("[ ]");
				System.out.println(spesa[i].getDescrizione());
			}
		}

	}

	public void completa(int pos) {
		if (this.spesa[pos] != null) {
			this.spesa[pos].setCompleto(true);
		}
	}
}
