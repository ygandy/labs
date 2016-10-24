package Week6Assessment;

//Week 6 Assessment A thru M (Author Yolanda Gandy)

import java.util.Scanner;

public class AssessmentSamplesAthruM {
	public static void main(String[] args) {

//		        System.out.println("What is your name?");
//
//		        Scanner in = new Scanner(System.in);
//		        
//		        String name = in.nextLine();
//
//		        System.out.print("Hello " + name);
//
//		        in.close();
//		        
		//Errors A:There is no type specified for the name variable on line 9. Should be declared and changed to String name = in.nextLine().
		//Errors B: Scanner in = new Scanner(System.in) should be above the line String name = in.nextLine();
 
//****************************************************************************************
//		System.out.println("What is your favorite number?");
//
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//
//        int product = 10 * number;
//        System.out.println(number + " x 10 = " + product);
        
        //Errors C: should be int number = in.nextInt() not String number
        //Errors D: should be int number = in.nextInt() not in.nextLine()
        //Errors E: product should be declared with type int: int product = 10 * number;
        //Errors F: int product = 10 * Number; Number should be lower case n
        //Errors G: int number should be int number = in.nextInt()
        //Errors H: int product = 10 + number should be int product = 10*number
        
//******************************************************************************************
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is 2 + 2?");
//        int answer = scanner.nextInt();
//
//        if (answer == 4)
//            System.out.println("Correct!");
//
//        System.out.println("Goodbye.");
//        scanner.close();
//        
       //Errors I: if answer = 4 should be if answer == 4
       //Errors J: if {answer == 4} should be () not {}
       //Errors K: it doesn't say that 3 is correct. It just says Goodbye. I thought it should have {}; yet still worked. It said that 4 is correct and Goodbye.
           
//******************************************************************************************
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rate your experience from 1 and 5.");
        int answer = scanner.nextInt();

        // print out one appropriate response
        switch (answer) {
        case 1:
        case 2:
            System.out.println("Ouch! Sorry to hear that.");
            break;
        case 3:
            System.out.println("Hmm. Okay.");
            break;
        case 4:
        case 5:
            System.out.println("Booyah! We rocked it!");
            break;
        default:
            System.out.println("That does not compute!!");
        }

        System.out.println("Goodbye");
        scanner.close();
        
        //Errors M: It gives multiple answers because of the absence of break statements
//*****************************************************************************************
	}//end of main

}//end of class

