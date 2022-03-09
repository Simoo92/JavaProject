package com.simos.canzonispring.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simos.canzonispring.entities.Canzone;
import com.simos.canzonispring.service.CanzoneService;

@RestController
@RequestMapping("api")
public class CanzoniREST {
	
	@Autowired
	private CanzoneService service;
	
	@GetMapping("genere/{gen}")
	public List<Canzone> getByGenere(@PathVariable String gen){
		
		return this.service.getCanzoniByGenere(gen);
	}
	
	@GetMapping("canzone/{id}")
	public Canzone getCanzone(@PathVariable int id) {
		if (this.service.getCanzoneByid(id).isPresent())
			return this.service.getCanzoneById(id).get();
		else
			return new Canzone();
	}

}
