import java.io.*;
import java.util.Scanner;

public  class Program2 {
    public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the first number :");
     int firstNumber  = scanner.nextInt();
     System.out.println("Enter the second number :");
     int secondNumber  = scanner.nextInt();
     System.out.println("Enter the third number :");
     int thirtNumber  = scanner.nextInt();
 
      	int product = firstNumber * secondNumber * thirtNumber;

     System.out.println("The product of "+ firstNumber + secondNumber +  thirtNumber + "is" + product);
     scanner.close();
    }
}