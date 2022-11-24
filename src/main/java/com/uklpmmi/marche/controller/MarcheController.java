package com.uklpmmi.marche.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uklpmmi.marche.model.Marche;
import com.uklpmmi.marche.service.MarcheInterfaceImpl;


@Controller
public class MarcheController {

	@Autowired
	MarcheInterfaceImpl MarcheInterfaceImpl;
	
	@GetMapping("marches")
	public List<Marche> getMarches(ModelMap  ModelMap ) {
		
		List<Marche> marches = MarcheInterfaceImpl.getListMarche();
		ModelMap.addAttribute("marches", marches);
		return marches;
	}
	
	@GetMapping("/marche")
	public String getOneMarche(@RequestParam("id") Long id,ModelMap modelMap) {
		Marche marche= MarcheInterfaceImpl.GetOneMarche(id);
		modelMap.addAttribute("marche", marche);
		return "marche";
	}
	
}
