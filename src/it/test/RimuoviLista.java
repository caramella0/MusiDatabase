package it.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RimuoviLista {
	
	public void rimuoviLista() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("inserisci l'ID dell'artista da rimuovere: ");
		String id = scanner.next();
		scanner.close();
		
		ConnessioneServer conn = new ConnessioneServer();
		Connection rimuovi = conn.getConnection();
		
		String sqlRimuovi = "DELETE FROM musica.lista WHERE id = ?";
		PreparedStatement ps = rimuovi.prepareStatement(sqlRimuovi);
		ps.setString(1, id);
		ps.executeUpdate();
		

		System.out.println("Operazione conclusa con successo");
		ps.close();
		
	}

}
