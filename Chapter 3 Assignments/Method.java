import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number >> ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number >> ");
        int num2 = input.nextInt();

        displayNumberPlusNumber(num1, num2);
        displayNumberMinusNumber(num1, num2);
        displayNumberTimesNumber(num1, num2);
        displayNumberDividedByNumber(num1, num2);
    }
    public static void displayNumberPlusNumber(int num1, int num2){
        System.out.println("The addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }
    public static void displayNumberMinusNumber(int num1, int num2){
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
    }
    public static void displayNumberTimesNumber(int num1, int num2){
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }
    public static void displayNumberDividedByNumber(int num1, int num2){
        System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
    }
}
