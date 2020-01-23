class Demo
{
	public static void main(String[] args) {
		
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t);


        t.setName("mymain");
        t.setPriority(9);
        System.out.println(t);



     	}
}



// every java application itself is a good example of thread 
// when we run jaav application then jvm will start  athread
// in java every thread launched by java is an object of java.lang.Thread class