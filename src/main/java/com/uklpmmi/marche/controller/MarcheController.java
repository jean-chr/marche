package com.uklpmmi.marche.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.uklpmmi.marche.model.Marche;
import com.uklpmmi.marche.service.Marcheservive;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class MarcheController {

	@Autowired
	Marcheservive Marcheservive;
	
	
	@GetMapping("marches")
	public List<Marche> getMarches( ) {
		
		List<Marche> marches = Marcheservive.getListMarche();
		return marches;
	}
	
	@GetMapping("/marche")
	public Marche getOneMarche(@RequestParam("id") Long id) {
		Marche marche= Marcheservive.GetOneMarche(id);
		return marche;
	}
	
}
