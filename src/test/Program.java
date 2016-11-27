package test;

import java.sql.SQLException;

import test.Connectivity;

public class Program {
	public static void main(String [] args){
			String driverName = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String login = "system";
			String password = "qwerty";
			try {
				Connectivity con = new Connectivity(driverName, url, login, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
