class Demo
{
	public static void main(String[] args) {
		
        StringBuffer sb=new StringBuffer(5);

        sb.append("ABC");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("123456789abc");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
	}
}