class Rect
{
	private double length;
	private double breadth;
	
	Rect(){}
	Rect (double l,double b)
	{
		length=l; breadth=b;
	}
	
	void show()
	{
		System.out.println(length+" "+breadth);
    }
    double area()
    {
    	return length*breadth;
    }
}
class Demo
{
	 public static void main(String[] args)
    {
		Rect arr[]=new Rect[5];   
      arr[0]=new Rect(23,34);
      arr[1]=new Rect(33,34);
      arr[2]=new Rect(43,34);
      arr[3]=new Rect(53,34);
      arr[4]=new Rect(63,34);

Rect r=null;
double max=arr[0].area();

for(Rect robj:arr)
{
	if(robj.area()>max)
	{
		max=robj.area();
		r=robj;
	}
}


  r.show();
}
}
