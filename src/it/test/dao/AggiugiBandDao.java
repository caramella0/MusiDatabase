package it.test.dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import it.test.controler.Principale;
import it.test.model.Band;
import it.test.resouce.ConnessioneServer;
import it.test.service.SceltaDueLista;

public class AggiugiBandDao {

	public void aggiugiBand(Band band) throws SQLException, ConnectException {

		ConnessioneServer conn = new ConnessioneServer();
		Connection aggiungi = conn.getConnection();

		VerificaBandPresenteDao bandPres = new VerificaBandPresenteDao();

		if (bandPres.bandPresente(band, aggiungi)) {

			System.out.println("La band è già presente nel database.");
			
			SceltaDueLista ritorno = new SceltaDueLista();
			ritorno.sceltaDue();
		}

		String sqlAggiungi = "INSERT INTO RaccoltaMusicale.band (nome_band, genere_band, Anno_di_formazione_band ) VALUES (?,?,?)";
		PreparedStatement ps = aggiungi.prepareStatement(sqlAggiungi);
		ps.setString(1, band.getTitoloBand());
		ps.setString(2, band.getGenereBand());
		ps.setLong(3, band.getAnnoDiFormazioneBand());
		ps.executeUpdate();

		System.out.println("Operazione conclusa con successo");

		ps.close();

		Principale.main(null);
	}

}
