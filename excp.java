class Demo
{
	public static void main(String[] args) {
		
		int x=5,y=0;
		try
		{
			//int res=x/y;                     
			//System.out.println(res);
			 throw new ArithmeticException("/  division error");
			
		}
		/*catch(ArithmeticException e)
		{
			System.out.println();
			System.out.println();
			

                			e.printStackTrace();
 			

			System.out.println();
			System.out.println();
			

			                System.out.println(e.toString());
			

			System.out.println();
			System.out.println();


			                System.out.println(e.getMessage());


			System.out.println();
		}*/
		catch(NumberFormatException e){}

		
	}
}