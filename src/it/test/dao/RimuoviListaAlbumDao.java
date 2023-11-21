package it.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.test.controler.ScannerRimuovi;
import it.test.model.Album;
import it.test.resouce.ConnessioneServer;

public class RimuoviListaAlbumDao {

	public void rimuoviLista(Album album) throws SQLException {

		ConnessioneServer conn = new ConnessioneServer();
		Connection rimuovi1 = conn.getConnection();

		String sqlRimuovi = "DELETE FROM RaccoltaMusicale.album WHERE titolo_album = ?";
		PreparedStatement ps = rimuovi1.prepareStatement(sqlRimuovi);
		ps.setString(1, album.getNomeAlbum());
		
		String sql = "SELECT ";
		if (album.getNomeAlbum() == album.getNomeAlbum()) {
			ps.executeUpdate();

			System.out.println("Operazione conclusa con successo");
			ps.close();
			
		}else {
			System.out.println("no");
		}

	}

}
