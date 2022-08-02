/*I improved this guesser game by
 1)In this context, the system is selected the number randomly rather than user input. We can find it out.
 2)Here,I used random class by importing Random package with boundary limit 100(For example). You can also modify the boundary limit.
 3)A do-while loop is used for checking the conditions.
 4)Here user name is taken at starting.
 5)After computer system selected the number internally.
 6)After the user input will be taken.
 7)The umpire method with arguments checks the conditions using if-else conditions.
 8)When user enters wrong input number , the loop iterates until the while-loop condition satisfies.
 9)When user enters correct input the loop condition breaks.!
 10)Finally the game is finished by printing user name and no.of iterations.
*/
package assignment2;

import java.util.Random;

import java.util.Scanner;


class Guesser
{
   
   public int GuessorGame()
   {
	   
	   Random rand= new Random();
	   int guesser= rand.nextInt(100);
	   
	   return guesser;
   }
   
  
}


class Player
{
	public int Player()
	{
		Scanner pl= new Scanner(System.in);
		System.out.println("Enter your number between 1 to 100..!");
		int player =pl.nextInt();
		
		return player;
	 
	}
	
}
 class Umpire
{
	public void Umpire(int guessnumber,int player)
	{
		if(player>0)
		{
		if(guessnumber==player) System.out.println("YES...!You guessed correct,");
		
		else if(guessnumber>player)  System.out.println("You entered a lower number than guessed.");
		
		else if(guessnumber<player)  System.out.println("You entered a higher number than guessed.");
		}
		
		else
		{
			System.out.println("Sorry , you entered wrong number..! Try again.");
		}
		
	}
}
 
 public class game
 {
	public static void main(String[] args)
	{
		System.out.println("Hello ...! Welcome to [Guessing the number game]. I selected one number. Can you guess it??");
		System.out.println("First, please enter your name..!");
				
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		
		int player = 0;
		int guesser = 0;
		int iterator=0;
		
		Guesser gs =new Guesser();
		guesser= gs.GuessorGame();
		do
		{
			
			Player plyr=new Player();
			Umpire ump= new Umpire();
			
			
			player= plyr.Player();
			
			ump.Umpire(guesser, player);
			
			iterator++;
		}
		while(player!=guesser);
		if(iterator<2)
		    System.out.println(name+", you guessed the number in "+iterator+" iteration, Thanku for playing the game..!");
		else
			System.out.println(name+", you guessed the number in "+iterator+" iterations, Thanku for playing the game..!");
		
		
		
		
		
	}

}

 













