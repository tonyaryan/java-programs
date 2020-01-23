import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.text.*;


class Myframe extends JFrame
{
	static int counter=0;

	Myframe()
	{
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		

		if((counter%2)==0)
		{
			Runnable robj=
			      
			      	()->{

			      		int i=0;
		                   while(true)
	                     	{
                              this.setLocation(i,300);
                              if(i==420){break;}
                              try{Thread.sleep(15);}catch(InterruptedException e){}
                              i+=5;
	                    	}
	                    };

			      
              Thread t1=new Thread(robj);
              t1.start();
		}
		else if((counter%2)!=0)
		{
			Runnable robj1=
			      
			      	()->{

			      		int i=1140;
		                   while(true)
	                     	{
                              this.setLocation(i,300);
                              if(i==720){break;}
                              try{Thread.sleep(15);}catch(InterruptedException e){}
                              i-=5;
	                    	}
	                    };
			      

			Thread t2=new Thread(robj1);
			t2.start();
		}


		counter++;
	}
}

class Demo
{
	public static void main(String[] args) 
	{
          new Myframe();
          new Myframe();
	}
}