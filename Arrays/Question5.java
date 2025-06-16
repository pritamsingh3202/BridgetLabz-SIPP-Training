import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        double[] arr= new double[10];
        double total= 0.0;
        int index = 0;
        while(true){
           System.out.println("Enter the number :");
           double num = sc.nextDouble();
           if( num <=0 || index == 10){
            break;
           }
           arr[index++] = num;
        }
        System.out.println("Number enter :");
        for(int i = 0; i< index; i++){
            System.out.println(arr[i]+"");
            total += arr[i];
        }
        System.out.println(" sum of numbers " + total);
    }
}
