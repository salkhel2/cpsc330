//Nick Randall
package Mastermind;

//Deals with the 2nd player responses
import java.util.*;


public class secondplayer
{
	// constructor
	public secondplayer (String s)
	{
		firstPlayerCode=s;
	}
	
	public String secondPlayerGuess(String s)
	{
		//Get 2nd Player Guess
		java.util.Scanner in = new java.util.Scanner(System.in);
		ArrayList<String> code = new ArrayList<String>();
		System.out.println("Enter a 4 letter guess:");
		guess= in.nextLine();

		//Determine how many letters are in the guess
		code.add(guess);
		double count=0;
		for (int i=0; i < guess.length(); i++)
		{
			count++;
		}	

		//Deals with the guess if it is too short or too long
		while(guess.length()!=4)
		{	
			System.out.println("Code is too long or too short.");
			System.out.println("Enter a 4 letter code: ");
			guess= in.nextLine();

			code.add(guess);
			for (int i=0; i < guess.length(); i++)
			{
				count++;
			}
		}

		//set second player guess to uppercase
		guess = guess.toUpperCase();

		//Compare the 2nd player guess with original code and output condition message
		int inTheRightPlace=0;
		int rightAnswerWrongPlace=0;
		int temp = 0;
		int counter=0;

		if (inTheRightPlace != 4)
		{
		inTheRightPlace = 0;
		rightAnswerWrongPlace = 0;
		System.out.println("firstPlayerCode is " + firstPlayerCode);
		for (int i=0; i < firstPlayerCode.length(); i++)
		{
			for (int j=0; j < guess.length(); j++)
			{
				if (guess.charAt(j)== firstPlayerCode.charAt(i) && i==j)
				{
					inTheRightPlace++;
					i++;
				}
				else if (guess.charAt(j) ==  firstPlayerCode.charAt(i))
				{
					rightAnswerWrongPlace++;
				}	
				
			}
		}

		//Tell the 2nd player how they did
		if (inTheRightPlace!=4)
		{
			System.out.print(inTheRightPlace);
			System.out.println(" of your answers are in the right place.");
			System.out.print(rightAnswerWrongPlace);
			System.out.println(" of your answers are in right, but in the wrong place.");
		}
		}
	
		return guess;
	}	
	
	public String getPlayerCode() 
	{
		return guess;
	}
		
	//private member data
	private String firstPlayerCode;
	private String guess;
	
}
