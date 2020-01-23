
class Demo
{
	public static void main(String[] args) {
		Runnable robj=() -> {

		Thread temp=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println("Diary ..."+(i+1)+temp.getName());
			try{Thread.sleep(500);}catch(InterruptedException e){}
		}

		};

		Thread t1=new Thread(robj,"mohit");
		t1.start();
	}
}