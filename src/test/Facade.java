package test;

import java.sql.ResultSet;
import java.sql.SQLException;

import test.Connectivity;

public class Facade {
	private Connectivity connectivity;
	
	public Facade(String password) throws ClassNotFoundException, SQLException{
		this.connectivity = new Connectivity(password);
	}
	
	void getPaciente(String sql){
		
	}
	
}
