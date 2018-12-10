/********************************************************************************************************/
public class ArmstrongRange
{ 
             public static void main (String [] args) 
             { 
                   
                    for (int number = 100 ; number <= 1000 ; number++) 
                     { 
                                int temp = number; 
                                int number1 = 0; 
                                int number2 = 0;

                                while (temp > 0) 
                                 { 
                                             number1 = temp % 10; 
                                             number2 = number2 + (number1 * number1 * number1); 
                                             temp = temp / 10; 
                                 } 
                                 if (number== number2) 
                                  { 
                                             System.out.println (number + "is Armstrong number"); 
                                   } 
                      } 
            } 
}

/******************************************************************************************************/