import java.awt.*;
import java.awt.event.*;
/*class MyListener implements ActionListener
{
     public void actionPerformed(ActionEvent e)
     {
     	System.out.println("btn get cicked");
     }
}*/


class MyFrame extends java.awt.Frame
{
     Button btn;
     Button btn1;

     MyFrame(int x,int y)
     {
     	btn=new Button("OK");
     	btn1=new Button("Cancel");
     	super.setLayout(new FlowLayout());
     	super.add(btn);
        super.add(btn1);
   //        MyListener mobj=new MyListener();
           btn.addActionListener((e)->{System.out.println("btn get clicked");});
           btn1.addActionListener((e)->{System.out.println("cancel get clicked");});

     	super.setLocation(x,y);
     	super.setSize(446,550);
     	super.setVisible(true);
     }
}


class Demo
{
	public static void main(String[] args) {
		new MyFrame(333,444);
	}
}