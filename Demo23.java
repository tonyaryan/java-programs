import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) 
	{
		try   
		{
			FileWriter fout=new FileWriter("/Users/aryanmalik/programming/ioprogs/xyz.txt");
			
			String name="vikas";
			int age=19;
			double sal=2321.21;

			fout.write(name);
			fout.write("\n");
			fout.write(String.valueOf(age));
			fout.write("\n");
			fout.write(String.valueOf(sal));


			fout.close();

		}catch(IOException e){System.out.println("some issue");}
	}
}

