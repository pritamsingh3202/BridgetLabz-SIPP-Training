import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number :");
        int n= sc.nextInt();
        int maxDigit = 10;
        int[] arr = new int[10];
        int index =0; 

        while(n !=0){
           arr[index++]= n %10;
           n /=10;
           if(index == maxDigit) break;

        }
        int SecondLargest = 0, largest = 0;

        for(int i=0; i< index ; i++ ){
            if(arr[i] > largest){
                SecondLargest = largest ;
                largest = arr[i];
            }
            else if(arr[i]> SecondLargest && arr[i] != largest){
                SecondLargest = arr[i];
        }
     }
     System.out.println("Largest number is : "+ largest);
     System.out.println("Second largest number is : "+ SecondLargest);
    }
}
