import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) 
	{
		try   
		{
			FileReader fin=new FileReader("/Users/aryanmalik/programming/ioprogs/Demo1.java");
			int x;
			while(true)
			{
				x=fin.read();
				if(x==-1)
					break;
				System.out.print((char)x);
			}

			fin.close();

		}catch(IOException e){System.out.println("some issue");}
	}
}

