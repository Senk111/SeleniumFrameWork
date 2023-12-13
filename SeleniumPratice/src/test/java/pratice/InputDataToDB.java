package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InputDataToDB {

	public static void main(String[] args) throws Throwable 
	{
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "36chinatown");
		Statement state = conn.createStatement();
		String query = "insert into qspiders(first_name,Last_name,adress) values ('clarice','kinshh','wonderla')";
		int result = state.executeUpdate(query);
		
		if (result==1) 
		{
			System.out.println("Data Updated to DB");
			
		} else 
		{
			System.out.println("Data Not Updated in DB");
		}
		conn.close();
		
	}

}
