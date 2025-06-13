import java.util.Scanner;
public class Cylinder
{
	public static void main(String[] agrs)
{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int h = sc.nextInt();
		double pi= 3.1427;
		double Volume = pi * Math.pow(r,2)*h;		
		System.out.println(Volume);
	}
	
}