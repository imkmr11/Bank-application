public class AXISuser implements BankInterface{
    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        return  ;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
