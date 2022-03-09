package com.simos.alimenti.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simos.alimenti.dal.AlimentoDAO;
import com.simos.alimenti.entities.Alimento;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	
	private Map<Integer, Alimento> alimentiMap;
	
	public Map<Integer, Alimento> getAlimentiMap() {
		
		if(alimentiMap == null) {
			alimentiMap = new TreeMap<>();
			for(Alimento a : getAlimenti()) {
				alimentiMap.put(a.getId(), a);
			}
		}
		return alimentiMap;
	}
	
	@Override
	public void addAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void updateAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void deleteAlimento(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public Alimento getAlimentoById(int id) {
		if(this.repo.findById(id).isPresent())
		 return this.repo.findById(id).get();
		else
			return new Alimento();
		
		
	}

	@Override
	public List<Alimento> getAlimenti() {
		 return this.repo.findAll();
		
	}
	
	

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {
		// TODO Auto-generated method stub
		return this.repo.findByCategoriaStartingWith(categoria);
	}

	@Override
	public List<Alimento> getAlimentiByEnergia(int min, int max) {
		// TODO Auto-generated method stub
		return this.repo.findByEnergiaBetweenOrderByEnergia(min, max);
	}

	@Override
	public List<String> getCategorie() {
		// TODO Auto-generated method stub
		return this.repo.trovaCategorie();
	}

}
