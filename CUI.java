/**
*
*	7)	Consider a CUI based application, where you are asking a user to enter his Login name and password, after entering the valid user-id and 
*	password it will print the message “Welcome” along with user name. As per the validation is concerned, the program should keep a track of login attempts. 
*	After three attempts a message should be flashed saying “Contact Admin” and the program should terminate. 
*
*/

import java.util.Scanner;


public class CUI {


	public static int loginAttempts=0;
	public static final String userId="PoonamP";
	public static final String password="poonam1234";

	public static boolean verifyLoginDetails(String userId1,String password1 ){
		if(userId1.equals(userId) && password1.equals(password))
			return true;
		else{
			loginAttempts++;
			return false;
		}



	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String userId;
		String password;
		while(loginAttempts!=3){
			System.out.println("Enter USER ID:");
			userId=sc.next();
			System.out.println("Enter Password");
			password=sc.next();
			if(verifyLoginDetails(userId, password)){
				System.out.println("Welcome");
				break;
			}
		}
		if(loginAttempts==3){
			System.out.println("Contact Admin");

		}

	}
}


