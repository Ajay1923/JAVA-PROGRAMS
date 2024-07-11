import java.io.*;
import java.util.Scanner;

public class  Program6{
      public static void main  (String[] args){
      Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the first number :");
     int firstNumber = scanner.nextInt();

     System.out.println("Enter the second number :");
     int secondNumber = scanner.nextInt();

     if(firstNumber > secondNumber){
     System.out.println(firstNumber + "is larger ");
}
     else if  (secondNumber > firstNumber ){
     System.out.println(secondNumber  + "is larger ");
}

   else {
         System.out.println( "These numbers are equal ");
}
    scanner.close();

}


}