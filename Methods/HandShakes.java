import java.util.Scanner;
public class HandShakes
{
    public int Combination(int n){
        int combination = (n * (n-1))/2;
        return combination;  
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of student :");
		int n = sc.nextInt();
		
		HandShakes st= new HandShakes();
		int ans= st.Combination(n);
		
		System.out.println("The number of Hand Shakes are :"+ans);
		
	}
}