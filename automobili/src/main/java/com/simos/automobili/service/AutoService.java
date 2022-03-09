package com.simos.automobili.service;

import java.util.List;

import com.simos.automobili.entities.AutoElettrica;

public interface AutoService {

	
	List<AutoElettrica> getAll();
	void addAuto(AutoElettrica a);
	
	
	
	
}
