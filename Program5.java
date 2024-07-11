import java.io.*;
import java.util.Scanner;

public class  Program5{
      public static void main  (String[] args){
      Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the first number :");
     int firstNumber = scanner.nextInt();

     System.out.println("Enter the second number :");
     int secondNumber = scanner.nextInt();

     int product = firstNumber * secondNumber ;
     int sum =  firstNumber + secondNumber;
     int difference = firstNumber - secondNumber;
     int quotient =  firstNumber / secondNumber;
    

     System.out.println("Product "+ product);
     System.out.println("Sum: "+ sum);
     System.out.println("Difference: "+ difference);
     System.out.println("Quotient: "+ quotient);
   
    scanner.close();

}


}