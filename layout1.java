import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
  class Demo   extends  JFrame  implements ActionListener
     {     JButton b;      JTextArea ta; JTextField tf;   JScrollPane jp;
       public Demo()
           {   b=new JButton("press");       b.setFont(new Font("courier",Font.BOLD,20));
                ta=new JTextArea();      ta.setFont(new Font("courier",Font.BOLD,20));
                      tf=new JTextField(20);     tf.setFont(new Font("courier",Font.BOLD,20));   
                          setLayout( new BorderLayout());       

                          jp=new JScrollPane(ta);       
                 
                add(tf, BorderLayout.NORTH);     
                add(b, BorderLayout.SOUTH);               add(jp) ;
                setSize(200,200); setVisible(true);  setBackground( Color.RED  );
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           public static void main(String args[])         {          new Demo();       }
           public void actionPerformed(ActionEvent e){}
        }



