import java.util.Scanner;

public class Monthsprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = input.nextInt();

        int daysInMonth;

        switch (monthNumber) {
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28; // Assuming a non-leap year
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
            default:
                System.out.println("Invalid month number");
                return;
        }

        System.out.println("Number of days in the month: " + daysInMonth);
    }
}
