package com.uklpmmi.marchemain.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uklpmmi.marchemain.model.Marche;
import com.uklpmmi.marchemain.service.MarcheInterfaceImp;

@Controller
public class MarcheController {

	@GetMapping("marches")
	public List<Marche> getMarche(Model model){
		var Marcheservice = new MarcheInterfaceImp();
		var marches = Marcheservice.GetMarche();
		model.addAttribute("marches",marches);
		return marches;
		
	}
}
