package it.test.dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.test.model.Band;
import it.test.resouce.ConnessioneServer;

public class VerificaBandPresenteDao {
	
	public boolean bandPresente(Band nomeBand, Connection connection) throws SQLException, ConnectException {
		
	
		String sqlVerifica = "SELECT COUNT(*) FROM RaccoltaMusicale.band WHERE nome_band = ?";
		
		try (PreparedStatement ps = connection.prepareStatement(sqlVerifica)) {
			ps.setString(1, nomeBand.getTitoloBand());
			try (ResultSet rs = ps.executeQuery()) {
				rs.next();
				int count = rs.getInt(1);
				return count > 0; 
			}
		}
	}
}
