package com.oussama.sports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSport;
	private String nomSport;
	private String sexe;
	private Date dateTournoi;
	
	
	public Sport(String nomSport, String sexe, Date dateTournoi) {
		super();
		this.nomSport = nomSport;
		this.sexe = sexe;
		this.dateTournoi = dateTournoi;
	}
	
	@ManyToOne
	private Genre genre;

	public Sport() {
		super();
		 
	}


	public Long getIdSport() {
		return idSport;
	}


	public void setIdSport(Long idSport) {
		this.idSport = idSport;
	}


	public String getNomSport() {
		return nomSport;
	}


	public void setNomSport(String nomSport) {
		this.nomSport = nomSport;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public Date getDateTournoi() {
		return dateTournoi;
	}


	public void setDateTournoi(Date dateTournoi) {
		this.dateTournoi = dateTournoi;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
}
