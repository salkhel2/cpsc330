//Andrew Ney

package Mastermind;

import java.io.*;
import java.util.*;
import java.util.Scanner;

//main class that calls all methods from other files
public class Mastermind_Ney {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Mastermind.");
		
		//member variables required for main class (not in other files)
		int turnCount = 1;
		boolean hasGameEnded = false;
		boolean hasPlayerWon = false;
		boolean stillPlaying = true;
		
		while (stillPlaying == true) {

			//builds the remaining member methods
			//NR - determines turn count
			//NumLetters - builds code to be guessed
			//NumLetters.Check_Num_Letter_In_TheCode() - implementation of build
			//p2 - creates object to play through the game
			Num_Rounds NR = new Num_Rounds();
			Mastermind_Sahar NumLetters = new Mastermind_Sahar();
			NumLetters.Check_Num_Letters_In_TheCode();
			secondplayer p2 = new secondplayer(NumLetters.getCode( ));	

			//runs the game, incrementing turn count if player has not won
			//loop breaks prematurely if player has won
			while (hasGameEnded == false) {
				p2.secondPlayerGuess(NumLetters.getCode( ));
				if (p2.getPlayerCode().equals(NumLetters.getCode( ))) {
					hasPlayerWon = true;
				}
				else {
					turnCount++;
				}
			
				if (hasPlayerWon == true || turnCount > NR.getNumRounds( )) {
					hasGameEnded = true;
				}
			}

			//if/else to determine if player won or lost
			if (hasPlayerWon == true) {
				System.out.println("Congratulations, you have won the game!");
			}
			else {
				System.out.println("Sorry, you have lost the game.");
				System.out.println("The code was " + NumLetters.getCode( ));
			}
	
			//if statement decides if player wins the game
			//resets all relevant variables or ends game
			System.out.println("Would you like to play again?");
			System.out.println("Please type 'Yes' as shown to play again. Otherwise, the game will end.");
			String playAgain = in.nextLine();
			if (playAgain.equals("Yes")) {
				stillPlaying = true;
				hasGameEnded = false;
				hasPlayerWon = false;
				turnCount = 1;
			}
			else {
				stillPlaying = false;
			}
		}
	}
}
