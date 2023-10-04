package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 1345;
		int reverseNumber = 0;
		while(i != 0) {
			int reminder = i % 10 ;  
			reverseNumber =  (reverseNumber*10)+reminder; 
			i = i / 10 ;
		}
		System.out.println(reverseNumber);

	}

}
