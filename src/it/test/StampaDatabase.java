package it.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StampaDatabase {
	
	public Connection stampa;
	
	public void stampaDati() throws SQLException {
		ConnessioneServer conn = new ConnessioneServer();
		stampa = conn.getConnection();
		String sqlBand ="SELECT * FROM RaccoltaMusicale.band";

		PreparedStatement psband = stampa.prepareStatement(sqlBand);
		ResultSet rsband = psband.executeQuery();
		
		while(rsband.next()) {
			System.out.println("--------------------------------");
			System.out.println("INFO ARTISTA");
			System.out.println("ID: " + rsband.getInt(1));
			System.out.println("Nome band: " + rsband.getString(2));
			System.out.println("Genere: " + rsband.getString(3));
			System.out.println("Anno: " + rsband.getString(4));
			System.out.println("--------------------------------");
		}

		String sqlalbum ="SELECT * FROM RaccoltaMusicale.album";
		PreparedStatement psalbum = stampa.prepareStatement(sqlalbum);
		ResultSet rsalbum = psalbum.executeQuery();
		
		while(rsalbum.next()) {
			System.out.println("INFO ALBUM");
			System.out.println("ID: " + rsalbum.getInt(1));
			System.out.println("Titolo album: " + rsalbum.getString(2));
			System.out.println("Anno Album: " + rsalbum.getString(3));
		}
		
		
		rsband.close();
		psband.close();
		rsalbum.close();
		psalbum.close();
		conn.closeConnection();
	}
}
