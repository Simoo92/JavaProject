package com.simos.canzonispring.service;

import java.util.List;
import java.util.Optional;

import com.simos.canzonispring.entities.Canzone;

public class CanzoneServiceImpl implements CanzoneService {

	@Override
	public void addCanzone(Canzone c) {
		

	}

	@Override
	public void updCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delCanzone(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoniByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Canzone> getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById;;
	}

	

}
