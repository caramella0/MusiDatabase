package it.test.service;

import java.util.Scanner;

import it.test.model.Album;

public class AggiungiAlbumService {

	public void aggiungiAlbum() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la nome dell'album: ");
		String inserisciAlbum = scanner.next();
		System.out.print("inserisci l'anno di publicazione: ");
		long inserisciAnno = scanner.nextInt();
		
		Album album = new Album();
		
		album.setNomeAlbum(inserisciAlbum);
		album.setAnnoAlbum(inserisciAnno);
		
	}
}
