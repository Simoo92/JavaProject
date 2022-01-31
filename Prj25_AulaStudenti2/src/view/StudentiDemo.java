package view;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.StudenteCtrl;
import dal.StudenteDAO;
import model.Studente;

public class StudentiDemo {

	public static void main(String[] args) throws FileNotFoundException {

		StudenteCtrl ctrl = new StudenteCtrl();
		List<Studente> all = ctrl.getAll();
		
		//for (Studente studente : all) {
			//System.out.println(studente);
		//}
		//ctrl.faiAppello();
		
System.out.println("E' stato sorteggiato lo studente");
		System.out.println(ctrl.getOneByRandom());
}
}