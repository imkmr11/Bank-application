import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name,password,balance to create an account");
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance=sc.nextDouble();
        SBIuser user = new SBIuser(name,balance,password);

        //add money
        String message = user.addMoney(100000);
        System.out.println(message);

        //withdraw money

        System.out.println("enter amount to withdraw and password");
        int money=sc.nextInt();
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));


        //rate of interest

        System.out.println(user.calculateInterest(10));
    }
}