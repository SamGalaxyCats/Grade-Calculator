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
        float homeScore; //numerator
        float homePossible; //denominator
        int userChoice;
        Scanner choiceChecker = new Scanner(System.in); // Scanner to be used in any user interaction

        // Introductory period, where user makes choice.
        System.out.println("\nWelcome to the Grade Calculator. This program has a lot of fun features.\n");
        System.out.println("1. GPA Calculator");
        System.out.println("2. Current grade with assignment weighting");
        System.out.println("3. Score required on exam to get given letter grade");
        System.out.print("\nLet's start with what you want to do: ");

        while (!choiceChecker.hasNextInt())
        {
            System.out.println("Please enter a number show above.");
            choiceChecker.next();
        }
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
    	float gpaFloat = 0;
    	return gpaFloat;
    }

    private static float gradeCalc() 
    {
    	float grade = 0;
    	Scanner in = new Scanner(System.in);
    	System.out.println("Use default weights of categories? (Y/N):");
    	String UserAnswer = in.next();
    	if(UserAnswer.equalsIgnoreCase(Y))
    	{
    		
    	}
    	else
    	{
    		//Place holder for if I have time to make weights happen.
    	}
    	
    	
    	in.close();
    	return grade;
    }

    private static float examCalc() 
    {
    	float neededScore = 0;
    	return neededScore;
    }
}
