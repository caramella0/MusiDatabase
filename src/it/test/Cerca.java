package it.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cerca {

	public void ricerca() throws SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci la parola chiave per la ricerca: ");
		String cerca = scanner.next();

		ConnessioneServer conn = new ConnessioneServer();
		Connection cerca1 = conn.getConnection();

		String sqlCerca = "SELECT * FROM musica.lista WHERE artista LIKE ?";
		PreparedStatement ps = cerca1.prepareStatement(sqlCerca);
		ps.setString(1, cerca + "%");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String artista = rs.getString("artista");
			
			if (artista != null) {
				System.out.println("Artista: " + artista);	
			} else {
				System.out.println("non trovato");
			}
		}
		ps.close();

	}

}
