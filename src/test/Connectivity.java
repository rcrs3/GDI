package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {
	private Connection connection;
	private Statement statement;
	
	public Connectivity(String driverName, String url, String login, String senha) 
			throws SQLException, ClassNotFoundException{
		Class.forName(driverName);
		this.connection = DriverManager.getConnection(url, login, senha);
		this.statement = this.connection.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE, 
				ResultSet.CONCUR_UPDATABLE
		);
	}
	
	int insert(String sql) throws SQLException{
		return this.statement.executeUpdate(sql);
	}
	
	ResultSet query(String sql) throws SQLException{
		return this.statement.executeQuery(sql);
	}
}
