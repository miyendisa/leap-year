import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("This year is a Leap Year.");
        } else {
            System.out.print("This year is not a Leap Year.");
        }
    }
}
