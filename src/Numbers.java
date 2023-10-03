import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Number");
		double num= input.nextDouble();
		double number;
		double squarenum;
		double cubenum;
		double fourthnum;
		squarenum=num*num;
		cubenum=num*num*num;
		fourthnum=num*num*num*num;
		System.out.println(squarenum);
		System.out.println(cubenum);
		System.out.println(fourthnum);
	}

}
