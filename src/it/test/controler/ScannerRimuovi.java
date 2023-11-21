package it.test.controler;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.Scanner;

import it.test.service.RimuoviListaAlbumService;
import it.test.service.RimuoviListaBandService;

public class ScannerRimuovi {

	public void scannerRimuovi() throws SQLException, ConnectException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Vuoi rimuovare una band o un album?: ");
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
			serviceAlbum.rimuoviLista(cancellaAlbum);

		}
	}
}
