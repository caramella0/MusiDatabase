package it.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Aggiugiband {


	public void aggiugiArtista() throws SQLException {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("inserisci l'artista: ");
		String artista = scanner.next();
		System.out.print("inserisci album: ");
		String album = scanner.next();
		System.out.print("inserisci l'anno: ");
		String anno = scanner.next();
		
		ConnessioneServer conn = new ConnessioneServer();
		Connection aggiungi = conn.getConnection();
		
		String sqlAggiungi = "INSERT INTO musica.lista (artista, album, anno ) VALUES (?,?,?)";
		PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
		ps.setString(1, artista);
		ps.setString(2, album);
		ps.setString(3, anno);
		ps.executeUpdate();
		
		System.out.println("Operazione conclusa con successo");
		
		ps.close();
		scanner.close();
		
	}

}
