import java.util.Scanner;
public class PositiveAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your number");
		int i=scan.nextInt();
		if(i>=0) {
			System.out.println("Positive number");

		}else {
			System.out.println("Negative number");
		}
	}

}
