
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            printFibonacci(n);
        }
    }

    public static void printFibonacci(int n) {
        long[] fibonacciArray = new long[n];
        fibonacciArray[0] = 1;
        if (n > 1) {
            fibonacciArray[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}