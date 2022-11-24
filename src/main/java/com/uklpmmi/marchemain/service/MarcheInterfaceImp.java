package com.uklpmmi.marchemain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.uklpmmi.marchemain.model.Marche;

public class MarcheInterfaceImp  implements MarcheInterface{

	@Override
	public List<Marche> GetMarche() {
		
		List<Marche> marches = new ArrayList<Marche>();
		marches.add(new Marche(1, "kara-marche", "kara", new Date(), 10, new Date(), new Date() ));
		marches.add(new Marche(2, "sokode-marche", "sokode", new Date(), 20, new Date(), new Date() ));
		marches.add(new Marche(3, "lome-marche", "lome", new Date(), 50, new Date(), new Date() ));
		marches.add(new Marche(4, "pya-marche", "pya", new Date(), 100, new Date(), new Date() ));

		return marches;
	}

}
