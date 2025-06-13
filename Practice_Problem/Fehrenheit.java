import java.util.Scanner;

public class Fehrenheit
{
	public static void main(String[] agrs)
{
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	int fahrenhit = (c * 9/5) +32;
	System.out.println(fahrenhit);
}
}