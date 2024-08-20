import java.sql.*;

public class Mydb {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	       try {
				Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "komalroot");//Establishing connection
				System.out.println("Connected With the database successfully");
				
			} catch (SQLException e) {
				
				System.out.println("Error while connecting to the database");
			
					}
			}

		
	}


