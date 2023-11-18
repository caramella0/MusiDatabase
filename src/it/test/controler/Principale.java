package it.test.controler;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.dao.AggiugiBandDao;
import it.test.dao.AggiungiAlbumDao;
import it.test.dao.Cerca;
import it.test.dao.RimuoviListaBandDao;
import it.test.dao.StampaDatabase;
import it.test.resouce.ConnessioneServer;
import it.test.service.AggiungiAlbumService;
import it.test.service.AggiungiBandService;
import it.test.service.RimuoviListaBandService;

public class Principale {

	public static void main(String[] args) throws SQLException {
		Scanner seleziona = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------");
			System.out.println("Seleziona dalla lista quello che vuoi fare: ");
			System.out.println("1: Stampa tutto");
			System.out.println("2: Aggiungi al database");
			System.out.println("3: Rimuovi dal database");
			System.out.println("4: Cerca nel database");
			System.out.println("5: Controlla la connessione");
			System.out.println("6: Esci");
			System.out.print("Digita un numero per selezionare: ");
			System.out.print("");

			int opzioneScelta = seleziona.nextInt();

			RimuoviListaBandDao remove = new RimuoviListaBandDao();

			if (opzioneScelta == 1) {
				StampaDatabase stamp = new StampaDatabase();
				stamp.stampaDati();

			} else if (opzioneScelta == 2) {

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

				}

			} else if (opzioneScelta == 3) {

				ScannerRimuovi rimuovi = new ScannerRimuovi();
				rimuovi.scannerRimuovi();

			} else if (opzioneScelta == 4) {

				Cerca cerca = new Cerca();
				cerca.ricerca();

			} else if (opzioneScelta == 5) {

				ConnessioneServer conness = new ConnessioneServer();
				conness.getConnection();
				System.out.println(" ");
				System.out.println("Connessione stabilita");

			} else if (opzioneScelta == 6) {

				ConnessioneServer conness = new ConnessioneServer();
				conness.closeConnection();
				System.out.println("La connessione e stata chiusa");

				break;

			} else if (opzioneScelta <= 7) {
				System.out.println("Opzione errata, scegli un numero dalla lista");
			}

		}

	}

}
