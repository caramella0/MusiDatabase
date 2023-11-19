package it.test.resouce;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnessioneServer {
	
	public Connection connessione;

	public Connection getConnection()  {
		
	try {
		if (connessione == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerName("127.0.0.1");
			dataSource.setPortNumber(3306);
			dataSource.setPassword("cirfeta1");
			dataSource.setUser("root");
			dataSource.setDatabaseName("RaccoltaMusicale");
			
			connessione = dataSource.getConnection();
			
		}
	
	} catch (SQLException e) {
		
		System.out.println("Impossibile connettersi al server");
		
	}
	return connessione;	
	}
	
	public void closeConnection() throws SQLException {
		if (connessione != null) {
			connessione.close();
		}
	}
}
