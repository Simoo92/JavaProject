package com.simos.canzonispring.service;

import java.util.List;
import java.util.Optional;

import com.simos.canzonispring.entities.Canzone;

public interface CanzoneService {

	
	
	void addCanzone(Canzone c);
	void updCanzone(Canzone c);
	void delCanzone(int id);
	
	
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByGenere(String genere);
	List<Canzone> getCanzoniByCantante(String cantante);
	List<Canzone> getCanzoniByTitolo(String titolo);
	
	Optional<Canzone> getCanzoneById(int id);
	
}
