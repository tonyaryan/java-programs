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

         	System.setOut(pout);                     //    redirectiong monitor buffer to some other buffer

         	double sal=23242.23;
         	int age=19;
         	String name="vikas";
            System.out.println(name);
            System.out.println(age);
            System.out.println(sal);

            System.setOut(temp);                       // retrieving monitor buffer to original reference
            System.out.println("back to monitor");
            System.out.println(name);
            System.out.println(age);
            System.out.println(sal);

         	pout.close();
         	fout.close();
         	
         }
         catch(IOException e){e.printStackTrace();}


	}
}