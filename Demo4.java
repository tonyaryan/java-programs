/*
    defining working of thread using runnable interface
*/

class Reading implements Runnable
{
	public void run()
	{
		Thread temp=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println("reading ..."+temp.getName());
			try{Thread.sleep(1000);}catch(InterruptedException e){}
		}
	}
}


class Demo
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread();               
		    t1.start();
		System.out.println(t1.getName());
    
    	Thread t2=new Thread("mahesh");
		    t2.start();
		System.out.println(t2.getName());
	
		Thread t3=new Thread(new Reading());
		    t3.start();
		System.out.println(t3.getName());
	
		Thread t4=new Thread(new Reading(),"modi");
		    t4.start();
		System.out.println(t4.getName());
		
	}
}

/*        

          interface Runnable 
          {
	         void run()
	         {}
          }


          class Thread extends Object implements Runnable
          {
	         private thname;
	         static int counter=0;
	         Runnable target=null;

	             Thread()
	             {
	                 thname="Thread-"+counter;
	                 counter++;
	             }
	             
	             Thread(String name)
	             {
	                 thname=name;
	             }
	             
	             Thread(Runnable t)
	             {
	                 thname="Thread-"+counter;
	                 counter++;
	                 target =t;
	             }
	             
	             Thread(Runnable t,String name)
	             {
	                 thname=name;
	                 target=t;
	             }


	             public void run()
	             {
	                 if(target!=null)
	                  {target.run();}
	             }
          }



*/