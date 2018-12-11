import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


	public class AdditionTest {
	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}

	@Test
	public void AdditionOfTwoPositiveNumbers() {
		//Calculator calculator=new Calculator();
		int answer=calculator.addNumbers(50,50);
		assertEquals(100,answer);
	}
	@Test
	public void AdditionOfTwoNegativeNumbers() {
		//Calculator calculator=new Calculator();
		int answer=calculator.addNumbers(-50,-50);
		assertEquals(-100,answer);
	}

	@Test
	public void AdditionOfOnePositiveOneNegativeNumber() {
		//Calculator calculator=new Calculator();
		int answer=calculator.addNumbers(-50,50);
		assertEquals(0,answer);
	}
	@Test
	public void AdditionOfOnePostiveOneZero() {
		//Calculator calculator=new Calculator();
		int answer=calculator.addNumbers(50,0);
		assertEquals(50,answer);
	}
	@Test
	public void AdditionOfOneNegativeOneZero() {
		//Calculator calculator=new Calculator();
		int answer=calculator.addNumbers(-50,0);
		assertEquals(-50,answer);
	}
	@Test
	public void AdditionOfTwoZeros() {
		//Calculator calculator=new Calculator();
		int answer=calculator.addNumbers(0,0);
		assertEquals(0,answer);
	}
}
