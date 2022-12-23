import java.util.Scanner;  
      
 //create ATMExample class to implement the ATM functionality  
 public class ATMInterface
 {  
     //main method starts   
     public static void main(String args[] )  
     {  
         //declare and initialize balance, withdraw, and deposit  
         int balance =200000, withdraw=0, deposit=0;
         int History=0;
         //create scanner class object to get choice of user  
         Scanner sc = new Scanner(System.in);  
           
         while(true)  
         {  
             System.out.println("ATM Interface\n");  
             System.out.println("Choose 1 for Transaction History"); 
             System.out.println("Choose 2 for Withdraw");  
             System.out.println("Choose 3 for Deposit");  
             System.out.println("Choose 4 for Check Balance");  
             System.out.println("Choose 5 for Quit\n");  
             System.out.print("Choose the operation:");  
               
             //get choice from user  
             int choice = sc.nextInt();  
             switch(choice)  
             {  
                 case 1:
        System.out.print("Your Transaction history\n");
        break;
                 case 2:  
         System.out.print("Enter money to be withdrawn:");  
                       
         //get the withdrawl money from user  
         withdraw = sc.nextInt();  
                       
         //check whether the balance is greater than or equal to the withdrawal amount  
         if(balance >= withdraw)  
         {  
             //remove the withdrawl amount from the total balance  
             balance = balance - withdraw;  
             System.out.println("Please collect your money");  
         }  
         else  
         {  
             //show custom error message   
             System.out.println("Insufficient Balance");  
         }  
         System.out.println("");  
         break;  
    
                 case 3:  
                       
         System.out.print("Enter money to be deposited:");  
                       
         //get deposite amount from te user  
         deposit = sc.nextInt();  
                       
         //add the deposit amount to the total balanace  
         balance = balance + deposit;  
         System.out.println("Your Money has been successfully depsited");  
         System.out.println("");  
         break;  
    
                 case 4:  
         //displaying the total balance of the user  
         System.out.println("Balance : "+balance);  
         System.out.println("");  
         break;  
    
                 case 5:  
         //exit from the menu  
         System.exit(0);  
                 default:
        System.out.println("Invalid Option");
             }  
             switch (choice)
             {
                 case 1:
        System.out.println("Previous Balance:"+History);
        System.out.println("Deposit:"+deposit);
        History = balance + deposit;
        System.out.println("Withdraw:"+withdraw);
        History = balance;
        System.out.println("Current Balance:"+History);
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                     
             }
             }
         }  
     }