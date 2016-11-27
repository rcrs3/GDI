package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {
	private Connection connection;
	private Statement statement;
	
	public Connectivity(String password) 
			throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		this.connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
													  "system", 
													  password);
		this.statement = this.connection.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE, 
				ResultSet.CONCUR_UPDATABLE
		);
	}
	
	public int insert(String sql) throws SQLException{
		return this.statement.executeUpdate(sql);
	}
	
	public ResultSet query(String sql) throws SQLException{
		return this.statement.executeQuery(sql);
	}
}
