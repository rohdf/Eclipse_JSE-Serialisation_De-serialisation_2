package nsis.metier;

import java.io.Serializable;

public class Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6247700564481612647L;
	
	private String nom;
	private String couleur;
	
	public Animal(String nom, String couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public Animal() {}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}