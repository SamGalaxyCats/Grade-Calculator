/* Group Calculator Project
   Grade Info Toolkit

   Made by:
   =========================================
   Zach Saunders
   Sam Bowsher
   Thomas Feltz
   *Insert your names here*
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

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
        System.out.print("\nLet's start with what you want to do: ");

        while (!choiceChecker.hasNextInt()) {
            System.out.println("Please enter a number shown above.");
            choiceChecker.next();
        }
        userChoice = choiceChecker.nextInt();

        if (userChoice == 1) {
            gpaCalc();
        } else if (userChoice == 2) {
            gradeCalc();
        } else if (userChoice == 3) {
            //noinspection ResultOfMethodCallIgnored
            // ^ Above to keep IntelliJ from yelling at Zach
            examCalc();
        }

    }

    private static void gpaCalc() {

        double finished; // Just used to sate the compiler; no purpose

        Scanner userInput = new Scanner(System.in);
        List<Double> grades = new ArrayList<Double>();

        System.out.println("How many classes do you have?");
        int numberOfClasses = userInput.nextInt();
        System.out.println(numberOfClasses + " Classes");

        // Loop to add grades to list
        int loopClasses = numberOfClasses;
        int classNumber = 1;
        while (loopClasses > 0) {
            System.out.println("What is your grade for class number " + classNumber + "?");
            grades.add(userInput.nextDouble() / 100);
            classNumber++;
            loopClasses--;
        }

        List<Double> individualGpa = new ArrayList<Double>(); // Variable for calculations later

        int loops = grades.size() - 1; // Used to determine how long the loop will run, and to retrieve value from list index
        while (loops >= 0) {
            if (grades.get(loops) >= 0.93) {
                individualGpa.add(4.0);
                loops--;
            } else if (grades.get(loops) >= 0.9) {
                individualGpa.add(3.7);
                loops--;
            } else if (grades.get(loops) >= 0.87) {
                individualGpa.add(3.3);
                loops--;
            } else if (grades.get(loops) >= 0.83) {
                individualGpa.add(3.0);
                loops--;
            } else if (grades.get(loops) >= 0.8) {
                individualGpa.add(2.7);
                loops--;
            } else if (grades.get(loops) >= 0.77) {
                individualGpa.add(2.3);
                loops--;
            } else if (grades.get(loops) >= 0.73) {
                individualGpa.add(2.0);
                loops--;
            } else if (grades.get(loops) >= 0.7) {
                individualGpa.add(1.7);
                loops--;
            } else if (grades.get(loops) >= 0.67) {
                individualGpa.add(1.3);
                loops--;
            } else if (grades.get(loops) >= 0.65) {
                individualGpa.add(1.0);
                loops--;
            } else {
                individualGpa.add(0.0);
                loops--;
            }
        }

        java.lang.System.gc();

        double finalGpa = 0.0;
        double tempGpa = 0.0;
        for (Double gpa : individualGpa) {
            tempGpa += gpa;
            finalGpa = tempGpa / (double) individualGpa.size();
        }

        // Used to round GPA to 2 dec. places
        finalGpa *= 100;
        finalGpa = (int) Math.round(finalGpa);
        finalGpa /= 100;

        System.out.println("Your overall GPA is: " + finalGpa);

        // Below is unnecessary to function, just squashes compiler complaining
        finished = 0.1;
    }

    private static void gradeCalc() 
    {
        float grade = 0;
        float homeworkWeight = (float) 0.1;
        float classworkWeight = (float) 0.3;
        float testWeight = (float) 0.6;
        float homeScore = 0; //numerator
        float homePossible = 0; //denominator
        float homeResult;
        Scanner in = new Scanner(System.in);
        boolean moreGrades = true;
        System.out.println("Your grade will be calculated at 10% homework, 30% classwork, and 30% tests.");
        do 
        {
            System.out.println("You are currently adding scores for homework. Please type the numerator of the next item. You can also type a non-number if you're finished: ");
            if (in.hasNextFloat()) 
            {
                homeScore += in.nextFloat();
                System.out.println("Please type the denominator for the same item");
                if(in.hasNextFloat())
                {
                	homePossible += in.nextFloat();
                }
            } 
            else 
            {
                moreGrades = false; //To stop entering grades.
            }
        } while (moreGrades);
        homeResult = homeScore / homePossible;
        in.close();
    }

    private static void examCalc() {
    }
}
