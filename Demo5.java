

class DiaryWork implements Runnable
{
	public void run()
	{
		Thread temp=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println("Diary ..."+(i+1)+temp.getName());
			try{Thread.sleep(500);}catch(InterruptedException e){}
		}
	}
}


class Dispatch implements Runnable
{
	public void run()
	{
		Thread temp=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println("dispatch ..."+(i+1)+temp.getName());
			try{Thread.sleep(500);}catch(InterruptedException e){}
		}
	}
}


class Demo
{
	public static void main(String[] args) {
		

		Thread t1=new Thread(new DiaryWork(),"mohit");
		        t1.start();

		Thread t2=new Thread(new Dispatch(),"rohit");
		        t2.start();
	}
}