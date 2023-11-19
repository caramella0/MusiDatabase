package it.test.service;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.Scanner;
import it.test.controler.Principale;
import it.test.controler.ScannerAlbum;
import it.test.controler.ScannerBand;

public class SceltaDueLista {

	public void sceltaDue() throws SQLException, ConnectException {

		try (Scanner opzione = new Scanner(System.in)) {
			System.out.println("Vuoi caricare una Band o un Album o entrambi?");
			System.out.println("Digita 'band' per caricare una Band");
			System.out.println("Digita 'album' per caricare un Album");
			System.out.println("Digita 'entrambi' per caricare Entrambi");
			System.out.println("Digita 'esci' per uscire dalla selezione");
			System.out.print("Digita una delle opzioni disponibili: ");

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

			} else if (scelta.equals("esci")) {

				Principale.main(null);

			}else {
			System.out.println("Opzione non valida. Inserire una delle opzioni disponibili");
			SceltaDueLista ritorno = new SceltaDueLista();
			ritorno.sceltaDue();
			}
		}
	}
}
