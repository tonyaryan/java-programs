import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.text.*;


class Myframe extends JFrame
{
	 JLabel lbl;

	Myframe()
	{
		
		setLayout(new FlowLayout());
		lbl=new JLabel("                                          ");

		add(lbl);

		Thread tobj=new Thread()
		              {
		              	public void run()
                        	{
	                           	while(true)
		                           {
			                            java.util.Date dobj=new java.util.Date(System.currentTimeMillis());
                                        lbl.setText(String.valueOf(dobj));
                                          try{Thread.sleep(1000);}catch(InterruptedException e){}
                                   }
	                        } 
		              };
		              
		tobj.start();

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




class Demo
{
	public static void main(String[] args) {
		
		Myframe obj=new Myframe();

	}
}