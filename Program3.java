import java.io.*;
import java.util.Scanner;

public  class Program3 {
    public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("ENTER THE FAHRENHEIT :");
     double fahrenheit = scanner.nextDouble();

     double celsius = (fahrenheit - 32) * 5/9 ;
     System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
     scanner.close();
    }
}