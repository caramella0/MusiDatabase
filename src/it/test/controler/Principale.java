package it.test.controler;

import java.sql.SQLException;
import java.util.Scanner;

import it.test.dao.AggiugiBandDao;
import it.test.dao.AggiungiAlbum;
import it.test.dao.Cerca;
import it.test.dao.RimuoviLista;
import it.test.dao.StampaDatabase;
import it.test.resouce.ConnessioneServer;

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

			StampaDatabase stamp = new StampaDatabase();
			AggiugiBandDao band = new AggiugiBandDao();
			AggiungiAlbum album = new AggiungiAlbum();
			RimuoviLista remove = new RimuoviLista();
			Cerca cerca = new Cerca();
			ConnessioneServer conness = new ConnessioneServer();

			if (opzioneScelta == 1) {
				stamp.stampaDati();
			} else if (opzioneScelta == 2) {

				Scanner opzione = new Scanner(System.in);
				System.out.print("Vuoi caricare una Band o un Album o entrambi? "
						+ "Digita 'band' per caricare una Band, 'album' per caricare un Album o 'entrambi'"
						+ " per caricare entrambi ");
				String scelta = opzione.next();

				if (scelta.equals("band")) {
					band.aggiugiBand();

				} else if (scelta.equals("album")) {
					album.aggiugiAlbum();

				} else if (scelta.equals("entrambi")) {
					band.aggiugiBand();
					
					album.aggiugiAlbum();

				}

			} else if (opzioneScelta == 3) {
				
				remove.rimuoviLista();
				
			} else if (opzioneScelta == 4) {
				
				remove.rimuoviLista();
				
			} else if (opzioneScelta == 5) {
				
				conness.getConnection();
				System.out.println(" ");
				System.out.println("Connessione stabilita");

			} else if (opzioneScelta == 6) {
				conness.closeConnection();
				System.out.println("La connessione e stata chiusa");

				break;

			} else if (opzioneScelta <= 7) {
				System.out.println("Opzione errata, scegli un numero dalla lista");
			}

		}

	}

}
