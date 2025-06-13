import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter math marks: ");
        int math = sc.nextInt();
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        // int math = 34;
        // int physics = 45;
        // int chemistry = 67;

        double totalMarks= (math+physics+chemistry) / 3;
        System.out.println("Sam's average number of PCM "+totalMarks);

    }
    
}
