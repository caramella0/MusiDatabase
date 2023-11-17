package it.test.service;

import java.util.Scanner;

import it.test.model.Album;

public class RimuoviListaService {
	
	public void rimuoviLista() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci l'artista o la band da rimuovere: ");
		int id = scanner.nextInt();
		
		Album lista = new Album();
		
		lista.setIdBand(id);

	}

}
