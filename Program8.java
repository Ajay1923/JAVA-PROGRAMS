import java.io.*;
import java.util.Scanner;

public class  Program8{
      public static void main  (String[] args){
      Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the first number :");
     int firstNumber = scanner.nextInt();

     System.out.println("Enter the second number :");
     int secondNumber = scanner.nextInt();


  if (firstNumber % secondNumber == 0){
   System.out.println(firstNumber + " is a multiple of " + secondNumber);
}
   else 
{
  System.out.println(firstNumber + " is not a multiple of " + secondNumber);
}

    scanner.close();

}


}