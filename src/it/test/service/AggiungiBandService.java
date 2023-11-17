package it.test.service;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.dao.AggiugiBandDao;
import it.test.model.Band;

public class AggiungiBandService {
	
	public void gestisciDatiBand() throws SQLException {
		

		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la nome band: ");
		String nomeBand = scanner.next();
		System.out.print("inserisci genere band: ");
		String genere = scanner.next();
		System.out.print("inserisci l'anno della band: ");
		int anno = scanner.nextInt();

		Band band = new Band();
		
		band.setTitoloBand(nomeBand);
		band.setGenereBand(genere);
		band.setAnnoDiFormazioneBand(anno);
		
		AggiugiBandDao bandDao = new AggiugiBandDao();
		
		bandDao.aggiugiBand(band);
	}

}
