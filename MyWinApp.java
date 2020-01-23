import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.sql.*;
public class MyWinApp extends JFrame implements ActionListener {
	
	private JLabel lbid,lbname,lbsalary;
	private  JTextField  tfid, tfname,tfsalary;
	private  JButton btn;
	private  Connection conn =null;
	private  Statement  stmt= null;
	MyWinApp()
	{
		 lbid  = new JLabel("Enter id");
          tfid   = new JTextField(20);
          
          lbname  = new JLabel("Enter name");
          tfname   = new JTextField(20);
          
          lbsalary  = new JLabel("Enter salary");
          tfsalary   = new JTextField(20);
          
		  setLayout( new FlowLayout());
		  add( lbid);  add(  tfid);
		  add( lbname);  add(  tfname);
		  add( lbsalary);  add(  tfsalary);
		  add ( btn   = new JButton("save"));    btn.addActionListener( this);
		   try
	          {
        Class.forName( "oracle.jdbc.driver.OracleDriver");
	    conn  =   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","gyanhouse","oracle");
	    stmt  =   conn.createStatement() ;
	          }catch ( ClassNotFoundException e)
		            { e.printStackTrace(); }
		       catch ( SQLException  e)
		            { e.printStackTrace();  }
		   
 
		setSize(300,300); setVisible(true);
		setDefaultCloseOperation ( JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) 
	 {
		try
		{

         stmt.executeUpdate( "insert into   modi_staff values( " + tfid.getText()  +  " , '"+ tfname.getText() + "',"  + tfsalary.getText()  + ")"  );
		}catch ( SQLException  e)
		{
			e.printStackTrace();
		}
		 tfid.setText("");
		 tfname.setText("");
		 tfsalary.setText("");
	 }

	public static void main(String[] args) {     new  MyWinApp(); }

}















