package mavenex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=Chirag9591!");
			Statement st=con.createStatement();
			st.executeUpdate("create table emp_details(id int,name varchar(20),sal int)");
			System.out.println("successfully created");
			con.close();		
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}