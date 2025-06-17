import java.util.Scanner;

public class Question11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] age= new int[3];
        double[] height= new double[3];
        String[] name = {"Amar", "Rahul", "Rohan"};

        for(int i=0; i<3; i++){
            System.out.print("Enter the age of" +name[i]+ ":");
            age[i] = sc.nextInt();
                 System.out.print("Enter the hight of "+name[i]+" :");
            height[i] = sc.nextInt();
        }
        int youngest = 0;
        int tallest = 0;
         for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }
        System.out.println("The Youngest person is "+name[youngest]+ " with age "+age[youngest]);
        System.out.println("The youngest person is "+name[tallest]+ " with height "+height[tallest]);
    }
}