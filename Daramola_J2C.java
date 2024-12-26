import java.util.Scanner ; 
public class Daniel_J2C
{
   public static void main(String [] args)
   {
     double depAmt ;
     double balance ;
     int selectOpt ;
     
     balance = 1000.00 ;
    
     Scanner keyboard = new Scanner(System.in) ;
     System.out.print("Select an option: (1=View, 2=Deposit, or 3=Withdraw)\n") ;
     selectOpt = keyboard.nextInt() ;
     
     switch (selectOpt)
     {
     case 1:
     System.out.printf("Your current balance is :       $%,8.2f\n", balance) ;
      break ;
     case 2:
      System.out.print("Enter deposit amount: ") ;
      depAmt = keyboard.nextDouble() ;
      
      if (depAmt > 0)
      {
      balance += depAmt ;
      System.out.printf("Amount of deposit:    $%,8.2f\n", depAmt);
      System.out.printf("Updated balance:      $%,8.2f\n", balance);
      }
      else
      {
      System.out.printf("Deposit of   $%,8.2f\n must be greater than zero ",depAmt) ;
      depAmt = 0 ;
      }
      break ;
     
     case 3:
      System.out.print("Enter the amount to withdraw: ") ; 
      depAmt = keyboard.nextDouble() ;
      
     if (depAmt > 0 && depAmt <= balance)
     { 
     balance -= depAmt ;
     System.out.printf("Amount of withdrawal:    $%,8.2f\n", depAmt) ;
     System.out.printf("Updated balance:      $%,8.2f\n", balance) ;
     }
     else if (depAmt > balance)
     {
     System.out.print("The withdrawal exceeds your current balance.") ; 
     }
     else
     {
     System.out.print("Withdrawal must be greater than zero.") ;
     }
     break ;
     
     default:
     System.out.print("Wrong option. Try again.") ;
     } 
     

     
 
      
      
      
     
  
   }
}
