package it.test.controler;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.model.Album;
import it.test.model.Band;
import it.test.service.RimuoviListaAlbumService;
import it.test.service.RimuoviListaBandService;

public class ScannerRimuovi {

	public void scannerRimuovi() throws SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Vuoi rimuovare una band o un album?: ");
		String scelta = scanner.next();

		if (scelta.equals("band")) {

			Band band = new Band();

			band.setTitoloBand(scelta);

			RimuoviListaBandService rimnuoviBand = new RimuoviListaBandService();
			
			rimnuoviBand.rimuoviLista(scelta);
			
		} else if (scelta.equals("album")) {

			Album album = new Album();
			
			album.setNomeAlbum(scelta);
			
			RimuoviListaAlbumService rimuoviAlbum = new RimuoviListaAlbumService();
			
			rimuoviAlbum.rimuoviLista(scelta);
		}
	}
}
