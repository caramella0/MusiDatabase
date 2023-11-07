package it.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RimuoviLista {

	public void rimuoviLista() throws SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("inserisci l'ID dell'artista o la band da rimuovere: ");
		String rimuovi = scanner.next();
		scanner.close();

		ConnessioneServer conn = new ConnessioneServer();
		Connection rimuovi1 = conn.getConnection();

		String sqlRimuovi = "DELETE FROM musica.lista WHERE band = ? OR album = ?";
		PreparedStatement ps = rimuovi1.prepareStatement(sqlRimuovi);
		ps.setString(1, rimuovi);
		ps.setString(2, rimuovi);
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");
		ps.close();

	}

}
