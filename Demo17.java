import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) throws InterruptedException {
		
         try
         {
         	FileOutputStream fout=new FileOutputStream("/Users/aryanmalik/programming/ioprogs/def.txt");
         	PrintStream pout=new PrintStream(fout);
         	PrintStream temp=System.out;              //  copying current reference of monitor buffer 

         	//System.setOut(pout);                     //    redirectiong monitor buffer to some other buffer

         	double sal=23242.23;
         	int age=19;
         	String name="vikas";
            System.err.println(name);
            System.err.println(age);
            System.err.println(sal);

           // System.setOut(temp);                       // retrieving monitor buffer to original reference
            System.err.println("back to monitor");
            System.err.println(name);
            System.err.println(age);
            System.err.println(sal);

         	pout.close();
         	fout.close();
         	
         }
         catch(IOException e){e.printStackTrace();}


	}
}