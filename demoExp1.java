 class DemoEx3
          {
           public static void main(String args[])
            { 
               int r=0;
               System.out.println("1. with in main...");
               try
                   {
                  System.out.println("2. with in outer try");
                      try
                         {
                           System.out.println("3. inner try  " ); 
                           r=5/0;
                            System.out.println("4. res  of div ");
                         } catch(NumberFormatException e)
                              { 
                                System.out.println("5. handling  div error  in inner try ");
                              }
                           finally
                             {    System.out.println("6. with in finally....of inner try...");
                             }
                  System.out.println("7. back in outer try...");
               } catch(ArithmeticException e)
                     {   System.out.println("8. catching div error in outer try..catch..."); } 
                  finally
                   {
                    System.out.println("9. with in outer finally....");
                   }
               System.out.println( "10. Exiting from main...");     
          }
     }

                            //POSSIBLE OUTCOMES;


//       in case when there is some exeception in inner try    and if   inner try is capable of
//       handling same exception  using his own  catch   then  program will resume  from the
//       instruction which if present just after inner try ..  catch  construct
//       i.e  program will resume its working in outer try


//       is  case when  there is a exception in inner try and if  inner try is not capable of
//       handling same exception then  jvm  pass on same  exception to  enclosing try  catch construct
//       ( Note :  if  there is finally with  inner  try  catch ..  jvm will execute it before pass operation )


//       if  outer catch handle the same exception ( which it get from inner try catch )
//       then program resume after outer try.. catch
//       other wise program get terminated abnormally.
//       ( Note :  finally also get executed   ( if any )  present with  outer try catch..





