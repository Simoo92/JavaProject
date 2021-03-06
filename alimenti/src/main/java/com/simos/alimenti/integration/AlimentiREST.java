package com.simos.alimenti.integration;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simos.alimenti.entities.Alimento;
import com.simos.alimenti.service.AlimentoService;

@RestController
@RequestMapping({"api", "rest"})
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	

	
	@GetMapping
	public List<Alimento> getAlimenti(){
		
		
		return this.service.getAlimenti();
	}
	
	
	@GetMapping("/energia/{min}/{max}")
	public List<Alimento> getByEnergia(@PathVariable("min") int min, @PathVariable("max") int max){
		
		
		return this.service.getAlimentiByEnergia(min,max);
	}
	
	
	
	
	
	@GetMapping("/alimentiMAP")
	public Map<Integer, Alimento> getAliMap(){
		
		
		return this.service.getAlimentiMap();
	}
	
	
	
	
	
	@GetMapping("/categorieFunzionali")
	public List<String> getCatFunct(){
		
		
		return this.service.getAlimenti()
				.stream()
				.map(a -> a.getCategoria())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	@GetMapping("categorie")
	public List<String> getCategorie(){
		
		
		return this.service.getCategorie();
	}
	
	@GetMapping("/categoria/{cat}")
	public List<Alimento> getByCat(@PathVariable("cat") String categoria) {
		 return service.getAlimentiByCategoria(categoria);
		
	}
	
	@GetMapping("{id}")
	public Alimento findById(@PathVariable int id) {
		return this.service.getAlimentoById(id);
	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		this.getAlimenti();
	}
	
	@PutMapping
	public void updAlimento(@RequestBody Alimento a) {
		this.service.updateAlimento(a);
	}

	@DeleteMapping("{id}")
	public void delAlimento(@PathVariable int id) {
		this.service.deleteAlimento(id);
	}
}
