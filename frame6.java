import java.awt.*;
import java.awt.event.*;


class MyFrame extends java.awt.Frame
{
     Button btn;
     

     MyFrame()
     {
     	btn=new Button("OK");
     	super.setLayout(new FlowLayout());
     	super.add(btn);
        super.setSize(446,550);
     	super.setVisible(true);
     }
}


class Demo
{
	public static void main(String[] args) {
		new MyFrame();
	}
}