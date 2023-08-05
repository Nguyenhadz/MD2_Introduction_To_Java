package check_leap_year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year do you want to check?");
        int year = scanner.nextInt();
        if ( year%4 == 0){
            if ( year%100 == 0){
                if ( year%400 == 0){
                    System.out.println("The year '"+ year + "' is leap year");
                } else {
                    System.out.println("The year '"+ year + "' is not leap year");
                }
            } else {
                System.out.println("The year '"+ year + "' is leap year");
            }
        } else {
            System.out.println("The year '"+ year + "' is not leap year");
        }

    }
}
