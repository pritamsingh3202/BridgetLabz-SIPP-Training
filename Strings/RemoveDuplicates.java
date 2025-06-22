import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
