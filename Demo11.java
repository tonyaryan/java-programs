

import java.io.*;


class Demo
{
	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream("/Users/aryanmalik/programming/ioprogs/abc.txt");
			DataInputStream din=new DataInputStream(fin);
		

             String name;
             double sal;
             int age;

           name=din.readUTF();
           age=din.readInt();
           sal=din.readDouble();

           System.out.println(name+" "+age+" "+sal+" sal after inc"+(sal+1000));


            din.close();
			fin.close();
		}catch(IOException e){e.printStackTrace();}
	}
}

