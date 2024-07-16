import java.util.Scanner;

public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);

        SavingsAccount saver1 = new SavingsAccount(4000.00);
        SavingsAccount saver2 = new SavingsAccount(5000.00);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver 1 balance after 1 month at 4% interest: " + saver1.getSavingsBalance());
        System.out.println("saver 2 balance after 1 month at 4% interest: " + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver 1 balance after 1 month at 5% interest: " + saver1.getSavingsBalance());
        System.out.println("saver 2 balance after 1 month at 5% interest: " + saver2.getSavingsBalance());
    }
}

class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
