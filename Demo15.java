import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) throws InterruptedException {
		
         try
         {
         	FileOutputStream fout=new FileOutputStream("/Users/aryanmalik/programming/ioprogs/def.txt");
         	PrintStream pout=new PrintStream(fout);

         	double sal=23242.23;
         	int age=19;
         	String name="vikas";

              for(int i=0;i<=20;i++)
              {
         	pout.println(name);
         	pout.println(age);
         	pout.println(sal);
              sal=sal+1000;
              Thread.sleep(1000);
              }

         	pout.close();
         	fout.close();
         	
         }
         catch(IOException e){e.printStackTrace();}


	}
}