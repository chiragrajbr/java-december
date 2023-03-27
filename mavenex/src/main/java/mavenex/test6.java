//delete table content
package mavenex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test6 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=Chirag9591!");
			Statement st=con.createStatement();
			st.execute("delete from emp_details where id=101");
			System.out.println("success");
			}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
