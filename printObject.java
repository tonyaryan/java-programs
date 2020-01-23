class Demo
{
	public static void main(String[] args) {
		

		Parent obj=null;

		System.out.println(obj);


		obj=new Parent();
		System.out.println(obj);




   /*  System.out.println(Object obj)
        {
	       String.valueOf(obj);
        }




        String.valueOf(Object obj)
        {
	       if(obj==null)
	       {
	          return "null";
	       }
	       else
	          obj.toString();
        }
	}
}