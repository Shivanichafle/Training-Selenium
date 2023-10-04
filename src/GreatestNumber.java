import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter your number");
int a=scan.nextInt();
System.out.println("Enter your number");
int b=scan.nextInt();
System.out.println("Enter your number");
int c=scan.nextInt();
if(a>b && a>c) {
	System.out.println(a+ "is Greatest number");
	}else {
		if(b>a && b>c) {
			System.out.println(b+ "is Greatest number");
			
		}else {
			if (c>a && c>b) {
				System.out.println(c+ "is Greatest number");
				
			}
		}
	}
	}

}
