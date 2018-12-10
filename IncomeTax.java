/*************************************************************************************/
import java.util.Scanner;


public class IncomeTax {

	static double taxPayable(int ctc)
	{
		double taxamount=0.0;
		if(ctc>0 && ctc<=180000)
		{
			taxamount=9999.0;
		}
		else if(ctc>=181001 && ctc<=300000)
		{
			taxamount= 0.1*ctc;
		}
		else if(ctc>=300001 && ctc<=500000)
		{
			taxamount= 0.2*ctc;
		}
		else if(ctc>=500001 && ctc<=1000000)
		{
			taxamount= 0.3*ctc;
		}
		return taxamount;	

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC=");
		int ctc=sc.nextInt();
		double amount=taxPayable(ctc);
		if(amount==9999.0)
		{
			System.out.println("Nil");
		}
		else
		{
			System.out.println("Income Tax="+amount);
		}

	}

}

/**********************************************************************************/