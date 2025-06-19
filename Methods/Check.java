import java.util.*;
public class Check
{
    public static int check(int n){
        if(n>0) return 1;
        else if(n<0) return -1;
        else return 0;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int n= sc.nextInt();
	    
	    if(check(n) == 1){
	        System.out.print("Positie number");
	    }
	    else if(check(n)== -1){
	        System.out.print("Negative number");
	    }
	    else{
	        System.out.print("Number is Zero");
	    }
	}
}