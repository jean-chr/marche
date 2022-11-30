package com.uklpmmi.marche.service;

import java.util.List;

import com.uklpmmi.marche.model.Marche;

public interface Marcheservive {

	Marche CreateMarche(Marche m);

	Marche UpdateMarche(Marche m);

	void DeleteMarcheById(long id);

	void DeleteMarche(Marche m);

	List<Marche> getListMarche();

	Marche GetOneMarche(long id);


}
