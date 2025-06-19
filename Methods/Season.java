import java.util.*;
public class Season
{
    public static boolean spring(int month , int day){
        return (month == 3 && day <= 20 ||
                (month ==4) ||
                (month == 5) ||
                (month == 6) && day<= 20);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month :");
		int month = sc.nextInt();
		System.out.print("Enter the day :");
		int day = sc.nextInt();
		
		if( spring(month, day)){
		    System.out.print("It is Spring Season");
		}
		else{
		    System.out.print("It is not Spring Season");
		}
	}
}