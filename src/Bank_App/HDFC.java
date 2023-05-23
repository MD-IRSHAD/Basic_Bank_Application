package Bank_App;

import java.util.UUID;

public class HDFC implements Bank_Interface{

    private String AccountNumber;

    private String name;
    private String password;
    private int Amount;

    private int rateOfInterest = 8;

    public HDFC(String name, String password, int amount) {
        this.AccountNumber = UUID.randomUUID().toString();
        this.name = name;
        this.password = password;
        Amount = amount;
    }

    @Override
    public int checkBalance(String password) {
        if(this.password == password)
            return Amount;
        else
        return -1;
    }

    @Override
    public String addMoney(int amount) {
        Amount = Amount+amount;
        String message = "\n"+ amount +" Has Credit in your account number" +AccountNumber;
        return message;
    }

    @Override
    public String withDrawMoney(int money, String password) {
       if(this.password == password){
           if(money>Amount){
               return "insufficient Balance";
           }else {
               Amount = Amount - money;
               return "withdrwa successfully";
           }
       }
       else {
           return "wrong pass";
       }
    }

    @Override
    public double calculateTotalInterest(int years, String password) {
        double rateOfinterest = (years*Amount*rateOfInterest)/3;
        return rateOfinterest;
    }
}
