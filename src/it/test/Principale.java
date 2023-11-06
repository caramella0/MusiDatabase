package it.test;

import java.sql.SQLException;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		Scanner seleziona = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------");
			System.out.println("Seleziona dalla lista quello che vuoi fare: ");
			System.out.println("1: Stampa tutto");
			System.out.println("2: Aggiungi al database");
			System.out.println("3: Rimuovi dal database");
			System.out.println("4: Cerca nel database");
			System.out.println("5: Esci");
			System.out.print("Digita un numero per selezionare: ");

			int opzioneScelta = seleziona.nextInt();

			StampaDatabase stamp = new StampaDatabase();
			AggiugiArtista add = new AggiugiArtista();
			RimuoviLista remove = new RimuoviLista();
			Cerca cerca = new Cerca();

			if (opzioneScelta == 1) {
				try {
					stamp.stampaDati();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (opzioneScelta == 2) {
				try {
					add.aggiugiArtista();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (opzioneScelta == 3) {
				try {
					stamp.stampaDati();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					remove.rimuoviLista();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			} else if (opzioneScelta == 4) {
				try {
					cerca.ricerca();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (opzioneScelta == 5) {
				break;
			}

		}

	}

}
