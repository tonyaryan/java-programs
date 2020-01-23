import java.io.*;
import java.util.*;
  class DemoWrite2
   {
	     public static void main(String args [] )
		 { Scanner cin    = new Scanner ( System.in);
			try
			{
FileOutputStream fout = new FileOutputStream("d:\\javadata\\data.txt",true);
DataOutputStream  dout    = new DataOutputStream( fout );
			int  age;
			double salary;
			String name ;
			System.out.print(" Enter name ") ;  name   = cin.nextLine();
			System.out.print(" Enter age ") ;  age   = cin.nextInt();
			System.out.print(" Enter salary ") ;  salary   = cin.nextDouble();
			
			dout.writeUTF( name );
			dout.writeInt( age );
			dout.writeDouble( salary );
		          dout.close();	
				fout.close();
			} catch ( IOException e)
			{  e.printStackTrace();   }
		 }
   }
	 
	 
	 
	 
	 
	 
	 
		 











							  

