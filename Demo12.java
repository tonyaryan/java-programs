

import java.io.*;
import java.util.*;

class Demo
{
	public static void main(String[] args) {

            Scanner cin=new Scanner(System.in);
		
    try
		{
			FileOutputStream fout=new FileOutputStream("/Users/aryanmalik/programming/ioprogs/abc.txt",true);
			DataOutputStream dout=new DataOutputStream(fout);
		

             String name;
             double sal;
             int age;


             System.out.println("Enter name");
             name=cin.nextLine();

             System.out.println("Enter age");
             age=cin.nextInt();

             System.out.println("Enter sal");
             sal=cin.nextDouble();

           dout.writeUTF(name);
           dout.writeInt(age);
           dout.writeDouble(sal);


            dout.close();
			fout.close();
		}catch(IOException e){e.printStackTrace();}
	}
}

