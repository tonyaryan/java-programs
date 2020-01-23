
interface ActionListener
{
	void actionPerformed();
}


class Demo
{
	public static void main(String[] args) {
		
		ActionListener obj=()->{System.out.println("abcdc");};
		obj.actionPerformed();
	}
}