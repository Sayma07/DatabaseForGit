package page;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabasePage{

public static String getData(String columnName) throws ClassNotFoundException, SQLException
{	

// Setting properties for mysql
Class.forName("com.mysql.cj.jdbc.Driver");
//creating a connection to your local database
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ap","root","root");
//empowering the con reference valiable to execute queries
Statement smt=con.createStatement();
//delivering the sql query
ResultSet rs= smt.executeQuery("select * from ap");
while (rs.next()) {
	return rs.getString(columnName);
}
return columnName;

}}


