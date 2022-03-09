package com.simos.automobili.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simos.automobili.dal.AutoDAO;
import com.simos.automobili.entities.AutoElettrica;

@Service
public class AutoServiceImpl implements AutoService {

	@Autowired
	private AutoDAO repo;
	
	
	@Override
	public List<AutoElettrica> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addAuto(AutoElettrica a) {
		this.repo.save(a);

	}

}
