 import javax.swing.*;
 import java.awt.*;
   import java.awt.event.*;
      public   class    MySum  extends   JFrame  implements  ActionListener
                     {     JTextField  tf1,tf2,tf3;   
                             JButton  btnsum;
                                MySum( )
                                  {  setLayout( new FlowLayout()  ) ;
                                      add (  tf1  = new JTextField(20 )  );
                                      add (  tf2  = new JTextField(20 )  );
                                      add (  btnsum  =  new  JButton("add") );

                                      add (  tf3  = new JTextField(20 )  );

                                            tf3.setEditable(false);
                                         
                                            btnsum.addActionListener( this );

                                         setSize( 250,250);                 setVisible(true);  
                                         setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
                                         getContentPane().setBackground(Color.RED);
                                 }
                          public    void actionPerformed(ActionEvent e)  
                                   {           
                                       
                                        int  x =0 ,y=0,z=0;
                                       
                                                  x    =   Integer.parseInt(tf1.getText()) ;   // Identify Issue          public  String  getText()
                                                  y    =   Integer.parseInt(tf2.getText()) ;   //  here we need conversion of  String into  int
                                                     
                                                              z   = x + y;   
                                                 
                                                              tf3.setText(  String.valueOf(z)   ) ;  // Identify issue      public  void  setText( String str)
                                                                                                    //  here we need conversion of  z  into String 
                                  }
                    
                      public static void main(String args[] )                  {     new   MySum() ;                }           

               }
         
