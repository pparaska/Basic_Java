package BasicJavaPart2;

import java.util.Scanner;

public class Palindrome {

	

	public static boolean isPalindrome(int Number1) {

		int result=0;
		
		int number2=Number1;
		int remainder=0;
		while(number2>0){
			remainder=number2%10;
			number2=number2/10;
			result=result*10+remainder;
			
		}
		
		if(result==Number1){
			return true;
		}else{
			return false;
		}


	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int Number1=sc.nextInt();

		System.out.println(isPalindrome(Number1));
		

	}

}
