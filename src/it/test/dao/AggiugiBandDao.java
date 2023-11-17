package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import it.test.model.Band;
import it.test.resouce.ConnessioneServer;
import it.test.service.AggiungiBandService;

public class AggiugiBandDao {

	public void aggiugiBand(Band band) throws SQLException {
		
		ConnessioneServer conn = new ConnessioneServer();
		Connection aggiungi = conn.getConnection();

		String sqlAggiungi = "INSERT INTO RaccoltaMusicale.band (nome_band, genere_band, Anno_di_formazione_band ) VALUES (?,?,?)";
		PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
		ps.setString(1, band.getTitoloBand());
		ps.setString(2, band.getGenereBand());
		ps.setLong(3, band.getAnnoDiFormazioneBand());
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");

		ps.close();
	}
}
