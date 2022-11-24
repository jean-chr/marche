package com.uklpmmi.marchemain.model;

import java.util.Date;

public class Marche {

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getLieu() {
		return Lieu;
	}
	public void setLieu(String lieu) {
		Lieu = lieu;
	}
	public Date getHeure_ouverture() {
		return Heure_ouverture;
	}
	public void setHeure_ouverture(Date heure_ouverture) {
		Heure_ouverture = heure_ouverture;
	}
	public int getHangars_nombre() {
		return Hangars_nombre;
	}
	public void setHangars_nombre(int hangars_nombre) {
		Hangars_nombre = hangars_nombre;
	}
	public Date getHeure_fermeture() {
		return Heure_fermeture;
	}
	public void setHeure_fermeture(Date heure_fermeture) {
		Heure_fermeture = heure_fermeture;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	
	
	public Marche(long id, String nom, String lieu, Date heure_ouverture, int hangars_nombre, Date heure_fermeture,
			Date dateCreation) {
		super();
		Id = id;
		Nom = nom;
		Lieu = lieu;
		Heure_ouverture = heure_ouverture;
		Hangars_nombre = hangars_nombre;
		Heure_fermeture = heure_fermeture;
		DateCreation = dateCreation;
	}


	private long Id;
	private String Nom;
	private String Lieu;
	private Date Heure_ouverture;
	private int  Hangars_nombre;
	private Date Heure_fermeture;
	private Date DateCreation;
	
}
