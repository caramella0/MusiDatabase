package it.test.controler;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.Scanner;

import it.test.service.RimuoviListaAlbumService;
import it.test.service.RimuoviListaBandService;

public class ScannerRimuovi {

	public Object scannerRimuovi() throws SQLException, ConnectException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("Scegli cosa vuoi fare:");
		System.out.println("Digita 'band' per eliminare una band");
		System.out.println("Digita 'album' per eliminare un album");
		System.out.println("Digita 'esci' per uscire");
		System.out.print("Inserisci la tua scelta: ");
		String scelta = scanner.next();

		if (scelta.equals("band")) {

			System.out.print("Inserisci la band da cancellare: ");
			String cancellaBand = scanner.next();

			RimuoviListaBandService serviceBand = new RimuoviListaBandService();
			serviceBand.rimuoviListaService(cancellaBand);

		} else if (scelta.equals("album")) {

			System.out.print("Inserisci l'album da cancellare: ");

			String cancellaAlbum = scanner.next();

			RimuoviListaAlbumService serviceAlbum = new RimuoviListaAlbumService();
			serviceAlbum.rimuoviListaService(cancellaAlbum);

		} else if (scelta.equals("esci")) {
			Principale.main(null);

		} else {
			System.out.println("non valido");
		}
		return scannerRimuovi();
	}
}
