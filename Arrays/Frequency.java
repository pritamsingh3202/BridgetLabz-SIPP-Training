import java.util.Scanner;

public class Frequency{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int[] frequency = new int[10];

        int temp = num;
        while( temp !=0 ){
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }
        System.out.println("Digit frequency in " + num + " is:");

        for( int i=0; i< 10 ; i++){
            if(frequency[i] > 0){
                System.out.println("Digit " + i + " : " +frequency[i]);
            }
        }


    }
}
