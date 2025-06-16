import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 0; i < number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

    }
}
