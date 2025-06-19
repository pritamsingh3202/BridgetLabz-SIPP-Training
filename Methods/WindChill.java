import java.util.*;
public class WindChill
{
    public double windChill(double temperatur, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperatur+(0.4275 * temperatur - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperatur :");
		double temperatur = sc.nextDouble();
		System.out.print("Enter the windSpeed:");
		double windSpeed = sc.nextDouble();
		
		WindChill st = new WindChill();
		
		double ans = st.windChill(temperatur, windSpeed);
		
		System.out.print(ans);
		
	}
}