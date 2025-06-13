import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fee ");
        double fee= sc.nextDouble();
        System.out.print("Enter the discount ");
        double discount= sc.nextDouble();
        
        double discountFee= fee *(discount/ 100);
        double finalFee = fee - discountFee;

        System.out.println("This discount amout is INR "+ discount+ " and the final fee is INR "+ finalFee);
    }
}
