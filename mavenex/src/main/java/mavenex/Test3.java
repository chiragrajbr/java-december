package mavenex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=Chirag9591!");
			Statement st=con.createStatement();
			st.executeUpdate("insert into emp_details values(101,'rahul',45000)");
			st.executeUpdate("insert into emp_details values(102,'sonia',55000)");
			st.executeUpdate("insert into emp_details values(103,'priya',65000)");
			st.executeUpdate("insert into emp_details values(104,'teju',75000)");
			st.executeUpdate("insert into emp_details values(105,'Chanda',85000)");
			st.executeUpdate("insert into emp_details values(106,'devika',95000)");
			System.out.println("Data Inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
