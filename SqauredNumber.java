/***************************************************************************************/
import java.util.Scanner;

public class SqauredNumber {
	static int multiplication(int number, int i) {
		int multiply = number * i;
		return multiply;
	}

	static double square(int multiply) {
		double squareNumber = Math.pow(multiply, 2);
		return squareNumber;
	}

	public static void main(String[] args) {
		int number;
		double square;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int value = multiplication(number, i);
			double squareNumber = square(value);
			System.out.println(+number + "*" + i + "=" + value + "---"
					+ squareNumber);
		}

	}

}
/****************************************************************************************/