/******************************************************************************************************************/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date(DD/Mm/YYYY):");
		java.util.Date date1= null;
		try{
			date1= new SimpleDateFormat("ddMMyyyy").parse(sc.nextLine().replaceAll("/", ""));
		} catch (ParseException e){
			e.printStackTrace();
		}
		System.out.println(date1);
		sc.close();
	}

}

/******************************************************************************************************************/