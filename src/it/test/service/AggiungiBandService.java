package it.test.service;

import java.sql.SQLException;

import it.test.dao.AggiugiBandDao;
import it.test.model.Band;

public class AggiungiBandService {
	
	public void aggiungiDatiBand(String nomeBand, String genere, int anno) throws SQLException {
		
		Band band = new Band();
		
		band.setTitoloBand(nomeBand);
		band.setGenereBand(genere);
		band.setAnnoDiFormazioneBand(anno);
		
		AggiugiBandDao bandDao = new AggiugiBandDao();
		
		bandDao.aggiugiBand(band);
	}

}
