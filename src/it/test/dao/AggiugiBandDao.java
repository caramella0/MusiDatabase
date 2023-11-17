package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import it.test.resouce.ConnessioneServer;

public class AggiugiBandDao {

	public void aggiugiBand() throws SQLException {
	
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
	}
}
