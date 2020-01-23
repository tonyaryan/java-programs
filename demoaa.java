/*when a java class get loaded in memory

  java Demo
  new Rect()
  Alpha.show()
  Alpha.x
*/

class Alpha
{
	static{
		System.out.println("Alpha loading");
	}

	static int x=90;
	static void aFoo()
	{
		System.out.println("in aFoo");
	}
}

class Beta
{
	static
	{
		System.out.println("Beta loading");
	}
}
class Demo
{
	static
	{
		System.out.println("Demo loading");
	}
	public static void main(String[] args) {

         try{
		        Class.forName(args[0]);
		        System.out.println("rqstd class loaded successfully");
		    }
		    catch(Exception e)
		    {
		    	System.out.println("pass class name");
		    }

		    System.out.println("Exiting from main");
	}
}


