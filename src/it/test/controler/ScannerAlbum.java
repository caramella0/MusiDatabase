package it.test.controler;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.service.AggiungiAlbumService;

public class ScannerAlbum {
	
	public void scannerAggiungi() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la nome dell'album: ");
		String inserisciAlbum = scanner.next();
		System.out.print("inserisci l'anno di publicazione: ");
		long inserisciAnno = scanner.nextInt();
		
		AggiungiAlbumService service = new AggiungiAlbumService();
		service.aggiungiAlbumService(inserisciAlbum, inserisciAnno);
		
		scanner.close();
	}

}
