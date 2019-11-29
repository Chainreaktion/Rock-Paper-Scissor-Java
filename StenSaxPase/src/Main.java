/* STEN SAX PÅSE©
 * 
 * Av Johan Edenfjord ®
 * 
 * Ett enkelt spel som heter sten sax påse. (Rock Paper Scissor)
 * 
 * Regler.
 * 
 * Sten vinner över Sax
 * Sax vinner över Påse
 * Påse Vinner över Sten
 * 
 * Spelet går i tre omgångar och det är bäst av tre som gäller.
 * Spelare 1 väljer först och sen spelare 2. därefter jämförs valen
 * och där bestäms vem som vunnit omgången.
 * Efter tre omgångar så sammanställs poängen och det
 * annonseras ut vem som vunnit!
 *  
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		int oneChoice = 0;
		int twoChoice = 0;
		final int rock = 1;
		final int scissor = 2;
		final int paper = 3;
		int turn = 1;
		int playerOne = 0;
		int playerTwo = 0;
		String playerOneChoice = "";
		String playerTwoChoice = "";
		boolean choice = true;
		Scanner reader = new Scanner(System.in);
		
//		int maxTurns = 0;
//
//		try {
//		System.out.println("Hello There!\n\nWelcome to Rock Paper Scissors.\nPlease enter how many turns you would like to play: ");
//		maxTurns= reader.nextInt();
//		}
//		catch (InputMismatchException e) 
//		{
//			maxTurns = 3;
//		} När jag lade in detta så blev det ett invalid entry. Som att jag hade gjort ett tomt val i första rundan.
		
		while (turn <= 3) {

			while(choice) {
				System.out.println("round " + turn + " of 3" );
				/* Player one makes its choice!*/
				System.out.println("Player ONE!! GO!!\n\n1. Rock\n2. Scissor\n3. Paper\n\nYour Choice: ");
				playerOneChoice = reader.nextLine();

				

				try {
					oneChoice = Integer.parseInt(playerOneChoice);
				}
				catch (NumberFormatException e)
				{
					oneChoice=0;
				}

				if ((oneChoice >=1) && (oneChoice <= 3)) {
					choice = false;
				} else if ((playerOneChoice.equals("rock"))
						|| (playerOneChoice.equals("scissor"))
						|| (playerOneChoice.equals("paper"))) {
					choice = false;
				} else {
					System.out.println("Invalid Entry!");
				}


			}

			choice = true;

			while(choice) {
				System.out.println("Round " + turn + " of 3");
				/* Spelar 2 väljer sitt alternativ!*/
				System.out.println("Player Two! GO!\n\n1. Rock\n2. Scissor\n3. Paper\n\nMake your choice: ");
				playerTwoChoice = reader.nextLine();

				
				try {
					twoChoice = Integer.parseInt(playerTwoChoice);

				} catch (NumberFormatException e)
				{
					twoChoice=0;
				}

				if ((twoChoice >=1) && (twoChoice <=3)) {
					choice = false;
				} else if ((playerTwoChoice.equals("rock"))
						|| (playerTwoChoice.equals("scissor"))
						|| (playerTwoChoice.equals("paper")) ) {
					choice = false;
				} else {
					System.out.println("Invalid Entry!");
				}

			}

			choice = true;
			
			if (((oneChoice == rock) || (playerOneChoice.equals("rock")))
					&& ((twoChoice == rock) || (playerTwoChoice.equals("rock")))) {

				System.out.println("You both chose ROCK! wtf. NO POINTS!");

			} else if (((oneChoice == rock) || (playerOneChoice.equals("rock")))
					&& ((twoChoice == scissor) || (playerTwoChoice.equals("scissor")))){

				System.out.println("Player ONE get ONE POINT!");
				playerOne++;
				turn++;

			} else if(((oneChoice == scissor) || (playerOneChoice.equals("scissor")))
					&& ((twoChoice == rock) || (playerTwoChoice.equals("rock")))){

				System.out.println("Player TWO get ONE POINT!");
				playerTwo++;
				turn++;

			} else if (((oneChoice == scissor) || (playerOneChoice.equals("scissor")))
					&& ((twoChoice == scissor) || (playerTwoChoice.equals("scissor")))) {

				System.out.println("You both chose SCISSORS! wtf. NO POINTS!");

			} else if (((oneChoice == scissor) || (playerOneChoice.equals("scissor")))
					&& ((twoChoice == paper) || (playerTwoChoice.equals("paper"))) ) {

				System.out.println("Player ONE get ONE POINT!");
				playerOne++;
				turn++;

			} else if (((oneChoice == paper) || (playerOneChoice.equals("paper")))
					&& ((twoChoice == scissor) || (playerTwoChoice.equals("scissor"))) ) {

				System.out.println("Player TWO get ONE POINT!");
				playerTwo++;
				turn++;

			} else if (((oneChoice == paper) || (playerOneChoice.equals("paper")))
					&& ((twoChoice == paper) || (playerTwoChoice.equals("paper"))) ) {

				System.out.println("You both chose PAPER? wtf. NO POINTS!");

			} else if (((oneChoice == paper) || (playerOneChoice.equals("paper")))
					&& ((twoChoice == rock)|| (playerTwoChoice.equals("rock"))) ) {

				System.out.println("Player ONE get ONE POINT!");
				playerOne++;
				turn++;

			} else if (((oneChoice == rock) || (playerOneChoice.equals("rock")))
					&& ((twoChoice == paper) || (playerTwoChoice.equals("paper"))) ) {

				System.out.println("Player TWO get ONE POINT!");
				playerTwo++;
				turn++;

			}

			
		}

		if(playerOne < playerTwo) {
			System.out.println("Game is over Player 2 Won with :" + playerTwo + " p \nagainst : " + playerOne + " p");
		} else if (playerOne > playerTwo){
			System.out.println("Game is over Player 1 Won with :" + playerOne + " p \nagainst : " + playerTwo + " p");
		} else {
			System.out.println("It was a DRAW! \nPlayer One got: " + playerOne + " points.\nPlayer Two got: " + playerTwo + " points.");
		}


	}

	
	
}
