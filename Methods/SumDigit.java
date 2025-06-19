import java.util.*;

public class SumDigit {
    public int sumDigit(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        SumDigit st = new SumDigit();
        int ans = st.sumDigit(arr);
        System.out.println("Sum = " + ans);
    }
}