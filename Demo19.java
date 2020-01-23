import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String[] args) throws IOException
	{
		int x;

          while(true)
          {
          	x=System.in.read();
          	if(x==10)
          	{
          		break;
          	}
		System.out.print((char)x);
          }
		
	}
}