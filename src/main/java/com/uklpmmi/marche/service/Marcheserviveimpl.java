package com.uklpmmi.marche.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uklpmmi.marche.model.Marche;

@Service
public class Marcheserviveimpl implements Marcheservive{

	
	@Autowired
	 com.uklpmmi.marche.Repository.MarcheRepository MarcheRepository;


	@Override
	public Marche CreateMarche(Marche m) {
		return MarcheRepository.save(m);
	}

	@Override
	public Marche UpdateMarche(Marche m) {
		// TODO Auto-generated method stub
		return MarcheRepository.save(m);
	}

	@Override
	public void DeleteMarcheById(long id) {
		// TODO Auto-generated method stub
		 MarcheRepository.deleteById(id);	
	}

	@Override
	public void DeleteMarche(Marche m) {
		// TODO Auto-generated method stub
		 MarcheRepository.delete(m);
		
	}

	@Override
	public Marche GetOneMarche(long id) {
		// TODO Auto-generated method stub
		return  MarcheRepository.findById(id).get();
		 
		
	}

	@Override
	public List<Marche> getListMarche() {
		// TODO Auto-generated method stub
		List<Marche>  marches =new ArrayList<Marche>();
		 marches = (List<Marche>) MarcheRepository.findAll();
		return marches;
	}



}
