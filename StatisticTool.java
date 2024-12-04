// Copyright 2024 Minna Azeem
//

import java.util.Scanner;

 public class StatisticTool {

 public static void main(String[] args) {
	 Scanner stdin = new Scanner(System.in);
	
	 // Loop Preamble
	 // Put the variables which must exist outside of the main application loop
	 // here, e.g., the loop control variable, the data variable, and, at least,
	 // one more.
	 //
	 	
	 
	 //Initialize i 
	 int i = 0;
	 int two = 0;
	 int three = 0;
	 int four = 0;
	 //Initialize an double array with 2 spaces
	 double[] doubleArray = new double[2];
	 int input; // loop control variable
	
	 // Main Application Loop
	 do {
	 // Print a menu for user interaction
		 System.out.println("Statistic Tool");
		 System.out.println("1. Add Data");
		 System.out.println("2. Calculate Max");
		 System.out.println("3. Calculate Min");
		 System.out.println("4. Print Data");
		 System.out.println("5. Quit");
		 System.out.print("$> ");
		 input = stdin.nextInt();
		
		 
		 // depending on the user's input, do one of four things or quit.
		 

		 // if input value is 1, put the value after it into doubleArray
		 if (input == 1)
		 {
			 //add space to array if filled
			 while (i >= doubleArray.length - 1)
			 {
				 double[] copy = new double [2 * doubleArray.length];
				 for (int ii = 0; ii < doubleArray.length; ii++)
				 {
					 copy[ii] = doubleArray[ii];
				 }
				 
				 doubleArray = copy;
			 }
			 
			     //put the next val into next spot in array
				 doubleArray[(i - (two + three + four))] = stdin.nextDouble();
				 
				 System.out.print("Enter Datam: ");
		 }
		 
		 
		 // if input value is 2, find/print max of doubleArray
		 if (input == 2)
		 {
			 
			//set max as the first array value
			double max = doubleArray[0];
			//4loop going through array/comparing values to find max
			for (int ii = 0; (i - (two + three + four)) > ii; ii++)
			{
				if (doubleArray[ii] > max)
				{
					max = doubleArray[ii];
				}
			}
			
			//print max
			System.out.println("Max datum: " + max);
			//print new line
			System.out.println("");
			 
			//update two
			two++;
		 }
		 
		 
		 // if input value is 3, find/print min of doubleArray
		 //need to account for not taking the extra space in array
		 if (input == 3)
		 {
			 //set min as the first array value
			 double min = doubleArray[0];
			 //4loop going through array/comparing values to find min
			 for (int ii = 0; (i - (two + three + four)) > ii; ii++)
			 {
				 if (doubleArray[ii] < min)
				 {
					 min = doubleArray[ii];
				 }
			 }
			 //print min
			 System.out.println("Min datum: " + min);
			//print new line
			 System.out.println("");
			 
			 //update three
			 three++;
		 }
		 
		 // when input value is 4, print all data
		 if (input == 4)
		 {
			 for (int ii = 0; (i - (two + three + four)) > ii; ii++)
			 {
				 System.out.print(doubleArray[ii] + " ");
			 }
			 //print new line
			 System.out.println("");
			 //update four
			 four++;
		 }
		 i++;
		 
	 // when input value is 5, quit
	 } while (0 < input && input < 5);
	
	
	 System.out.println("\nGoodbye!");
	
	 stdin.close();
 }

 }