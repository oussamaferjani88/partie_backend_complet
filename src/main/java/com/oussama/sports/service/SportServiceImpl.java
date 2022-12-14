package com.oussama.sports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oussama.sports.entities.Genre;
import com.oussama.sports.entities.Sport;
import com.oussama.sports.repos.SportRepository;

@Service
public class SportServiceImpl implements SportService {

	@Autowired
	SportRepository sportRepository;
	
	@Override
	public Sport saveSport(Sport s) {
		return sportRepository.save(s);}

	@Override
	public Sport updateSport(Sport s) {
		return sportRepository.save(s);
	}

	@Override
	public void deleteSport(Sport s) {
		 sportRepository.delete(s);
		
	}

	@Override
	public void deleteSportById(Long id) {
		 sportRepository.deleteById(id);
		
	}

	@Override
	public Sport getSport(Long id) {
		return sportRepository.findById(id).get();
	}

	@Override
	public List<Sport> getAllSports() {
		return sportRepository.findAll();
	}

	@Override
	public List<Sport> findByNomSport(String nom) {
		return sportRepository.findByNomSport(nom);
	}

	@Override
	public List<Sport> findByNomSportContains(String nom) {
		return sportRepository.findByNomSportContains(nom);
	}

	@Override
	public List<Sport> findByNomSexe(String nom, String sexe) {
	    return sportRepository.findByNomSexe(nom, sexe);
	}

	@Override
	public List<Sport> findByGenre(Genre genre) {
		return sportRepository.findByGenre(genre);
	}

	@Override
	public List<Sport> findByGenreIdG(Long id) {
		return sportRepository.findByGenreIdG(id);
	}

	@Override
	public List<Sport> findByOrderByNomSportAsc() {
		return sportRepository.findByOrderByNomSportAsc();
	}

	@Override
	public List<Sport> trierSportsNomsSexe() {
		return sportRepository.trierSportsNomsSexe();
	}

}
