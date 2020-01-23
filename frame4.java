import java.awt.*;
class Demo
{
	public static void main(String[] args) {
		                             
		                             Frame obj=new Frame("login");
		                            TextField tf=new TextField(20);
        
      
                                        tf.setText("newtext");
                                  tf.setBackground(Color.RED);
               tf.setFont(new Font("courier",Font.BOLD,20));
               tf.setForeground(Color.YELLOW);

                     


             obj.setLayout(new FlowLayout());         
          obj.add(tf);


		obj.setVisible(true);
		obj.setSize(400,400);
		try{Thread.sleep(6000);} catch(InterruptedException e){}

                                        System.out.println(tf.getText());

                //  tf.setEditable(false);
  tf.setEditable(false);

	}
}