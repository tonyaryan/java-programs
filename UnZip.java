
         import java.io.*;
          import java.util.zip.*;

       class UnZip
        {
                public static void main(String args[] ) throws Exception
                    {
             FileInputStream  fis = new FileInputStream("/Users/aryanmalik/programming/ioprogs/myzpfile");  // src zipped file

    FileOutputStream  fos   = new FileOutputStream ("/Users/aryanmalik/programming/ioprogs/modi.java");   // unzipped destination file

             InflaterInputStream  iis  =  new  InflaterInputStream(fis);

              int  data;      

                           while (   true )
                                 {
                                       data = iis.read() ;
                                       if ( data  == -1 )    { break;  }
                                 
                                         fos.write( data );
                                 }
                       fis.close();
                        iis.close();
                    fos.close();
           }
  }
