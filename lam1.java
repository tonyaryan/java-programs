interface Alpha
{
	default void welcome()
	{
		System.out.println("Good Mrng");
	}

	void greeting();
}

class Demo
{
	public static void main(String[] args) {
		
		Alpha ob1=() -> {System.out.println("Bye Bye\n");};        //while writing lambda exp  ref variable is necessary

		ob1.welcome();
		ob1.greeting();

        Alpha ob2=() -> {System.out.println("See ya later \n");};   //while writing lambda exp  ref variable is necessary

		ob2.welcome();
		ob2.greeting();


	}
}