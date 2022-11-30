package com.uklpmmi.marche.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uklpmmi.marche.Repository.MarcheRepository;
import com.uklpmmi.marche.model.Marche;
import com.uklpmmi.marche.service.Marcheserviveimpl;

@RestController
@CrossOrigin
@RequestMapping("/marche/api")
public class MarcheController {

	@Autowired
	Marcheserviveimpl Marcheserviveimpl;
	@Autowired
	 MarcheRepository repo;
	
	
	/**
	 * 
	 * @return list marches
	 */
	@GetMapping("")
	public List<Marche> getMarches( ) {
		List<Marche> marches = Marcheserviveimpl.getListMarche();
		return marches;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("{id}")
	public Marche getOneMarche(@PathVariable("id") Long id) {
		Marche marche= Marcheserviveimpl.GetOneMarche(id);
		return marche;
	}
	
	

	/**
	 * @author BODJONA
	 * @param marche
	 * @return
	 */
	@PostMapping("")
	public Marche createProduit(@RequestBody Marche marche) {
		//Integer id=Marcheserviveimpl.getListMarche().size()+1;
		//marche.setId(id);
	return Marcheserviveimpl.CreateMarche(marche);
	}
	

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void SupprimerbyId(@PathVariable("id") Long id) {
		 Marcheserviveimpl.DeleteMarcheById(id);
	}
	
	
	/**
	 * 
	 * @param marche
	 * @return
	 */
	@PutMapping("/{id}")
	public Marche Updatemarche(@RequestBody Marche marche,@PathVariable("id") Long id) {
		
		return repo.findById(id).map(m->{
			m.setNom(marche.getNom());
			m.setLieu(marche.getLieu());
			m.setHeure_fermeture(marche.getHeure_fermeture());
			m.setHeure_ouverture(marche.getHeure_ouverture());
			m.setHangars_nombre(marche.getHangars_nombre());
			m.setDateCreation(new Date());
			return  Marcheserviveimpl.UpdateMarche(m);
		}	
		).orElseGet(()->{
			marche.setId(id);
			return  Marcheserviveimpl.UpdateMarche(marche);
		});
		
		
	}
	
}
