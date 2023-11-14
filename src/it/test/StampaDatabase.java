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
		String sqlBandAlbum ="SELECT * FROM RaccoltaMusicale.band";

		PreparedStatement ps = stampa.prepareStatement(sqlBandAlbum);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("--------------------------------");
			System.out.println("ID: " + rs.getInt(1));
			System.out.println("Titolo album: " + rs.getString(2));
			System.out.println("Album: " + rs.getString(3));
			System.out.println("Anno: " + rs.getString(4));
			System.out.println("--------------------------------");
		}
		
		rs.close();
		ps.close();
		conn.closeConnection();
	}
}
