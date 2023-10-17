import java.util.Scanner;

public class WeekdayProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number (1-7): ");
        int number = input.nextInt();

        // Check if the input is within the valid range (1-7)
        if (number >= 1 && number <= 7) {
            String weekday;

            // Map the number to a weekday
            switch (number) {
                case 1:
                    weekday = "Sunday";
                    break;
                case 2:
                    weekday = "Monday";
                    break;
                case 3:
                    weekday = "Tuesday";
                    break;
                case 4:
                    weekday = "Wednesday";
                    break;
                case 5:
                    weekday = "Thursday";
                    break;
                case 6:
                    weekday = "Friday";
                    break;
                case 7:
                    weekday = "Saturday";
                    break;
                default:
                    weekday = "Invalid";
                    break;
            }

            System.out.println("The day of the week is: " + weekday);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}

