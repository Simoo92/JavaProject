package controller;

import java.util.List;

import model.Studente;

public interface StudenteICtrl {
	
	//proprietà che sono per definizione final e public
	
	String DOMANDA ="E' presente?";
	String NOME_FILE_OUTPUT="C:\\Users\\sviluppo\\Desktop";
	//String SELECT = "SELECT nome, cognome FROM studenti";
	
	//metodi che sono implicitamente public e abstract 
	List<Studente> getAll();
	Studente getOneById(int id);
	Studente getOneByRandom();
	void faiAppello(); 
	
	

}
