import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) 
	{
		try(FileInputStream fin=new FileInputStream("/Users/aryanmalik/programming/ioprogs/abc.txt") )   
		{
			byte arr[]=new byte[fin.available()];
			fin.read(arr);

			String str=new String(arr);

			System.out.println(str);

		}catch(IOException e){System.out.println("some issue");}
	}
}

