import java.sql.*;
import java.util.*;
import  static  java.lang.System.out;
 class DemoJdbc7
{	public static void main(String[] args) 
	  {    int id =0;  String nm   =null;  int salary   =0;  String  ans;
                        try
                            {
                               Connection conn=null;     int counter =0;
                               Class.forName( "oracle.jdbc.driver.OracleDriver");
	              conn  =   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                               PreparedStatement      stmt    =      conn.prepareStatement( "insert into staff values(?,?,?) " ) ;
                               Scanner  cin    = new Scanner (System.in );
                            do
                             {
                               out.print("  Enter  id  ");            id    =  cin.nextInt();
                               out.print("  Enter  name  ");       cin.nextLine();
                                                                                                nm    = cin.nextLine();
                               out.print("  Enter  salary  ");
                               salary     =   cin.nextInt();
                                      stmt.setInt( 1,  id );
                                      stmt.setString( 2,  nm );
                                      stmt.setInt( 3,  salary );
                                 
                                       stmt.addBatch();  counter++;
                                         if ( counter   == 3 )    {  stmt.executeBatch();  counter =0; }
                                  System.out.println(" wld u like to input one more record   y / n ");
                                                 cin.nextLine();  // used to clear buffer
                                   ans   =  cin.nextLine();
                               } while ( ans.equals("y") ) ;
                                        if (  counter  !=  0 )
                                               {  stmt.executeUpdate();   }

                               stmt.close();                         conn.close();    
                      }catch ( ClassNotFoundException e )          {	e.printStackTrace();   }
                        catch ( SQLException e)                              {	e.printStackTrace();  }
           }


	
	
	
}
