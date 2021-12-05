import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number >> ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number >> ");
        int num2 = input.nextInt();

        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

    }
    public static void displayTwiceTheNumber(int num){
        System.out.println(num + " time 2 is " + (num * 2));
    }
    public static void displayNumberPlusFive(int num){
        System.out.println(num + " plus 5 is " + (num + 5));
    }
    public static void displayNumberSquared(int num){
        System.out.println(num + " squared is " + (num * num));
    }
}