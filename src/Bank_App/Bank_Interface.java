package Bank_App;

public interface Bank_Interface {

    public int checkBalance(String password);

    public String addMoney(int amount);

    public String withDrawMoney(int money,String password);

    public double calculateTotalInterest(int years, String password);
}
