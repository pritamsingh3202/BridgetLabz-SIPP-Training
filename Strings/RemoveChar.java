import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String result = str.replace(String.valueOf(ch), "");
        System.out.println(result);
    }
}
