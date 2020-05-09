package Chapter2PPElishaGarcia;


/**Student Name: Elisha Garcia

*Date Completed: 02/19/2020

*Project No. and Page No. in the book: Project 2, pg. 55 - 96

*Extra Credit: No

*Project Description: Allowing User to input information about them selves. Then taking that 
*					  information and returning a small blurb back in the output. Utilizing 
*					  Scanner class, object , and data type conversion using casting.

**/

//importing the Scanner class for later use
import java.util.Scanner;

public class Chapter2PPElishaGarcia {
	
	public static void main (String[] args) { 
		
		//declaring my constants. THESE SHOULD ALL BE IN CAPS!!! "HOURS_IN_DAY"
		final double hoursInDay = 24;
		final double secondsInHour = 3600;
		final double daysInWeek = 7;
		
		//making a scanner object named "sc"
		Scanner sc = new Scanner(System.in);
		
		
		/** printing a prompt to inform the user what information i am asking for. Then using 
		    sc to read the users input and assigning the input to fullName.  **/
		System.out.println("What is your full name:");
		String fullName = sc.nextLine();
		
		System.out.println("What college are you attending:");
		String collegeName = sc.nextLine();
		
		System.out.println("What is your pet's name?");
		String petName = sc.nextLine();
		
		
		//using data given to us by user to fill in info for the next prompt
		System.out.println("What do you say to you pet " + petName + " everyday?");
		String sayToPet = sc.nextLine();
		
		//same as before but now i am specially asking for a number that will be stared as a double
		System.out.println("How old is " + petName + "?");
		double petAge = sc.nextInt();
		
		System.out.println("How many days have you been away from your pet?");
		double daysAwayFromPet = sc.nextInt();
		
		//made new object and used arithmetic to assign its stored values
		double numOfSecondsAway = daysAwayFromPet * (secondsInHour * hoursInDay);
		double numOfWeeksAway = daysAwayFromPet / daysInWeek;
		
		//using casting to turn the doubles into an int object that i can use
		int daysAwayFromPetInt = (int) daysAwayFromPet;
		int numOfSecondsAwayInt = (int) numOfSecondsAway;
		
		//printing a series of line and sentences that utilize that data given by the user
		System.out.println();
		System.out.println();
		System.out.println("Hello, my name is " + fullName);
		System.out.println();
		System.out.println("I am enjoying my time at " + collegeName + "\nthough I miss my pet " + petName
				+ " very much");
		System.out.println();
		System.out.println("I have been away from " + petName + " for " + daysAwayFromPetInt + " days");
		System.out.println();
		System.out.println("and that is an unelievble " + numOfSecondsAwayInt + " seconds");
		System.out.println();
		System.out.println("I have missed saying \"" + sayToPet + "\" to " + petName + 
				" for " + daysAwayFromPetInt + " days");
		System.out.println();
		System.out.println("Even if I say it every week, not every day\nI would still have missed" +
				" saying \"" + sayToPet + "\" for " + numOfWeeksAway + " times.");

		
	}

}
