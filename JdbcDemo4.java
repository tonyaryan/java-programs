import java.sql.*;
import java.util.*;
import  static  java.lang.System.out;
public class JdbcDemo4
{	public static void main(String[] args) 
	  {    int id =0;  String nm   =null;  int salary   =0;  String  ans;
                        try
                            {
                               Connection conn=null;
                               Class.forName( "oracle.jdbc.driver.OracleDriver");
	              conn  =   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                               Statement      stmt    =      conn.createStatement() ;
                               Scanner  cin    = new Scanner (System.in );
                            do
                             {
                               out.print("  Enter  id  ");            id    =  cin.nextInt();
                               out.print("  Enter  name  ");       cin.nextLine();
                                                                                                nm    = cin.nextLine();
                               out.print("  Enter  salary  ");
                               salary     =   cin.nextInt();
                               stmt.executeUpdate(    "insert into   staff values( " + id +  " , '"+ nm + "',"  + salary  + ")"   );
                                  System.out.println(" wld u like to input one more record   y / n ");
                                                 cin.nextLine();  // used to clear buffer
                                   ans   =  cin.nextLine();
                               } while ( ans.equals("y") ) ;
                               stmt.close();
                               conn.close();    
                      }catch ( ClassNotFoundException e )          {	e.printStackTrace();   }
                        catch ( SQLException e)                              {	e.printStackTrace();  }
           }


	
	
	
}
