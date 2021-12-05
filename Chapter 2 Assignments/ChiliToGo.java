import java.util.Scanner;
public class ChiliToGo 
{
    public static void main(String[] args)
    {
        final double ADULT_PRICE = 7;
        final double CHILD_PRICE = 4;
        int adultMeals;
        int childMeals;
        double totalChild, totalAdult, grandTotal;
        Scanner deviceinput = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = deviceinput.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        childMeals = deviceinput.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;
        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
        System.out.println("      Total is" + totalAdult);
        System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
        System.out.println("      Total is " + totalChild);
        System.out.println("Grand total for all meals is " + grandTotal);
    }
}
