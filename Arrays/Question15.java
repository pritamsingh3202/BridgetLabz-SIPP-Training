import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonusAmounts = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary of Employee " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();
                System.out.print("Enter years of service of Employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextInt();
                if (salaries[i] > 0 && yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmounts[i] = salaries[i] * 0.05;
            } else {
                bonusAmounts[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonusAmounts[i];

            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
