package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class jdbc1 {

	

	public static void main(String[] args) {
		
		try {
			//import driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp1?user=root&password=Chirag9591!");
			//create statement
			java.sql.Statement st=con.createStatement();
			//execute 3 methods execute, execute query ,execute update
			st.executeUpdate("create table (id int,name varchar(20)");
			System.out.println("created ");
			//close connection
			con.close();
			}
		catch(Exception e) {
			System.out.println(e);
	}
}
}