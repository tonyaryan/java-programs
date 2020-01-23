class MyException extends RuntimeException
{
	MyException()
	{
		super();
	}

	MyException(String str)
	{
		super(str);
	}
}

class Demo
{
	public static void main(String[] args) {
		
		try
		{
			throw new MyException("some excp");
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}