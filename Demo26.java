/*       use of BridgeStream. 
            some time we want to convert data from byte stream to character oriented stream

            eg.    in case of System.in to BufferedReader
         to read data from keyboard line wise

           keuboard buffer object is byte type whereas BufferedReader buffer object is of type character oriented stream


           InputStreamReader is used for this purpose
           is a bridge from byte to character orented stream

                class InputStreamReader
                {
                   public InputStreamReader (InputStream in);
                }



*/

import java.util.*;
import java.io.*;


class Demo
{
	public static void main(String[] args) 
	{
		try
		{
			String name=null;

			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);


System.out.println("enter your name");
			name=br.readLine();
System.out.println("name= "+name);
			br.close();
			isr.close();

		}catch(IOException e){e.printStackTrace();}
	}
} 