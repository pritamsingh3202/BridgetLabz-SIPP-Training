import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        int[] multiplicationResult = new int[n];
        for(int i =6 ; i< 10; i++){
            multiplicationResult[i-6] = n * i;
             System.out.println(n + " * " + i + " = " + multiplicationResult[i-6]);
        }
       
    }
    
}
