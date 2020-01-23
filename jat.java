class Jat
{
	void marriage()
	{
		System.out.println("acc to customs");
	}
}

class Demo
{
	public static void main(String[] args) {
		Jat rohan=new Jat()
		{
			void marriage()
			{
				System.out.println("in my own way");
				aFun();
			}

			void aFun()
			{
			System.out.println("aFun");	
			}
		};
		rohan.marriage();
//Demo$1 obj=(Demo$1)rohan;        invalid
//obj.aFun();                      invalid
	}
}