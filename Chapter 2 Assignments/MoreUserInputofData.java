import java.util.Scanner;
    public class MoreUserInputofData {

        public static void main(String[] args)
        {
            String name1, name2, login, ID;
            double GPA;
            int grade;

            System.out.print("Please enter the following information so I can sell it for a Profit! \n\n");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your first name >> ");
            name1 = scanner.nextLine();

            System.out.print("Please enter your last name  >> ");
            name2 = scanner.nextLine();

            System.out.print("Please enter your grade level (9-12) >> ");
            grade = scanner.nextInt();

            System.out.print("Please enter your student id >> ");
            ID = scanner.next();

            System.out.print("Please enter your login name >> ");
            login = scanner.next();

            System.out.print("Please enter your gpa (0.0-4.0): >> ");
            GPA = scanner.nextDouble();

            System.out.print("\n\nYour Information:\n");

            System.out.println(
            "Login: " + login +
            "\n ID: " + ID +
            "\n Name: " + name2 +"," + name1 +
            "\n GPA: " + GPA +
            "\n Grade: " + grade);
        }

    }