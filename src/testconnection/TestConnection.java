package testconnection;

import java.sql.*;

public class TestConnection 
{
    public static void main(String args[])
    {
        String url="jdbc:mysql://localhost:3306/user";
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con=DriverManager.getConnection(url,"root","admin");
            System.out.println("Connection Established");
            con.close();
        }
        catch(ClassNotFoundException e) 
        {
            System.out.println("Driver Not Loaded");
        }
        catch(SQLException e)
        {
            System.out.println("Connection not established");
        }
    }
}
