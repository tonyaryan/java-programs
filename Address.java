
public class Address 
{
    private String city;
    private String state;
    private long zip;
    
    public void getData()
    {
    	System.out.print("Enter city ");
    	              MyInput.cin.nextLine();
    	this.city = MyInput.cin.nextLine();
    	System.out.print("Enter state ");
   this.state = MyInput.cin.nextLine();
           System.out.print("Enter zip ");
     this.zip = MyInput.cin.nextLong();
    	
    }
    public void showData()
    {
    	
    	System.out.print(city + "  "+ state + "  "+zip);
    	
    }
}
