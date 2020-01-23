import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) throws InterruptedException 
	{
		
         try
         {
         	FileOutputStream fout=new FileOutputStream("/Users/aryanmalik/programming/ioprogs/errlog.txt",true);
         	PrintStream pout=new PrintStream(fout);
         	PrintStream temp=System.err;              

         	System.setErr(pout);
         	
         	int x=Integer.parseInt(args[0]);
         	int y=Integer.parseInt(args[1]);
         	int res=x/y;

         	System.out.println("res = "+res);


         	pout.close();
         	fout.close();
         	
         }
         catch(IOException e){e.printStackTrace();}
         catch(Exception e)
         {
         	java.util.Date dobj=new java.util.Date(System.currentTimeMillis());
         	System.err.println(dobj.toString());
         	e.printStackTrace();
         	System.err.println();
         }

	}
}



//     System.err reference variable
//     points to output buffer for monitor
//   this buffer is used by jvm for printing of exceptio details
//      if required then we can also use this buffer for printing of data
//       e.g  System.err.println("Hello world");
//        ??redirection of err buffer to some file 
//     using setErr() method of system class we can reset this buffer to other low level stream

// after resetting in case of exception 
// jvm will forward exception details of concerned low level stream buffer