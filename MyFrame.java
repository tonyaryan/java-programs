import java.awt.*;
import java.awt.event.*;
       import javax.swing.*;
       class  MyFrame   extends  JFrame 
             {
                 JTextField tf;
                 JButton   btn;
                 JLabel    lbl;
                 void initcomponent()
                      {
                          tf = new   JTextField(20);
                          lbl=new JLabel("enter some value");
                          btn = new JButton("ok");
                            
                      
                        btn.addActionListener((e)->{tf.setText("Hello World");});
                     
                          setLayout( new FlowLayout() );
                        add(btn);
                        add(tf);
                          setSize(200,200); 
                          getContentPane().setBackground(Color.GREEN);

                       super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                       }
                       MyFrame()
                       {
                        initcomponent();


                       }
                   public static void main(String args[] )
                       {      new MyFrame().setVisible(true);
                            
                           }


                     }