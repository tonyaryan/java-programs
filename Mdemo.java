class Parent
{
	//call to super must be very first statement in child constructor..
	private int money;

	public Parent()
	{
		money=1000;
	}

	public Parent(int m)
	{
		money=m;
	}
	public void show()
	{
	    System.out.println("parent money  ="+money);
    }
}

class Child extends Parent
{
	private int money;

		public Child()
		{
			money=500;
		}
		public Child(int m)
		{
			super(m/2);
			money=m*2;
		}
		public void show()
	{
		super.show();
	    System.out.println("child money  ="+money);
    }

}
class Demo
{
	public static void main(String[] args) {
		
		Child obj =new Child(8000);
		obj.show();
}
}