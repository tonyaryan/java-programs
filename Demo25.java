/*   BufferedReader
         high level character oriented stream
         popular for its onl one method     ie getLine()

         public String readLine()
                  can read one line of text from concerned loe level charachter oriented stream 

                  in case of end of line readLine() will retuen null
         */

 import java.util.*;
 import java.io.*;

 class Demo
 {
 	public static void main(String[] args) throws InterruptedException
 	{

 		try
 		{
 			String str=null;
 			FileReader fin=new FileReader("/Users/aryanmalik/programming/ioprogs/Demo1.java");
 			BufferedReader br=new BufferedReader(fin);
 
               while(true)
               {
 			str=br.readLine();
 			   if(str==null)
 			   	break;

 			System.out.println(str);
 			Thread.sleep(100);
 			   }
           
            br.close();
 			fin.close();
 			
 		}catch(IOException e){e.printStackTrace();}
 	}
 }