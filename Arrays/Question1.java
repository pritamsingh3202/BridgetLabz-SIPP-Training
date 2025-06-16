import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number <=0){
            System.out.println("Please enter a positive integer.");
            return;
        }
        int[] even = new int[number/2+1];
        int[] odd = new int[number/ 2+1];

        int evenNumber =0, oddNumber =0;
        for(int i= 0; i<number; i++){
            if(i % 2== 0){
                even[evenNumber] = i;
                evenNumber++;
            }
            else{
                odd[oddNumber] = i;
                oddNumber++;
            }
        }
        System.out.println("Even numbers: ");
        for(int i =0; i< evenNumber; i++){
            System.out.println(even[i]);
        }
        System.out.println();

        System.out.println("Odd Numbers");
        for(int i = 0; i< oddNumber; i++){
            System.out.println(odd[i]);
        }
        System.out.println();
    }
}