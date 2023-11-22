package it.test.service;

import java.net.ConnectException;
import java.sql.SQLException;

import it.test.dao.RimuoviListaBandDao;
import it.test.model.Band;

public class RimuoviListaBandService {
	
	public void rimuoviListaService(String cancellaBand) throws SQLException, ConnectException {

		Band band = new Band();

		band.setTitoloBand(cancellaBand);
		
		RimuoviListaBandDao daoBand = new RimuoviListaBandDao();
		
		daoBand.rimuoviLista(band);

		

	}

}
