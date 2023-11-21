package it.test.controler;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import it.test.dao.Cerca;
import it.test.dao.StampaDatabase;
import it.test.resouce.ConnessioneServer;
import it.test.service.SceltaDueLista;

public class Principale {

	public static void main(String[] args) throws SQLException, ConnectException, CommunicationsException {

		try (Scanner seleziona = new Scanner(System.in)) {
			ListaPincipale listaPrincipale = new ListaPincipale();

			listaPrincipale.listaPrincipale();

			try {
				if (seleziona.hasNext()) {

					int opzioneScelta = seleziona.nextInt();

					if (opzioneScelta >= 1 && opzioneScelta <= 7) {

						if (opzioneScelta == 1) {

							StampaDatabase stamp = new StampaDatabase();
							stamp.stampaDati();

						} else if (opzioneScelta == 2) {

							SceltaDueLista listaDue = new SceltaDueLista();

							listaDue.sceltaDue();

						} else if (opzioneScelta == 3) {

							ScannerRimuovi rimuovi = new ScannerRimuovi();
							rimuovi.scannerRimuovi();

						} else if (opzioneScelta == 4) {

							Cerca cerca = new Cerca();
							cerca.ricerca();

						} else if (opzioneScelta == 5) {

							ConnessioneServer conness = new ConnessioneServer();
							conness.getConnection();
							
							if(conness.equals(true)) {
								System.out.println(" ");
								System.out.println("Connessione stabilita");
								
								Principale.main(args);
							}

							

						} else if (opzioneScelta == 6) {

							ConnessioneServer conness = new ConnessioneServer();
							conness.closeConnection();
							System.out.println("La connessione e stata chiusa");
						}
					}

				}

			} catch (InputMismatchException e) {
				System.out.println("Input non valido. Inserisci un numero.");
			}

		}
	}

}
