class Car
{
	public void driving()
	{
		System.out.println("normal driving experience");
	}
}
class Skoda extends Car
{
	public void driving()
	{
	    System.out.println("safe driving experience");	
	}
}
class Benz  extends Car
{
	public void driving()
	{
		System.out.println("luxury driving experience");
	}
}
class BMW  extends Car
{
	public void driving()
	{
		System.out.println("low fuel economy driving experience");
	}
}

class Person
{
	public void testDrive(Car obj)
	{
        obj.driving();
	}
} 

class Demo
{
	public static void main(String[] args) 
	{
	    Person pobj=new Person();

	    System.out.println("1.  Skoda");
	    System.out.println("2.  Benz");
	    System.out.println("3.  BMW");
	    System.out.println("Enter your choise");
         
         java.util.Scanner cin=new java.util.Scanner(System.in);
         int choise=cin.nextInt();
	    Car x=Demo.getCar(choise);	
if(x!=null)
	    pobj.testDrive(x);
	else
	    System.out.println("Invalid Input");
	}

	public static Car getCar(int ch)
	{
		if(ch==1)
		{
            return new Skoda();
		}
		else if(ch==2)
		{
			return new Benz();
		}
		else if(ch==3)
		{
			return new BMW();
		}
		else
			return null;
	}
}