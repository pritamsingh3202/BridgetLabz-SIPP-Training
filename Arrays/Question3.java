import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] heights = new double[11];
        double sumOfHeights= 0.0;
        for(int i =0; i< 11; i++){
            System.out.println("Height of person " +(i+1));
            heights[i] = sc.nextDouble();
            sumOfHeights += heights[i];
        }
        double meanHeight = sumOfHeights / 11;
        System.out.println(" The mean Height of the football team is " +meanHeight);
    }
}
