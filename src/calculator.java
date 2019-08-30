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
         
       System.out.println("Input how many AP classes you are taking");
      int apClasses = 
      myObj.nextInt();
      System.out.println("Input how many Honors classes you are taking");
      int honorsClasses =
      myObj.nextInt();
      double apBoost;
      double honorBoost;
      apBoost = apClasses * 1;
      honorBoost = honorsClasses * .5;
       
       
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
        finalGpa += apBoost;
        finalGpa += honorBoost;

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
        float homeResult; //Percent Score in homework
        float classResult; //Percent Score in classwork
        float testResult; //Percent score in tess and quizzes.
        Scanner in = new Scanner(System.in);
        System.out.println("Your grade will be calculated at 10% homework, 30% classwork, and 60% tests.");
        homeResult = subjectMath("homework", in);
        classResult = subjectMath("classwork", in);
        testResult = subjectMath("tests and quizzes", in);
        grade = (homeworkWeight * homeResult) + (classworkWeight * classResult) + (testWeight * testResult);
        grade *= 100; //Convert from decimal to percent.
        if(grade >= 90)
        {
        	System.out.print("You have an A in this class, and your exact percentage is " + grade);
        }
        else if(grade >= 80)
        {
        	System.out.print("You have a B in this class, and your exact percentage is " + grade);
        }
        else if(grade >= 70)
        {
        	System.out.print("You have a C in this class, and your exact percentage is " + grade);
        }
        else if(grade >= 60)
        {
        	System.out.print("You have a D in this class, and your exact percentage is " + grade);
        }
        else
        {
        	System.out.print("You are failing this class, and your exact percentage is " + grade);
        }
        in.close();
    }
    
    private static float subjectMath(String Subject, Scanner pipe)
    {
    	float result = 0;
    	float score = 0; //numerator
        float possible = 0; //denominator
        boolean moreGrades = true;
        do 
        {
            System.out.println("You are currently adding scores for " + Subject + ". Please type the numerator of the next item. You can also type a non-number if you're finished: ");
            if (pipe.hasNextFloat()) 
            {
                score += pipe.nextFloat();
                System.out.println("Please type the denominator for the same item: ");
                if(pipe.hasNextFloat())
                {
                	possible += pipe.nextFloat();
                }
            } 
            else 
            {
                moreGrades = false; //To stop entering grades.
            }
        } while (moreGrades);
        result = score / possible;
        System.out.println("Your total score for " + Subject + " is " + score + " out of " + possible + ", or " + result);
        pipe.nextLine();
		pipe.nextLine();
    	return result;
    }

    private static void examCalc() {
    }
 public static void examGrade()
    {
    Scanner gradeInput = new Scanner(System.in);
    System.out.print("Enter current grade here: ");
    double examWeight = 0.3;
    double currentGrade = gradeInput.nextDouble();
    int passingGrade = 60;
    double completeFinish;
    double almostFinal;
    almostFinal = passingGrade - ((1 - examWeight) * currentGrade);
    completeFinish = almostFinal / examWeight; 
   
    System.out.print("you need to get a: " + completeFinish);
    }
    
}

    
}

}



