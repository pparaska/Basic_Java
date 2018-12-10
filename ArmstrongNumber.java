/**************************************************************************/
import java.util.Scanner;

class ArmstrongNumber{  
 	public static void main(String[] args)  {  
   	 	int number2=0,number1,temp; 
   	 	Scanner sc=new Scanner(System.in);
   	 	System.out.println("Enter a number:");
    	 	int number=sc.nextInt(); 
   	 	temp=number;  
    		while(number>0)  
    		{  
    			number1=number%10;  
    			number=number/10;  
    			number2=number2+(number1*number1*number1);  
    		}  
    		if(temp==number2)  
    		System.out.println("armstrong number");   
    		else  
        	System.out.println("Not armstrong number");   
   }  
} 

/**************************************************************************/