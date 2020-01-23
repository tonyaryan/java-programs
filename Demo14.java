import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) {
		
         try
         {
         	FileOutputStream fout=new FileOutputStream("/Users/aryanmalik/programming/ioprogs/def.txt");
         	PrintStream pout=new PrintStream(fout);

         	double sal=23242.23;
         	int age=19;
         	String name="vikas";

         	pout.println(name);
         	pout.println(age);
         	pout.println(sal);


         	pout.close();
         	fout.close();
         	
         }
         catch(IOException e){e.printStackTrace();}


	}
}