
import java.util.Scanner;

public class Problem13{
    private double balance;

    public Problem13(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
  }
 }

    public void credit(double amount)
 {
        balance += amount;
}

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance");
  } else 
{
      balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the initial balance: ");
     double initialBalance = scanner.nextDouble();
     Problem13 myProblem13 = new Problem13(initialBalance);

       System.out.println("Initial balance: " + myProblem13.getBalance());

       System.out.println("Enter the debit amount: ");
      double debitAmount = scanner.nextDouble();
      myProblem13.debit(debitAmount);

  System.out.println("Final balance: " + myProblem13.getBalance());

     scanner.close();
    }
}