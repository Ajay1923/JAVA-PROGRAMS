import java.io.*;
import java.util.Scanner;

public class  Program10{
      public static void main  (String[] args){
      Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the radius of the sphere :");
     double radius = scanner.nextDouble();

    
     double volume  = sphereVolume(radius);

     System.out.println("Enter the volume of the sphere with radius " + radius + " is " + volume);

    scanner.close();

}
     

public static double sphereVolume(double radius){

   return (4.0/3.0)* Math.PI * Math.pow(radius ,3);
}

}