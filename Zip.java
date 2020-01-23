         import java.io.*;
         import java.util.zip.*;

       class Zip
        {
                public static void main(String args[] ) throws Exception
                    {

                FileInputStream  fis = new FileInputStream ("/Users/aryanmalik/programming/ioprogs/BorderDemo.java");

                FileOutputStream  fos   = new FileOutputStream ("/Users/aryanmalik/programming/ioprogs/myzpfile");

                 DeflaterOutputStream  dos  =  new  DeflaterOutputStream(fos);

                   int  data;      
                           while (  true )
                                 {
                                       data   =  fis.read();
                                       if  (  data  == -1 )
                                              {  break;  }

                                         dos.write( data );
                                 }
                       fis.close();
                       dos.close();
                       
           }
  }
/*This class implements an output stream filter for compressing data in the "deflate" compression format. */

