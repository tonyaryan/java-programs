class Wood
{
	static
	{
		System.out.println("Wood Loading");
	}
	public Wood()
	{
		System.out.println("Wood const get fired");
	}
}

class Chair extends Wood
{
	static
		{
              System.out.println("Chair Loading");
		}
		public Chair()
		{
			System.out.println("Chair const get fired");
		}

}
class Demo
{
	public static void main(String[] args) {
		
		new Chair();
		new Chair();
	}
}