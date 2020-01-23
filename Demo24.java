import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		try   
		{
			FileWriter fout=new FileWriter("/Users/aryanmalik/programming/ioprogs/xyz.txt");
			
			System.out.println("Enter name");
			String name=cin.nextLine();
			System.out.println("Enter age");
			int age=cin.nextInt();
			System.out.println("Enter sal");
			double sal=cin.nextDouble();

			fout.write(name);
			fout.write("\n");
			fout.write(String.valueOf(age));
			fout.write("\n");
			fout.write(String.valueOf(sal));


			fout.close();

		}catch(IOException e){System.out.println("some issue");}
	}
}

