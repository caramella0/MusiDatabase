package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import it.test.resouce.ConnessioneServer;

public class AggiungiAlbum {

	public void aggiugiAlbum() throws SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la nome dell'album: ");
		String album = scanner.next();
		System.out.print("inserisci l'anno di publicazione: ");
		long anno = scanner.nextInt();
		
		ConnessioneServer conn = new ConnessioneServer();
		Connection aggiungi = conn.getConnection();

		String sqlAggiungi = "INSERT INTO RaccoltaMusicale.album (titolo_album, anno_album) VALUES (?,?)";
		PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
		ps.setString(1, album);
		ps.setLong(2, anno);
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");

		ps.close();
	}
}
