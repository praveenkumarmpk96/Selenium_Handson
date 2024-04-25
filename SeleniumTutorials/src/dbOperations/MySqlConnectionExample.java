package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
       Class.forName("com.mysql.cj.jdbc.driver");
       
       Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");
       
       Statement statement = connection.createStatement();
       
       ResultSet  result = statement.executeQuery("Select * from superheroes_table");
       
        while (result.next()) {
        	System.out.println("Name" +result.getString(1) +"Nickname" +result.getString(2));
        }
	}

}
