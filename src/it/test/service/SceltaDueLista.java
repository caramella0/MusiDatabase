package it.test.service;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.controler.ScannerAlbum;
import it.test.controler.ScannerBand;

public class SceltaDueLista {

	public Object sceltaDue() throws SQLException {

		Scanner opzione = new Scanner(System.in);
		System.out.print("Vuoi caricare una Band o un Album o entrambi? "
				+ "Digita 'band' per caricare una Band, 'album' per caricare un Album o 'entrambi'"
				+ " per caricare entrambi ");
		String scelta = opzione.next();

		if (scelta.equals("band")) {

			ScannerBand band = new ScannerBand();
			band.scannerBand();

		} else if (scelta.equals("album")) {

			ScannerAlbum album = new ScannerAlbum();
			album.scannerAggiungi();

		} else if (scelta.equals("entrambi")) {

			ScannerBand band = new ScannerBand();
			band.scannerBand();

			ScannerAlbum album = new ScannerAlbum();
			album.scannerAggiungi();

		} else {
			System.out.println("Opzione non valida. Inserire una delle opzioni disponibili");

		}
		return sceltaDue();
	}

}
