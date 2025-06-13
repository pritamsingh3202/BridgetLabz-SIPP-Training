import java.util.Scanner;
public class Simple_Interest
{
	public static void main(String[] agrs)
{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int Simple_Interest = ( p * r * t ) /100;		
		System.out.println(Simple_Interest);
	}
	
}