import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; 
        int counter = 10;
        int[] arr = new int[counter];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < counter; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

            if (arr[i] > largest) {
                largest = arr[i];
            }

            System.out.println("The current largest number is: " + largest);
        }

        System.out.println("Final largest number entered is: " + largest);

        scanner.close();
    }
}
