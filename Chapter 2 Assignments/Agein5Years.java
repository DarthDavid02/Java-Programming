import java.util.Scanner;
    public class Agein5Years 
{
        public static void main(String[] args) 
        {
            String name;
            int age;
            int futureAge;
            int pastAge;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Hello. What is your name? ");
            name = scanner.nextLine();

            System.out.println("Hi," + name + " How old are you? ");
            age = scanner.nextInt();

            futureAge = age + 5;
            pastAge = age - 5;

            System.out.println("Did you know that in five years you will be " + futureAge + " years old?");
            System.out.println("And five years ago you were " + pastAge + "!" + "Imagine that!");
        }    
}
