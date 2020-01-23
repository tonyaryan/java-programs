class User extends Thread
{
 	String msg;
 	Printer prn;
           User(){}
           User(Printer p,String s)
           {
                prn=p;
                msg=s;
           }
           public void run()
           {
           	synchronized(prn)
           	{
           	    prn.print(this.msg);
           	}
           }
}

class Cafe
{
	public static void main(String[] args) {
		
		Printer prn =new Printer();

		User u1=new User(prn,"First");
		User u2=new User(prn,"Second");
		User u3=new User(prn,"Third");

		u1.start();u2.start();u3.start();
	}
}

class Printer
{
	public void print(String str)
	{
		System.out.print("[");
         for(char v:str.toCharArray())
         {
         	System.out.print(v+", ");
         	try{Thread.sleep(100);}catch(InterruptedException e){}
         }
         System.out.print("]");
	}
}