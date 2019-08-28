/* Group Calculator Project
   Grade Info Toolkit

   Made by:
   =========================================
   Zach Saunders
   *Insert your names here*
 */

import java.lang.reflect.Method;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        float homeWeight; //constant
        float classWeight; //constant
        float testWeight; //constant
        float examWeight; //constant
        float homeScore; //numerator
        float homePossible; //denominator
        int userChoice;
        Scanner choiceChecker = new Scanner(System.in); // Scanner to be used in any user interaction

        // Introductory period, where user makes choice.
        System.out.println("\nWelcome to the Grade Calculator. This program has a lot of fun features.\n");
        System.out.println("1. GPA Calculator");
        System.out.println("2. Current grade with assignment weighting");
        System.out.println("3. Score required on exam to get given letter grade");
        System.out.print("\nLet's start with what you want to do:");

        userChoice = choiceChecker.nextInt();
        if (userChoice == 1) {
            gpaCalc();
        }
        else if (userChoice == 2) {
            gradeCalc();
        }
        else if (userChoice == 3) {
            examCalc();
        }

    }

    private static int gpaCalc() {

    }

    private static int gradeCalc() {

    }

    private static int examCalc() {

    }
}
