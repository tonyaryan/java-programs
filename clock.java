import java.util.*;
import java.text.*;
import java.awt.*;
import javax.swing.*;

class Myclock extends JFrame
{
private JLabel jb;

   public Myclock()
   {

   	jb=new JLabel("                                        ");

   	setLayout(new FlowLayout());
   	add(jb);
   	setSize(300,300);
   	setVisible(true);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   	
   	try{
   		
   		while(true)
   		{
   			Date dobj=new Date(System.currentTimeMillis());
   			jb.setText(String.valueOf(dobj));
   		Thread.sleep(1000);
   	    }
   	}catch(InterruptedException e){}

   }	
   public static void main(String[] args) {
   	new Myclock();
   }
}