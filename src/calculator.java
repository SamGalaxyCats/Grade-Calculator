import java.util.Scanner;

public class calculator
{
    public static void main(String[] args) 
    {
        float homeWeight; //constant
        float classWeight; //constant
        float testWeight; //constant
        float homeScore; //numerator
        float homePossible; //denominator
        Scanner choiceChecker = new Scanner(System.in); // Scanner to be used in any user interaction

        // Introductory period, where user makes choice.
        System.out.println("\nWelcome to the Grade Calculator. This program has a lot of fun features.\n");
        System.out.println("1. GPA Calculator");
        System.out.println("2. Current grade with assignment weighting");
        System.out.println("3. Score required on exam to get given letter grade");
        System.out.print("\n");
        System.out.println("Let's start with what you want to do:");
        System.out.println();
        int userChoice = choiceChecker.nextInt();

        // At this point we need each of the functions
    }
}
