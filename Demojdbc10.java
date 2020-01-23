
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo4 extends JFrame implements ActionListener
{
     private JLabel lbid,lbname,tfsalary;
     private JTextField tfid;
     private JPasswordField tfname;
     private JButton login;
     private Connection conn=null;
     private Statement stmt=null;
     private ResultSet rs=null;
    
     Demo4()
     {
         lbid=new JLabel("Username:");
         tfid=new JTextField(20);
         lbname=new JLabel("Password:");
         tfname=new JPasswordField(20);
         tfsalary=new JLabel("                                             ");
         
       

         setLayout(new FlowLayout());
         add(lbid); add(tfid);
         add(lbname); add(tfname);
             add(tfsalary);
            
         add(login=new JButton("Login")); login.addActionListener(this);
         
         try
         {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gyanhouse","oracle");
          stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         } 
         catch(ClassNotFoundException e)
         {
          e.printStackTrace();
         }
         catch(SQLException e)
         {
          e.printStackTrace();
         }

         setSize(300,300);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
   
    
     public void actionPerformed(ActionEvent e)
     {
         char pass[]=tfname.getPassword();
      String str=new String (pass);
        try{
            if(tfid.getText().length()==0 || tfname.getPassword().length==0)
            {tfsalary.setText("username or password is empty");}
         rs=stmt.executeQuery("select * from login where username='"+tfid.getText()+"' and password='"+str+"'");
         if(rs.next())
         {tfsalary.setText("valid");}
         else{tfsalary.setText("invalid username or password");}
           }catch(SQLException epm){epm.printStackTrace();}
      
     }
      public static void main(String[] args) {
        new Demo4();
      }
     }
    

