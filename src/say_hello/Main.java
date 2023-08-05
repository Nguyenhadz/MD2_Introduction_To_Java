package say_hello;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner haha = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = haha.nextLine();
        System.out.println("Hello " + name);;
    }
}
