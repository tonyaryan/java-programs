import java.sql.*;
import java.sql.DriverManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo extends JFrame implements ActionListener
{
     private JLabel lbid,lbname,lbsalary;
     private JTextField tfid,tfname,tfsalary;
     private JButton next,previous,last,first;
     private Connection conn=null;
     private Statement stmt=null;
     private ResultSet rs=null;
     private ResultSetMetaData rsmd=null;
     Demo()
     {
         lbid=new JLabel("ID");
         tfid=new JTextField(20);
         lbname=new JLabel("Name");
         tfname=new JTextField(20);
         lbsalary=new JLabel("Salary");
         tfsalary=new JTextField(20);
         

         setLayout(new FlowLayout());
         add(lbid); add(tfid);
         add(lbname); add(tfname);
         add(lbsalary); add(tfsalary);

         add(first=new JButton("<<")); first.addActionListener(this);
         add(previous=new JButton("<")); previous.addActionListener(this);
         add(next=new JButton(">")); next.addActionListener(this);
         add(last=new JButton(">>")); last.addActionListener(this);

         try
         {
         	Class.forName("oracle.jdbc.driver.OracleDriver");
         	conn=DriverManager.getConnection("jdbc:oracle:thi:@localhost:1521:xe","gyanhouse","oracle");
         	stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         	rs=stmt.executeQuery("select * from modi_staff");
         	rsmd=rs.getMetaData();
         }
         catch(ClassNotFoundException e)
         {
         	e.printStacktrace();
         }
         catch(SQLException e)
         {
         	e.printStacktrace();
         }

         setSize(300,300);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
   
     private void showData()
     {
     	 for(  int i =1  ; i <= rsmd.getColumnCount()  ; )
               {tfid.setText(rs.getString(i)); i++; tfname.setText(rs.getString(i)); i++; tfsalary.setText(rs.getString(i));}
     }

     public void actionPerformed(ActionEvent e)
     {
          Button btn=(Button)e.getSource();
   try{
          if(btn==first)
          {
          	if(rs.first())
          	{showData();}
          }
          else if(btn==previous)
          	{
              if(rs.previous())
               {showData();}
           else
           	{rs.first();}
          	}
          	else if(btn==next)
          	{
          		if(rs.next())
          			{showData();}
          		else
          			{rs.last();}
          	}
          	else if(btn==last)
          	{
          		if(rs.last())
          			{showData();}
          	}
      }

      public static void main(String[] args) {
      	new Demo();
      }
     }
}
