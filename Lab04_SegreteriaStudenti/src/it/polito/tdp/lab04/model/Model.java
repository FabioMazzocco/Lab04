package it.polito.tdp.lab04.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;

public class Model {
	
	CorsoDAO daoCorso = new CorsoDAO();
	
	public List<String> getCorsi(){
		List<Corso> corsi = new LinkedList<Corso>(daoCorso.getTuttiICorsi());
		List<String> nomeCorsi = new LinkedList<String>();
		
		if(corsi.size() == 0)
			nomeCorsi.add("Errore nel caricamento corsi");
		else
			for(Corso c : corsi)
				nomeCorsi.add(c.getNome());
		Collections.sort(nomeCorsi);
		return nomeCorsi;
	}
}
