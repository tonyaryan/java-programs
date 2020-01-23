import java.sql.*;
import java.sql.DriverManager;
import java.util.*;


class Demo
{
	public static void main(String args[])
	{
        try
        {
           Connection conn=null;

           Class.forName("oracle.jdbc.driver.OracleDriver");
           conn=Drivermanager.getConnection("jdbc:oracle:thi:@localhost:1521:xe","gyanhouse","oracle");

           Statement stmt=conn.createStatement();

           ResultSet rs=stmt.executeQuery("select * from modi_staff");

           while(rs.next())
           {
              System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
           }

           stmt.close();  conn.close();

        }
        catch(ClassnotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStacktrace();
        }
	}
}



// to create two way link list based result set use following form of create statement method
// Statement createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                              //int ResultSetType             , int ResultSetConcurrency