package com.uklpmmi.marche.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;


@Entity
public class Marche {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nom;
	private String lieu;
	private String heure_ouverture;
	private int  hangars_nombre;
	private String heure_fermeture;
	private Date dateCreation;
	@ManyToOne
	private Categorie categorie;


	/**
	 * 
	 * @param id
	 * @param nom
	 * @param lieu
	 * @param heure_ouverture
	 * @param hangars_nombre
	 * @param heure_fermeture
	 * @param dateCreation
	 */


	 public Marche() {
		// TODO Auto-generated constructor stub
		 super();
	}
		
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getLieu() {
		return lieu;
	}



	public void setLieu(String lieu) {
		this.lieu = lieu;
	}



	public String getHeure_ouverture() {
		return heure_ouverture;
	}


	public void setHeure_ouverture(String heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}



	public int getHangars_nombre() {
		return hangars_nombre;
	}


	public void setHangars_nombre(int hangars_nombre) {
		this.hangars_nombre = hangars_nombre;
	}



	public String getHeure_fermeture() {
		return heure_fermeture;
	}



	public void setHeure_fermeture(String heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	
	public Date getDateCreation() {
		return dateCreation;
	}



	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}



	public String formatage (String string) {
		SimpleDateFormat s= new SimpleDateFormat("HH:mm:ss");
		 return s.format(string).toString();
	}
}
