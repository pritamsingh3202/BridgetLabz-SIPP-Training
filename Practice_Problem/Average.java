import java.util.Scanner;
public class Average
{
	public static void main(String[] agrs)
{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int w = sc.nextInt();
		int z = sc.nextInt();
		
		int average = ( l+w+z )/3;		
		System.out.println(average);
	}
	
}