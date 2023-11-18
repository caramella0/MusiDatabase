package it.test.service;

import java.sql.SQLException;

import it.test.dao.RimuoviListaBandDao;
import it.test.model.Album;
import it.test.model.Band;

public class RimuoviListaBandService {
	
	public void rimuoviListaService(String scelta) throws SQLException {

		Band band = new Band();

		band.setTitoloBand(scelta);
		
		RimuoviListaBandDao daoBand = new RimuoviListaBandDao();
		
		daoBand.

		

	}

}
