import java.io.*;
  class ReadEmp
        { public static void main(String args[]) throws  IOException
               {  FileInputStream   fin =new FileInputStream( "/Users/aryanmalik/programming/ioprogs/abc.txt");
                   ObjectInputStream din = new ObjectInputStream( fin );
                    try 
                            {

                                    Emp  eobj;
                                    eobj  =           (Emp) din.readObject();    

                            //     public  Object  readObject ()   throws ClassNotFoundException ,IOException


                                           eobj.showData();

                  }catch(Exception e)
                                                      { System.out.println(e); }
               din.close();
               fin.close();  
            }
       }



       // to read and write more than one object in a file study externalization interface