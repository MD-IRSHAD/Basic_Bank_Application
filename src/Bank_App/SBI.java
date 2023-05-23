package Bank_App;

import java.util.UUID;

public class SBI implements Bank_Interface{
     private int Balance;
     private String  AccountNumber;
     private String name;
     private String password;
     private static int rateOfInterest=7;

     public SBI(int balance, String name, String password) {
         this.AccountNumber = UUID.randomUUID().toString();
         Balance = balance;
         this.name = name;
         this.password = password;
     }

     @Override
     public int checkBalance(String password) {
         if(this.password == password)
             return Balance;
         else
             return -1;
     }

     @Override
     public String addMoney(int Money) {
         Balance = Balance+Money;
         String message = (Money + "Has credit in your account "+ AccountNumber +" "+"total balance is now  " +Balance);
         return message;
     }

     @Override
     public String withDrawMoney(int money, String password) {
         if(this.password == password){
             if(money>this.Balance){
                 return "insufficient Balance ";
             }
             else {
                 Balance = Balance - money;
                 return "  \n Money withdraw Successfully";
             }
         }else{
             return "Wrong password";
         }
     }

     @Override
     public double calculateTotalInterest(int years, String password) {
         double interest = (Balance * years * rateOfInterest)/3;
         return interest;
     }
 }
