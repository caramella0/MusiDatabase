package it.test.controler;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.service.AggiungiBandService;

public class ScannerBand {
	
	public void scannerBand() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la nome band: ");
		String nomeBand = scanner.next();
		System.out.print("inserisci genere band: ");
		String genere = scanner.next();
		System.out.print("inserisci l'anno della band: ");
		int anno = scanner.nextInt();

		AggiungiBandService band = new AggiungiBandService();
		
		band.aggiungiDatiBand(nomeBand, genere, anno);
		
		scanner.close();
	}

}
