package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.test.model.Album;
import it.test.resouce.ConnessioneServer;

public class RimuoviListaBandDao {

	public void rimuoviLista(Album id) throws SQLException {


		ConnessioneServer conn = new ConnessioneServer();
		Connection rimuovi1 = conn.getConnection();

		String sqlRimuovi = "DELETE FROM RaccoltaMusicale.band WHERE id = ?";
		PreparedStatement ps = rimuovi1.prepareStatement(sqlRimuovi);
		ps.setLong(1, id.getIdBand());
		
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");
		ps.close();

	}

}
