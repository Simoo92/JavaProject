package com.simos.automobili;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simos.automobili.entities.AutoElettrica;
import com.simos.automobili.service.AutoService;

@SpringBootTest
class AutomobiliApplicationTests {

	@Autowired
	private AutoService service;
	
	
	@Test
	void provaApp() {
		
		AutoElettrica al1 = new AutoElettrica(0, "Tesla", 30000);
		AutoElettrica al2 = new AutoElettrica(0, "Tesla", 40000);
		AutoElettrica al3 = new AutoElettrica(0, "Tesla", 50000);
		
		service.addAuto(al1);
		service.addAuto(al2);
		service.addAuto(al3);
		
		System.out.println(service.getAll());  
		
		
		
		assertTrue(al1.getPrezzo() > 10000);
		
		
	}


	

}
