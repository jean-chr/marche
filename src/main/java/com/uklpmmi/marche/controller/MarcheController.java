package com.uklpmmi.marche.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uklpmmi.marche.model.Marche;
import com.uklpmmi.marche.service.MarcheInterfaceImpl;


@RestController
public class MarcheController {

	@Autowired
	MarcheInterfaceImpl MarcheInterfaceImpl;
	
	@GetMapping("marches")
	public List<Marche> getMarches( ) {
		
		List<Marche> marches = MarcheInterfaceImpl.getListMarche();
		return marches;
	}
	
	@GetMapping("/marche")
	public Marche getOneMarche(@RequestParam("id") Long id) {
		Marche marche= MarcheInterfaceImpl.GetOneMarche(id);
		return marche;
	}
	
}
