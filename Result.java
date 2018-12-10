/*****************************************************************************************************************************************************************/
import java.util.Scanner;


public class Result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of First subject:");
		int subject1=sc.nextInt();
		System.out.println("Enter marks of Second subject:");
		int subject2=sc.nextInt();
		System.out.println("Enter marks of Third subject:");
		int subject3=sc.nextInt();

		if(subject1>60 && subject2>60 && subject3>60)
			System.out.println("Student is Passed");
		else if(subject1>60&& subject2>60 && subject3<60 || subject1>60 && subject2 <60 && subject3>60 || subject1<60 && subject2>60 &&subject3>60)
			System.out.println("Student is promoted");

		else if(subject1>60 && subject2<60 && subject3<60 ||subject2>60 && subject1<60 && subject3<60 ||subject3>60 && subject2<60 && subject1<60
				||subject1<60 && subject2<60&& subject3<60 )
			System.out.println("Student is Failed");



	}
}

/*****************************************************************************************************************************************************************/