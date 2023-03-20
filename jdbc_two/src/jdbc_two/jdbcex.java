package jdbc_two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcex {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Chirag9591!");
		Statement st=con.createStatement();
		st.executeUpdate("create table emp(id int)");
		System.out.println("java created");
		con.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
