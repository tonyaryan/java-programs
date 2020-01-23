class Outer
{
	private int x=100;
	private static int y=90;

	class Inner
	{
		public void show()
		{
			System.out.println("x= "+x);
			System.out.println("y= "+y);
		}
	}
}

class Demo
{
	public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner inobj=obj.new Inner();

		inobj.show();
	}
}