import java.util.Scanner;
public class Circle
{
	public static void main(String[] agrs)
{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi= 3.1427;
		double area = pi * Math.pow(r,2);		
		System.out.println(area);
	}
	
}