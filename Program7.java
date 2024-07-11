import java.io.*;
import java.util.Scanner;

public class  Program7{
      public static void main  (String[] args){
      Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the first number :");
     int firstNumber = scanner.nextInt();

     System.out.println("Enter the second number :");
     int secondNumber = scanner.nextInt();

     System.out.println("Enter the third number :");
     int thirdNumber = scanner.nextInt();

     int product = firstNumber * secondNumber *  thirdNumber;
     int sum =  firstNumber + secondNumber + thirdNumber;
     double average  = sum / 3.0;
     int largest =  Math.max(firstNumber ,Math.max(secondNumber ,  thirdNumber));
     int smallest = Math.min(firstNumber ,Math.min(secondNumber ,  thirdNumber));

     System.out.println("Product "+ product);
     System.out.println("Sum: "+ sum);
     System.out.println("Average: "+ average);
     System.out.println("Largest: "+ largest);
     System.out.println("Smallest: "+ smallest);
   
    scanner.close();

}


}