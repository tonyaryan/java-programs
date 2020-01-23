import java.sql.*;
import java.util.*;
import  static  java.lang.System.out;
 class DemoJdbc8
{	public static void main(String[] args) 
	  {   
                         Scanner cin    = new Scanner ( System.in);
                        try
                            {
                               Connection conn=null;      
                               Class.forName( "oracle.jdbc.driver.OracleDriver");
	              conn  =   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                                Statement      stmt    =      conn.createStatement(  ) ;
                               System.out.print ("Enter table name ");
                                  String tablename    = cin.nextLine();
                                          ResultSet  rs  =  stmt.executeQuery ("  select  * from   " + tablename);                 
                            ResultSetMetaData  rsmd   =   rs.getMetaData();

                                      for(  int i =1  ; i <= rsmd.getColumnCount()  ; i++)
                                             {
                                                out.print(  rsmd.getColumnName( i )  +  "         " );
                                             }
                                        System.out.println();

                                      while (  rs.next()  )
                                                  {
                                                     for(  int i =1  ; i <= rsmd.getColumnCount()  ; i++)
                                                                 {
                                                                     out.print(  rs.getString( i )  +  "         " );
                                                                  }
                                                       out.println();
                        try   { Thread.sleep(1000);    }  catch ( InterruptedException e    )  {}
                                             }



                               stmt.close();                         conn.close();    
                      }catch ( ClassNotFoundException e )          {	e.printStackTrace();   }
                        catch ( SQLException e)                              {	e.printStackTrace();  }
           }
   }
