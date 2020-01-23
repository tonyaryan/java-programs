  import javax.swing.*;
       import java.awt.*;
       import java.awt.event.*;
       class  MyFrame11  extends JFrame implements ActionListener
             {
                 JTextField tf;
                 JButton   btn;
                 MyFrame11()
                      {
                          tf = new JTextField(20);
                          btn = new JButton("ok");
                          setLayout( new FlowLayout() );
                          add(btn);
                          add(tf);
                          btn.addActionListener( this );
                          setSize(200,200); setVisible(true);
                       }
                   public static void main(String args[] )
                       {
                             new MyFrame11();
                       }
                   public void  actionPerformed( ActionEvent e )
                         {
                 int  x;
                 double y;
                             
                    x  =   Integer.parseInt (  tf.getText() );
                    y  =   Double.parseDouble( tf.getText() );
                            
                            System.out.println( " x  =  "  +  x );
                            System.out.println( " y  =  "  +  y );                                                                                                               
                         }                         
             }          