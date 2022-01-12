package model;

public class Todo {

	private boolean completo;
	private String descrizione;

	public Todo(String descrizione) { // new Todo ("pane")
		this.descrizione = descrizione;
		this.completo = false;
		System.out.println("Hai costruito una nuova nota");
	}

	// getters
	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	// getters
	public String getDescrizione() {
		return descrizione.toUpperCase(); //.toUpperCase per visualizzare la lista in maiuscolo
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Todo [completo=" + completo + ", descrizione=" + descrizione + "]";
	}


	
	
	
	
	
}
