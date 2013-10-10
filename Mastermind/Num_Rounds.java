

package Mastermind;

import java.util.Scanner;
// Get the number of rounds from both players
class Num_Rounds {

private int numRounds = 0;

public int getNumRounds( ) {
	return numRounds;
}

public Num_Rounds (){
Scanner in = new Scanner(System.in);

// check for number of rounds
 while (numRounds ==0){
         System.out.println("Enter the number of rounds possible for this game: ");
         numRounds = in.nextInt();
        }
      }
}
