import java.util.*;

class abc extends Thread
{
	StringBuffer temp;
     abc(StringBuffer s){temp=s;}
	public void run()
	{
	}
}

class Demo
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();

   abc obj=new abc(sb)
                {
                	
                	public void run()
                	{
                		for(char c=65;c<91;c++)
                		{
                            temp.append(c);
                            System.out.println("appending");
                			try{Thread.sleep(500);}catch(InterruptedException e){}

                		}
                	}
                };

     


   abc obj1=new abc(sb)
                {
                	
                	public void run()
                	{
                		for(char c=97;c<123;c++)
                		{
                            temp.append(c);
                            System.out.println("appending");
                			try{Thread.sleep(500);}catch(InterruptedException e){}

                		}
                	}
                };
                
       //obj.start();

      obj1.start();

System.out.println(sb);

	}
}