import java.io.*;
import java.util.Scanner;

public  class program {
    public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter your name :");
     String name = scanner.nextLine();
     System.out.println(name);
scanner.close();
    }
}