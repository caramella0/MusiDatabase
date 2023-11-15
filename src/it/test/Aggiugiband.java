package it.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Aggiugiband {

	public void aggiugiBand() throws SQLException {

		Scanner scannerScelta = new Scanner(System.in);
		System.out.println("Cosa vuoi fare, aggiungere una band o un album?");
		String scelta = scannerScelta.next();

		if (scelta == "band") {

			Scanner scanner = new Scanner(System.in);

			System.out.print("inserisci la nome band: ");
			String band = scanner.next();
			System.out.print("inserisci genere band: ");
			String genere = scanner.next();
			System.out.print("inserisci l'anno della band: ");
			int anno = scanner.nextInt();

			ConnessioneServer conn = new ConnessioneServer();
			Connection aggiungi = conn.getConnection();

			String sqlAggiungi = "INSERT INTO RaccoltaMusicale.band (nome_band, genere_band, Anno_di_formazione_band ) VALUES (?,?,?)";
			PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
			ps.setString(1, band);
			ps.setString(2, genere);
			ps.setLong(3, anno);
			ps.executeUpdate();

			System.out.println("Operazione conclusa con successo");

			ps.close();
			scanner.close();

		} else if (scelta == "album") {

			Scanner scanner = new Scanner(System.in);

			System.out.print("inserisci la nome band: ");
			String band = scanner.next();
			System.out.print("inserisci genere band: ");
			String genere = scanner.next();
			System.out.print("inserisci l'anno della band: ");
			int anno = scanner.nextInt();

			ConnessioneServer conn = new ConnessioneServer();
			Connection aggiungi = conn.getConnection();

			String sqlAggiungi = "INSERT INTO RaccoltaMusicale.band (nome_band, genere_band, Anno_di_formazione_band ) VALUES (?,?,?)";
			PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
			ps.setString(1, band);
			ps.setString(2, genere);
			ps.setLong(3, anno);
			ps.executeUpdate();

			System.out.println("Operazione conclusa con successo");

			ps.close();
			scanner.close();
		}
	}

}
