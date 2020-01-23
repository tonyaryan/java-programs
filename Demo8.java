import java.util.*;
import java.awt.*;



class Myframe extends Frame implements Runnable
{
	private Label lbl;
	private Thread t1;

	Myframe()
	{
		   lbl=new Label("                     ");
		   lbl.setFont(new Font("courier",Font.BOLD,20));
		   setLayout(new FlowLayout());
		   add(lbl);
		   t1=new Thread(this);t1.start();
		   setLocation(420,0);
		   setSize(300,300); setVisible(true);
	}

	public void run()
	{
			while(true)
		                           {
			                            java.util.Date dobj=new java.util.Date(System.currentTimeMillis());
                                        lbl.setText(String.valueOf(dobj));
                                          try{Thread.sleep(1000);}catch(InterruptedException e){}
                                   }
	}

	public static void main(String[] args) {
		new Myframe();
	}
}