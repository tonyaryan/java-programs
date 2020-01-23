  class InvalidSalaryException  extends  Exception
         { 
           public  InvalidSalaryException()
              { 
                super();
              }
          public  InvalidSalaryException(String   s)
              {    
                super(s);
             }
         }
  class PayCalc                                            //is developed by x programmer
       {
        public static int computeSalary(int basic) 
              {                                    
                 int grs=0;
                 try{  
                          if ( basic < 4000 )
                           { 
                              throw new  InvalidSalaryException( " ur salary " + basic +  " mst be > 7000" );
                           }
                    }
                 catch(InvalidSalaryException e)
                    {
                      System.out.println("unable to compoute salary");
                      throw e; 
                    }

                    int ta=(basic * 5) / 100;
                    int da=(basic * 7) / 100;

                    grs=ta+da+basic;

                    return grs;

              }
      }
               
          
     public class TestPay1                                   //is developed by y programmer
        {  public static void main(String args[] )           
              {
                Scanner   cin =  new Scanner(System.in);
                try {
                         System.out.print(  " Enter ur basic pay ");
                         int   bpay =   cin.nextInt();  // 4000
                         int gross = PayCalc.computeSalary( bpay ) ;                  
                         System.out.println("ur final salary slip...  gross = " + gross);
                    }
                catch ( InvalidSalaryException e )
                    {
                         System.out.println(" unable to print pay slip " + e.getMessage() );
                    }
                 System.out.println(" Thanks for using application...");
              }
        }

