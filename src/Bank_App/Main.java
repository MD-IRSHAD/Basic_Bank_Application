package Bank_App;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         SBI Account1 = new SBI(100000,"irshad","123");
         String sms = Account1.addMoney(10000);
         System.out.println(sms);
         int Balance = Account1.checkBalance("123");
         System.out.print(Balance);
         String message = Account1.withDrawMoney(5000,"123");
         System.out.print(message);
         HDFC Account2 = new HDFC("Adil","abc",500000);
         String message1 = Account2.addMoney(2000);
         System.out.print(message1);
        }
    }
