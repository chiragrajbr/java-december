//displaying file
package mavenex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test4 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=Chirag9591!");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from emp_details");
		int id;
		String name;
		int salary;
		while(rs.next()) {
			id=rs.getInt("id");
			name=rs.getString("name");
			salary=rs.getInt("sal");
			System.out.println(id+" "+name+" "+salary);
		}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
