

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }


  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }

  import java.awt.*; 
  import java.io.*;
   import   java.awt.event.*;
   import  javax.swing.*;


  class BorderDemo   extends  JFrame  implements  ActionListener 
     {     JButton  btn;      JTextArea ta;   JTextField tf ;  
            JScrollPane  jp;
       public BorderDemo()
          {
                 Font  f   = new Font(  "courier" ,  Font.BOLD ,  20 )  ;

                tf=new JTextField();                       tf.setFont( f );

                btn=new JButton("Open");            btn.setFont ( f  ) ;


                ta=new JTextArea(2,2);                  ta.setFont( f );

                 jp    = new  JScrollPane(  ta );


               setLayout( new BorderLayout() );


                add(tf, BorderLayout.NORTH);     
                add(btn , BorderLayout.SOUTH);                btn.addActionListener( this ) ;
                add( jp , BorderLayout.CENTER) ;

                setSize(200,200); setVisible(true);  setBackground( Color.RED  );

           }
           public static void main(String args[])         {          new BorderDemo();       }

           public void  actionPerformed ( ActionEvent e )
               {
                       
                    JFileChooser chooser = new JFileChooser();
                                    chooser.showOpenDialog(this );
                                 File  fobj   =    chooser.getSelectedFile();
                                 tf.setText(  fobj.toString()  );
                                  this.setTitle(   fobj.getName()  );
                  try   {
                      FileInputStream  fout    = new FileInputStream( fobj );
                     int  x    ;
                      StringBuffer  sb    = new StringBuffer(  1000 );
                      while(true)
                          {
                               x    =  fout.read() ;
                                 if ( x    ==    -1 )     { break;   }
                                   sb.append( (char) x );                                         
                          }

                             ta.setText(  String.valueOf( sb ) );     

                         }  catch (  IOException ee  )     
                               {
                                      ta.setText("Unable to open ");
                               }

               }
        }


