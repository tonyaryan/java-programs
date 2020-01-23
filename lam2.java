class Beta
{
	void show()
	{
		System.out.println("Beta show");
	}
}

interface Alpha
{
	void action(Beta ob);
}


class Demo
{
	public static void main(String[] args) {
		
		Alpha obj=(x)->{x.show();};
		obj.action(new Beta());
	}
}