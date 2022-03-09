package com.simos.canzonispring.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simos.canzonispring.entities.Canzone;


@Repository
public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

	
	List<Canzone> findByGenere(String genere);
	List<Canzone> findByCantante(String cantante);
	List<Canzone> findByTitolo(String titolo);
	
}
