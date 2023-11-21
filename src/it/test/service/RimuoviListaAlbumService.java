package it.test.service;

import java.sql.SQLException;

import it.test.dao.RimuoviListaAlbumDao;
import it.test.dao.RimuoviListaBandDao;
import it.test.model.Album;
import it.test.model.Band;

public class RimuoviListaAlbumService {
	
	public void rimuoviListaService(String cancellaAlbum) throws SQLException {

		Album album = new Album();
		
		album.setNomeAlbum(cancellaAlbum);
		
		RimuoviListaAlbumDao listaAlbumDao = new RimuoviListaAlbumDao();
		
		listaAlbumDao.rimuoviLista(album);

	}

}
