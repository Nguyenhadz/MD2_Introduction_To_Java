package read_number_into_word;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1>0) {
            System.out.println("Input Random Number 0-999");
            String a = scanner.nextLine();
            while (!(a.matches("^[1-9][0-9]?[0-9]$") ||
                    a.matches("^[0-9]$"))) {
                System.out.println("Invalid number");
                System.out.println("Input Random Number 0-999");
                a = scanner.nextLine();
            }
            String[] numberArray = a.split("");
            if (numberArray.length == 1) {
                if (numberArray[0].equals("0")) {
                    System.out.println("Zero");
                } else {
                    System.out.println(tenDown(numberArray[0]));
                }
            } if (numberArray.length == 2) {
                if (numberArray[0].equals("1")) {
                    if (numberArray[1].equals("0")) {
                        System.out.println("Ten");
                    } else {
                        System.out.println(tenUp(numberArray[1]));
                    }
                } else {
                    System.out.println(twenty(numberArray[0]) + " " + tenDown(numberArray[1]));
                }
            }
            if (numberArray.length == 3) {
                if (numberArray[1].equals("0")) {
                    System.out.println(hundred(numberArray[0]) + " and " + tenDown(numberArray[2]));
                } else {
                    if (numberArray[1].equals("1")) {
                        System.out.println(hundred(numberArray[0]) + " and " + tenUp(numberArray[2]));
                    } else {
                        System.out.println(hundred(numberArray[0]) + " and " + twenty(numberArray[1]) + tenDown(numberArray[2]));
                    }
                }
            }
        }
    }
    public static String tenDown(String number) {
        switch (number) {
            case "0":
                return "";
            case "1":
                return "One";
            case "2":
                return "Two";
            case "3":
                return "Three";
            case "4":
                return "Tour";
            case "5":
                return "Five";
            case "6":
                return "Six";
            case "7":
                return "Seven";
            case "8":
                return "Eight";
            case "9":
                return "Nine";
            default:
                return "can't read this";
        }
    }
    public static String tenUp(String units) {
        switch (units) {
            case "0":
                return "Ten";
            case "1":
                return "Eleven";
            case "2":
                return "Twelve";
            case "3":
                return "Thirteen";
            case "4":
                return "Fourteen";
            case "5":
                return "Fifteen";
            case "6":
                return "Sixteen";
            case "7":
                return "Seventeen";
            case "8":
                return "Eighteen";
            case "9":
                return "Nineteen";
            default:
                return "NaN";
        }
    }
    public static String twenty(String dozens) {
        switch (dozens) {
            case "2":
                return "Twenty";
            case "3":
                return "Thirty";
            case "4":
                return "Forty";
            case "5":
                return "Fifty";
            case "6":
                return "Sixty";
            case "7":
                return "Seventy";
            case "8":
                return "Eighty";
            case "9":
                return "Ninety";
            default:
                return "NaN";
        }
    }
    public static String hundred(String hundreds) {
        return (tenDown(hundreds)+" hundred");
    }


}
