

import java.util.*;
import java.io.*;


class Demo
{
	public static void main(String[] args) 
	{
		try
		{
			String str=null;

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          FileWriter fout=new FileWriter("/Users/aryanmalik/programming/ioprogs/xyz.txt");

System.out.println("enter qiut in separate line to stop typing");
     while(true)
     {
			str=br.readLine();
			if(str.equals("quit"))
				{break;}
			 fout.write(str);
			 fout.write("\n");
			
     }
              br.close();
             

             
             

              fout.close();
		}catch(IOException e){e.printStackTrace();}
	}
} 