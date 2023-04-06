package Mainpro;

import java.util.*; // this library is for the scanner 

public class guitar
{

	public static void main(String[] args)
	{
		
		String userName = typeYourName(); 
		String approval = approval(userName);
		int guitar = guitarType(); 	// calling functions in the main function 
		String color = colorPick();
		end( userName, color, guitar); // this is for the void function

	}
	
	static String typeYourName () // getting users input for the name
	{
		
		String userName; 
		System.out.println("Please enter your name: ");
		userName = new Scanner(System.in).next(); // scanner
		return userName; // this line returns the name to the main function 
	
	}
	
	static String approval (String userName) // saving/writing the name in parameter for the function
	{
		
		String approval;
		System.out.println("Welcome to ALKHOURY'S guitar shop "+ userName + ". You have chosen the right place for buying a guitar!. You need a guitar, right?");
		approval = new Scanner(System.in).next();
		return approval; // returning event for the main function
		
	}
	
	static int guitarType() // writing the event as a parametir for the finction
	{
		
		int guitar; // inicilaizing guitar
		System.out.println("Here in my shop you have 2 options, the classical and the acousic guitar.");
		System.out.println(" 1.calssical guitar: is basically a guitar that you can play falmenco style on it ");
		System.out.println(" 2.acoustic guitar : is more likley for singing and recording in studios");
		System.out.println("are you looking for guitar 1 or 2?");
		
		do // this loop is for the user choice of guitar 
		{
			
			guitar = new Scanner(System.in).nextInt();
			if (guitar == 1 || guitar == 2 )
			{
				break; // if the user choose 1 or 2, its going to break the loop and return guitar
			}
			System.out.println("Im sorry, but you hsve to choose either classical or accoustic" );
		}
		while (guitar != 1 || guitar != 2); // the user must input 1 or 2, other than that its going to
		return guitar;						// loop to the print inside the do while
		
		
	}
	
	static String colorPick () // parameters are not needed in this function 
	{
		String color;
		System.out.println("If you chose guitar 1, you will find lots of new colors like maroon, brown, and white. I would recommend the maroon one.");
		System.out.println("As for guitar 2, there is a set of dark wood colors like black and cahrkol, it would look amazing with a red strap on the guitar.");
		color = new Scanner(System.in).next();
		return color;
	}
	static void end (String userName, String color, int guitar) // the void here is because i dont have a return type, and the void here
	{															// not to give any other option
		System.out.println("You have chosen classical guitar "+ guitar + " and the  "+ color +". I believe that guitar is in safe hands with you "+ userName + "!!");
		System.out.println("Thank you for choosing ALKHOURY'S guitar shop!");
	}
	

	
}