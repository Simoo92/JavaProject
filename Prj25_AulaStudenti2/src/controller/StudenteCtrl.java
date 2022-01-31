package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dal.StudenteDAO;
import model.Studente;

public class StudenteCtrl implements StudenteICtrl {

	private StudenteDAO repo;
	
	public StudenteCtrl() throws FileNotFoundException {
		//chiamo il dao e gli faccio inizializzare il repo
		repo.inizializza();
	}
	
	
	@Override
	public List<Studente> getAll() {
		return repo.getStudenti();
	}

	@Override
	public Studente getOneById(int id) {
		
		return null;
	}

	@Override
	public Studente getOneByRandom() {
		Random rand = new Random();
		int i = rand.nextInt(repo.getStudenti().size());
		return repo.getStudenti().get(i);
	}

	@Override
	public void faiAppello() {
		int presenti = 0;
		int assenti = 0;
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		
		Scanner sc = new Scanner (System.in);
		
		File f = new File(NOME_FILE_OUTPUT + "_" + ld + "_" + lt.getMinute() + ".txt");
		
		
		try {
			
			// TODO: handle exception
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("--------------------");
		pw.println("Presenze " + ld);
		pw.println("Appello delle ore " + ld);
		pw.println("--------------------");
		
		for (Studente studente : getAll()) {
			System.out.println(DOMANDA);
			System.out.println(studente);
			
			if (sc.nextLine().equals("s")) {
			pw.println("[*]");			
			pw.println(studente);			
				presenti++;
			} else {
				pw.println("[]");			
				pw.println(studente);
				assenti++;
			}
			
		}
		pw.println("--------------------");
		pw.println("Sono presenti; " + presenti);
		pw.println("Sono presenti; " + assenti);
		
		} catch (Exception e) {
	}
		
		System.out.println(" sono presenti " + presenti);
		System.out.println(" sono assenti " + assenti);


	}
}


