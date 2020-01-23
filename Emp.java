class Emp
{
	private int id;
	private String name;
	private double salary;

	Emp()
	{
		id=0;
		name="NoName";
		salary=0.0;
	}
	
	Emp(String n,int i,double sal)
	{
		id=i;
		name=n;
		salary=sal;
	}

   public String toString()
   {
   	return "\n  Name   :    "+name+"\n  ID     :    "+id+"\n  Salary :    "+salary+"\n";
   }
}

class Demo
{
	public static void main(String[] args) 
	{
	     Emp obj1=new Emp("Arun",102,34556);
	     System.out.println(obj1);
	     Emp obj2=new Emp();
	     System.out.println(obj2);
	         	
	}
}