package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.test.model.Album;
import it.test.resouce.ConnessioneServer;

public class AggiungiAlbumDao {

	public void aggiugiAlbum(Album album) throws SQLException {

		ConnessioneServer conn = new ConnessioneServer();
		Connection aggiungi = conn.getConnection();

		String sqlAggiungi = "INSERT INTO RaccoltaMusicale.album (titolo_album, anno_album) VALUES (?,?)";
		PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
		ps.setString(1, album.getNomeAlbum());
		ps.setLong(2, album.getAnnoAlbum());
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");

		ps.close();
	}
}
