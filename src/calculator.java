/* Group Calculator Project
   Grade Info Toolkit

   Made by:
   =========================================
   Zach Saunders
   Sam Bowsher
   *Insert your names here*
 */

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        float homeWeight; //constant
        float classWeight; //constant
        float testWeight; //constant
        float examWeight; //constant
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

    private static float gpaCalc() 
    {
    	float retFloat = 0;
    	return retFloat;
    }

    private static float gradeCalc() 
    {
    	float grade = 0;
    	float homeworkWeight = 0.1;
    	float classworkWeight = 0.3;
    	float testWeight = 0.3;
    	float homeScore = 0; //numerator
        float homePossible = 0; //denominator
    	Scanner in = new Scanner(System.in);
    	boolean moreGrades = true;
    	System.out.println("Your grade will be calculated at 10% homework, 30% classwork, and 30% tests.");
    	do
    	{
    		System.out.println("You are currently adding scores for homework. Please type the numerator of the next item. You can also type a non-number if you're finished: ");
    		if(in.hasNextFloat())
    		{
    			homeScore += in.nextFloat();
    		}
    		else
    		{
    			moreGrades = false;
    		}
    	}(while moreGrades);
    	in.close();
    	return grade;
    }

    private static float examCalc() 
    {
    	float neededScore = 0;
    	return neededScore;
    }
}
