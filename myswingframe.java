import java.awt.*;
import java.awt.event.*;
       import javax.swing.*;
       class  MySwingFrame   extends  JFrame 
             {
                 JTextField tf;
                 JButton   btn;
                 JLabel    lbl;
                 MySwingFrame()
                      {
                          tf = new   JTextField(20);
                          btn = new JButton("ok");
                            
                      
                        btn.addActionListener((e)->{tf.setText("Hello World");});
                     
                          setLayout( new FlowLayout() );
                        add(btn);
                        add(tf);
                          setSize(200,200); setVisible(true);
                          getContentPane().setBackground(Color.GREEN);

                       super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                       }
                   public static void main(String args[] )
                       {      new MySwingFrame();  
                            
                           }


                     }