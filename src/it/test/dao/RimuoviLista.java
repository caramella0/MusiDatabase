package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import it.test.resouce.ConnessioneServer;

public class RimuoviLista {

	public void rimuoviLista() throws SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci l'artista o la band da rimuovere: ");
		int id = scanner.nextInt();
		scanner.close();

		ConnessioneServer conn = new ConnessioneServer();
		Connection rimuovi1 = conn.getConnection();

		String sqlRimuovi = "DELETE FROM RaccoltaMusicale.band WHERE id = ?";
		PreparedStatement ps = rimuovi1.prepareStatement(sqlRimuovi);
		ps.setLong(1, id);
		
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");
		ps.close();

	}

}
