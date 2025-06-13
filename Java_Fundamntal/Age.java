import java.time.LocalDate;

public class Age
{
    public static void main(String[] args) {
       int brithYear = 2002;
       int currentYear= LocalDate.now().getYear();
       int age = currentYear- brithYear;
       System.out.println("Harry's age in 2025 is " + age + ".");
        

    }
}