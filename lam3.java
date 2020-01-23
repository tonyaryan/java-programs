interface MyMath
{
	int sum(int x,int y);
}

class Alpha
{
	static void compute(MyMath ob,int x,int y)
	{
		System.out.println("res = " + ob.sum(x,y));
	}
}

class Demo
{
	public static void main(String[] args) {
		
		Alpha.compute((a,b)->{return a+b;},5,6);
		Alpha.compute((a,b)->{return (a*a)+(b*b);},5,6);
	}
}