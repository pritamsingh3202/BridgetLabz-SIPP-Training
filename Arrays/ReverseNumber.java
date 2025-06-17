import java.util.Scanner;

public class  ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int cnt= 0, temp = num;
        while(temp !=0){
            temp /= 10;
            cnt++;
        }
        int[] digits = new int[cnt];
        temp= num;
        for(int i=0; i<cnt; i++){
            digits[i]= temp %10;
            temp /= 10;

        }
        System.out.print("Reversed number is: ");
        for(int digit : digits){
            System.out.print(digit);
        }

    }
}
