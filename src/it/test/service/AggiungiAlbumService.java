package it.test.service;


import java.sql.SQLException;

import it.test.dao.AggiungiAlbumDao;
import it.test.model.Album;

public class AggiungiAlbumService {

	public void aggiungiAlbumService(String inserisciAlbum, long inserisciAnno) throws SQLException {
		
		Album album = new Album();
		
		album.setNomeAlbum(inserisciAlbum);;
		album.setAnnoAlbum(inserisciAnno);

		AggiungiAlbumDao dao = new AggiungiAlbumDao();
		
		dao.aggiugiAlbumDao(album);
	
	}
}
