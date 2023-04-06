package finalCode;
import java.util.*;
import java.util.Random;

public class RockPaperScissors
{


public static void main(String[] args)
{
    // Getting input from the user
    Scanner scanner = new Scanner(System.in); // the scanner here is to get a string from the user
        
    System.out.println("Choose! (rock/paper/scissors)");
    String player = scanner.nextLine(); // read the next line
      
    // Getting output from Dell
    Random random = new Random(); // getting a random number from Dell
    int randomNumber = random.nextInt(3); 
        
    String Dell; 
    if (randomNumber == 0) // if statement for the computer choice using random number
    {
        Dell = "rock";
    } 
    else if (randomNumber == 1)
    {
        Dell = "paper";
    } 
    else
    {
        Dell = "scissors";
    }
    System.out.println("Dell chose " + Dell + "!");
  
    
    if (player.equals(Dell)) // another if statement for the results using a method (boolean)
    {
        System.out.println("It's a draw!");
    } 
    
    else if (playerWins(Dell, player)) 
    {
        System.out.println("Player wins!");
    } 
    else 

        System.out.println("Computer wins!");
    }

private static boolean playerWins(String player, String Dell)
{
	return false;
}

}

	
