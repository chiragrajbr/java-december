package mavenex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=Chirag9591!");
			Statement st=con.createStatement();
			st.executeUpdate("insert into emp_details values(101,'chirag',15000)");
			st.executeUpdate("insert into emp_details values(102,'darshu',15000)");
			st.executeUpdate("insert into emp_details values(103,'muni',15000)");
			System.out.println("successfully created");
			con.close();	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
