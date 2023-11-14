package it.test;

import java.sql.SQLException;
import java.util.Scanner;

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
			Aggiugiband add = new Aggiugiband();
			RimuoviLista remove = new RimuoviLista();
			Cerca cerca = new Cerca();
			ConnessioneServer conness = new ConnessioneServer();
			
			
			if (opzioneScelta == 1) {
				stamp.stampaDati();
			} else if (opzioneScelta == 2) {
				add.aggiugiBand();
			}else if (opzioneScelta == 3) {
				remove.rimuoviLista();
			}else if (opzioneScelta == 4) {
				remove.rimuoviLista();
			}else if (opzioneScelta == 5) {
				cerca.ricerca();
			}else if (opzioneScelta == 6) {
				conness.closeConnection();
				System.out.println("La connessione e stata chiusa");
				
				break;
				
			}else if (opzioneScelta <=7) {
				System.out.println("Opzione errata, scegli un numero dalla lista");
			}

		}

	}

}
