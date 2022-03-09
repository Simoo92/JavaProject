package com.simos.automobili.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simos.automobili.entities.AutoElettrica;
import com.simos.automobili.service.AutoService;

@RestController
@RequestMapping({"api", "calabroni"})
public class AutoREST {
	
	@Autowired
	private AutoService service;
	
	@GetMapping
	public List<AutoElettrica> getAuto(){
		return service.getAll();
	}
	
	
	@PostMapping
	public void addAuto(@RequestBody AutoElettrica a) {
		service.addAuto(a);
	}
	

}
