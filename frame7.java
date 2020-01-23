import java.awt.*;
import java.awt.event.*;
class MyListener implements ActionListener
{
     public void actionPerformed(ActionEvent e)
     {
        Button b=(Button)e.getSource();
     	System.out.println("\""+b.getLabel()+"\" get cicked");
     }
}


class MyFrame extends Frame
{
     Button btn;

     MyFrame()
     {
     	btn=new Button("OK");
     	setLayout(new FlowLayout());
     	add(btn);
      MyListener mobj=new MyListener();
           btn.addActionListener(mobj);
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