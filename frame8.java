import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame
{
     Button btn;
     Button btn1;

     MyFrame()
     {
     	btn=new Button("OK");
        btn1=new Button("Cancel");
        setLayout(new FlowLayout());
     	add(btn);
        add(btn1);
           btn.addActionListener(
                                   (e)->{
                                             Button b=(Button)e.getSource();
                                             System.out.println("\""+b.getLabel()+"\" get cicked");
                                        }
                                );
           btn1.addActionListener(
                                    (e)->{
                                             Button b=(Button)e.getSource();
                                             System.out.println("\""+b.getLabel()+"\" get cicked");
                                         }
                                );
    	pack();
        setLocation(202,303);
        setVisible(true);
     }
}


class Demo
{
	public static void main(String[] args) 
    {
		new MyFrame();
	}
}