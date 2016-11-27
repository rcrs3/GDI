package test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import test.Connectivity;

public class Program {
	public static void main(String [] args){
			Scanner in = new Scanner(System.in);
			String password = in.nextLine();
			try {
				Connectivity con = new Connectivity(password);
				String sql = in.nextLine();
				ResultSet res = con.query(sql);
				while(res.next()){
					System.out.println(res.getString("nome"));
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
}
