import java.util.*;
import java.text.*;

class Demo 
{ 
	public static void main(String[] args) throws ParseException{
		
	
	Scanner cin=new Scanner(System.in);
	System.out.println("enter some date dd-MMM-yyyy");
	String str=cin.nextLine();

	SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");

	Date dobj=sdf.parse(str);
	System.out.println(dobj);
}
}