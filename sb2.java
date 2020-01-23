class Demo
{
	public static void main(String[] args) {
  
        StringBuffer sb=new StringBuffer("HELLO");

        sb.insert(3,"ABC");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.insert(8,"123456789abcdefghijklmnopqrstuvwxyz123456789abcdefghijklmnopqrstuvwxyz123456789abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
	}
}