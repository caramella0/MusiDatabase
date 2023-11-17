package it.test.service;

import java.util.Scanner;

import it.test.model.Band;

public class AggiungiBandService {
	
	public void gestisciDatiBand() {
		

		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la nome band: ");
		String band = scanner.next();
		System.out.print("inserisci genere band: ");
		String genere = scanner.next();
		System.out.print("inserisci l'anno della band: ");
		int anno = scanner.nextInt();

		Band band = new Band();
		
		
		
	}

}
