package body_mass_index;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BMI, weight, height;
        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        BMI = weight/(Math.pow(height,2));
        System.out.printf("%-20sf%s", "BMI","Interpretation\n");
        if (BMI <18.5) {
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        } else if (BMI < 25.0) {
            System.out.printf("%-20.2f%s", BMI, "Normal");
        } else if (BMI <30.0) {
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", BMI, "Obese");
        }
    }
}
