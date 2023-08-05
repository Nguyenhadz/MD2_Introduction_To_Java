package currency_conversion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double VND = 23000;
        Scanner haha = new Scanner(System.in);
        System.out.println("Enter the mount USD:");
        double USD = haha.nextDouble();
        double conversion = VND*USD;
        System.out.print("Value VND: " + conversion);
    }
}
