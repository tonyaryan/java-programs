import java.awt.*;

class Demo
{
	public static void main(String[] args) {
		Frame obj=new Frame("login");
		
       Label lbl=new Label("enter username");
             lbl.setBackground(Color.RED);
               lbl.setFont(new Font("courier",Font.BOLD,20));
               lbl.setForeground(Color.YELLOW);

             obj.setLayout(new FlowLayout());         
          obj.add(lbl);


		obj.setVisible(true);
		obj.setSize(200,200);
		try{Thread.sleep(4000);} catch(InterruptedException e){}

	}
}