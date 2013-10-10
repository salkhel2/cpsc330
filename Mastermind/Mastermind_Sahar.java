// SAHAR ALKHELAIFI

package Mastermind;

import java.io.*;
import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////
// TAKE THE CODE FROM THE USER AND CHECK IF IT IS WHITHEN THE 		///
// NUMBER OF LETTERS THEY PICKED 					///
///////////////////////////////////////////////////////////////////////////


class Mastermind_Sahar{
	private static String readCode() {
	Scanner in = new Scanner(System.in);
		try{
			Console console = System.console();
			System.out.println("Enter code:");
			return new String(console.readPassword( ));
		}
		catch(NullPointerException e) {

		}
		return null;
	}

	String Code;

	
	public String getCode( ) {
		return Code;
	}
	
	
	public void Check_Num_Letters_In_TheCode(){
		Scanner in = new Scanner(System.in);
		//Array list for letters
		String[] alphaLetters = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		//Declare variables
		int numLetters = 0;

		//check number of letters
		while (numLetters == 0 || numLetters >26){
			System.out.println("How many letters are possible to make the code... No more than 26 letters: ");
			numLetters = in.nextInt();
		}                

		// Check input if only letters
		System.out.println("Enter the code for the game: ");
		Code = readCode();

		// Check if the user inputs letters 
		for(int i = 0; i < Code.length( ); i++) {
			while (Character.isDigit(Code.charAt(i))){
				System.out.println("Enter the code for the game (should contain only letters): ");
				Code = readCode();

			}
		}

		// check if the user input contains 4 letters not less and not more than 4...
		while (Code.length() != 4)
		{
			System.out.println("The code should only contain 4 letters...try again: ");
			Code = readCode();

		}


		//Check if the letters in the code are within the limit

		for (int i =0; i< Code.length(); i++ ){
			while(Code.charAt(0) > numLetters + 65 - 1 && Code.charAt(0) > 64 || Code.charAt(1) > numLetters + 65 - 1 && Code.charAt(0) > 64 || Code.charAt(2) > numLetters + 65 - 1 && Code.charAt(0) > 64 || Code.charAt(3) > numLetters + 65 - 1 && Code.charAt(0) > 64){
				System.out.println("The input should not be more than the letters possiable to make the code...try again: ");	
				Code = readCode(); 
			}


		} 
	}
}

