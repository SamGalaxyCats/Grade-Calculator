/* Group Calculator Project
   Grade Info Toolkit

   Made by:
   =========================================
   Zach Saunders
   Sam Bowsher
   Thomas Feltz
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
       
  

    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Input how many classes you have here! Once you input all your grades,put 0 for the extra questions.");
    int numberOfClasses = myObj.nextInt();
    
    System.out.println("Input your first period percentage grade.");
    double Class1 = myObj.nextInt();
    System.out.println("Input your second period percentage grade.");
    double Class2 = myObj.nextInt();
    System.out.println("Input your third period percentage grade.");
    double Class3 = myObj.nextInt();
    System.out.println("Input your fourth period percentage grade.");
    double Class4 = myObj.nextInt();
    System.out.println("Input your fifth period percentage grade.");
    double Class5 = myObj.nextInt();
    System.out.println("Input your sixth period percentage grade.");
    double Class6 = myObj.nextInt();
    System.out.println("Input your seventh period percentage grade.");
    double Class7 = myObj.nextInt();
    System.out.println("Input your eighth period percentage grade.");
    double Class8 = myObj.nextInt();
    System.out.println("Input your ninth period percentage grade.");
    double Class9 = myObj.nextInt();
    System.out.println("Input your tenth period percentage grade.");
    double Class10 = myObj.nextInt();
   
    Class1 = Class1/20;
    double GPAClass1 = Class1-1;

    Class2 = Class2/20;
    double GPAClass2 = Class2-1;
   
    Class3 = Class3/20;
    double GPAClass3 = Class3-1;
   
    Class4 = Class4/20;
    double GPAClass4 = Class4-1;
   
    Class5 = Class5/20;
    double GPAClass5 = Class5-1;
   
    Class6 = Class6/20;
    double GPAClass6 = Class6-1;
   
    Class7 = Class7/20;
    double GPAClass7 = Class7-1;
    
    Class8 = Class8/20;
    double GPAClass8 = Class8-1;

    Class9 = Class9/20;
    double GPAClass9 = Class9-1;

    Class10 = Class10/20;
    double GPAClass10 = Class10-1;
   
    double GPScore = (GPAClass1 + GPAClass2 + GPAClass3 + GPAClass4 + GPAClass5 + GPAClass6 + GPAClass7 + GPAClass8 + GPAClass9  + GPAClass10);    
    double GPA = GPScore / numberOfClasses;

    System.out.println("Your GPA is "+ GPA);

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
