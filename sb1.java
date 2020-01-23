class Demo
{
	public static void main(String[] args) {
		
	StringBuffer sb=new StringBuffer();

	System.out.println("A"+"B"+"C"+"D"+"E"+"F");     //. not so efficient as in this case obejext count is more than 

	System.out.println(sb.append("A").append("B").append("C").append("D").append("E").append("F"));//this case is efficient as compared to upper case


	}
}