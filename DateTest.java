import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date : ");
        int date = scanner.nextInt();

        System.out.println("Enter month : ");
        int month = scanner.nextInt();

        System.out.println("Enter year : ");
        int year = scanner.nextInt();

        Date myDate = new Date(date, month, year);
        System.out.println("The date is : ");
  
        myDate.displayDate();

        scanner.close();
    }
}

class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(date + "/" + month + "/" + year);
    }
}
