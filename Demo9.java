class Diary implements Runnable
{
	public void run()
	{Thread t=Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Diary..."+i+" "+t.getName());
			try{Thread.sleep(2200);}catch(InterruptedException e){}
		}
	}
}

class Dispatch implements Runnable
{
	public void run()
	{Thread t=Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Dispatch..."+i+" "+t.getName());
			try{Thread.sleep(1200);}catch(InterruptedException e){}
		}
	}
}


class Demo
{
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Diary(),"rupesh");
		Thread t2=new Thread(new Dispatch(),"arun");
		t1.start();   t2.start();

		for(int i=1;i<=10;i++)
		{
			System.out.println("Manager says m watching do ur work fast..."+i);
			if(i==5)
				{
					System.out.println("toooooo slow m giving 2 more sec to finish...");
					t1.join();    t2.join();
				}
			try{Thread.sleep(500);}catch(InterruptedException e){}
		}
	}
}

