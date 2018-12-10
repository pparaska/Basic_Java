class Calculator{
	static double number1,number2,sum=0,number3,number4,subtraction=0,number5,number6,multiplication,number7,number8,division;

	static double addition(double number1, double number2)
	{
	sum=number1+number2;
	return sum;
	}
	
	static double subtraction(double number3, double number4)
	{
	subtraction=number3-number4;
	return subtraction;
	}

	static double multiplication(double number5, double number6)
	{
	multiplication=number5*number6;
	return multiplication;
	}
	
	static double division(double number7, double number8)
	{
	division=number7/number8;
	return division;
	}

	public static void main(String[] args)
	{
	addition(10,20);
	System.out.println("Addition="+sum);
	subtraction(20,5);
	System.out.println("Subtraction="+subtraction);
	multiplication(5,2);
	System.out.println("Multiplication="+multiplication);
	division(20,5);	
	System.out.println("Division="+division);
	}

}