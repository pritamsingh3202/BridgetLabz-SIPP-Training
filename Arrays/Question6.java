import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the number: ");
        for(int i=0; i<5; i++){
            arr[i]= sc.nextInt();
        }
        for(int num : arr){
            if(num > 0){
                if(num % 2==0){
                    System.out.println(num + " is even and positive");
                }
                else{
                    System.out.println(num + " is odd and positive");
                }
            }
            else if(num < 0){
                if(num < 0 ){
                    System.out.println(num + " is negative");
                }
                else{
                    System.out.println(num + " is zero");
                }
            }
        }

        int first= arr[0];
        int last= arr[4];
        if (first == last) {
            System.out.println("The first and last numbers are equal.");
        } else if (first > last) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}
