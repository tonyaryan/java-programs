class Demo
{
	public static void main(String[] args) {
		java.util.Scanner cin=new java.util.Scanner(System.in);
		int num;
		System.out.println("Enter a num");
		num=cin.nextInt();
		String str=String.valueOf(num);
		System.out.println(str.length());
	}
}