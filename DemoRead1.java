import java.io.*;
  class DemoRead1
   {
	     public static void main(String args [] )
		 {
			try
			{
FileInputStream fin = new FileInputStream("d:\\javadata\\data.txt");
DataInputStream  din    = new DataInputStream( fin );
			int  age;
			double salary;
			String name;
			
			
		name =	din.readUTF(  );
		age =	din.readInt(  );
		salary =	din.readDouble(  );
		
		System.out.println(  name  +  "   "    + age +  "   "   + salary + " salary after inc" + (salary +1000));
		
		          din.close();	
				fin.close();
			} catch ( IOException e)
			{  e.printStackTrace();   }
		 }
   }
	 