import java.util.Random;
import java.util.Scanner;

public class Ch_3_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		boolean keeperGoin = true;

		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] cards = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		Game:
		while(keeperGoin){

			String suit = suits[rand.nextInt(suits.length)];
			String card = cards[rand.nextInt(cards.length)];

			System.out.println("Would you like to pick a card?");
			System.out.print(" [1] Yes or [2] No: ");
			int ans1 = input.nextInt();

			if(ans1 == 1 ){
				System.out.println("Good Choice!");
				System.out.println("You pick: " + card + " of " + suit);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			
			else if (ans1 == 2){
				System.out.println("Well okay then...");
				System.out.println("Are you sure?");
				System.out.print(" [1] Yes or [2] No: ");
				int ans2 = input.nextInt();
				
				if (ans2 == 1){
					System.out.println("FINE!");
					break;
				}
				
				else if (ans2 == 2){
					System.out.println("So let's play!");
					continue Game;
				}
			}
			
			else {
				System.out.println("Well dad gum chum you typed the wrong num... ber!");
			}
		}
	}
}
