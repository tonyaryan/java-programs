import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
     Button btn;

public void actionPerformed(ActionEvent e)
     {
         Button b=(Button)e.getSource();
         System.out.println("\""+b.getLabel()+"\" get cicked");
     }

     MyFrame()
     {
     	btn=new Button("OK");
     	setLayout(new FlowLayout());
     	add(btn);
      
           btn.addActionListener(this);
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