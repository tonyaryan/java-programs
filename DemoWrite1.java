import java.io.*;
  class DemoWrite1
   {
	     public static void main(String args [] )
		 {
			try
			{
FileOutputStream fout = new FileOutputStream("d:\\javadata\\data.txt");
DataOutputStream  dout    = new DataOutputStream( fout );
			int  age=19;
			double salary=12333.344;
			String name ="vikas";
			dout.writeUTF( name );
			dout.writeInt( age );
			dout.writeDouble( salary );
		          dout.close();	
				fout.close();
			} catch ( IOException e)
			{  e.printStackTrace();   }
		 }
   }
	 
	 
	 
	 
	 
	 
	 
		 











							  

