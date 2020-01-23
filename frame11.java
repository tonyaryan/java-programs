import java.awt.*;
import java.awt.event.*;
class MyListener implements ActionListener
{
     public void actionPerformed(ActionEvent e)
     {
        Button b=(Button)e.getSource();
     	System.out.println("\""+b.getLabel()+"\" get cicked");
     }


     class MyMouse implements MouseListener
     {
        public void mouseClicked(MouseEvent e)
        {
            System.out.println(" mouse get clicked");
        }
        public void mouseEntered(MouseEvent e)
        {
             System.out.println(" mouse entered the window");
        }
        public void mouseExited(MouseEvent e)
        {
            System.out.println(" mouse exited from window");
        }
        public void mouseReleased(MouseEvent e)
        {
            System.out.println(" mouse released");   
        }
        public void mousePressed(MouseEvent e)
        {
            System.out.println(" mouse pressed");
        }
     }

     class MyKey implements KeyListener
     {
        public void keyPressed(KeyEvent e)
        {
            System.out.println(" key pressed");
        }
        public void keyReleased(KeyEvent e)
        {
            System.out.println(" key released");
        }
        public void keyTyped(KeyEvent e)
        {
            System.out.println(" key typed");
        }
     }
}


class MyFrame extends Frame
{
     Button btn;

     TextArea ta;

     MyFrame()
     {
     	btn=new Button("OK");
        ta=new TextArea();
     	setLayout(new FlowLayout());
     	add(btn);
        add(ta);
      MyListener mobj=new MyListener();
     MyListener.MyMouse mobj1=mobj.new MyMouse();
     MyListener.MyKey  kobj=mobj.new MyKey();
           btn.addActionListener(mobj);
           this.addMouseListener(mobj1);
           ta.addKeyListener(kobj);
         setSize(300,300);
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