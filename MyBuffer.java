import java.util.*;
import java.io.*;

class MyBuffer implements AutoCloseable
{
	MyBuffer()
	{
		System.out.println("opening of buffer");
	}

	public void read()
	{
		System.out.println("performing read operation");
		for(int i=0;i<=20;i++)
		{
			System.out.println("...");
		
		    try{Thread.sleep(100);}catch(InterruptedException e){}
	    }
	}
	public void close()
	{
		System.out.println("closing of buffer");
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		try(MyBuffer mobj=new MyBuffer() )
		{
			System.out.println("in try");
			mobj.read();
			int x=5/0;
			System.out.println("exiting from try block");
		}catch(NumberFormatException e){System.out.println("div problem");}
	}
}



//if buffer is opened with try resourece statement then it will close definitely weather any other exception arises handled or unhandled;