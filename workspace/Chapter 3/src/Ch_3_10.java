import java.util.Scanner;
import java.util.Random;
//https://www.youtube.com/watch?v=-m4lyIqOiiA 
//learned how to do most of this from this video

public class Ch_3_10 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		boolean continueLoop = true;
		int randNum1;
		int randNum2;
		int addedAns;
		int score = 0;
		
		System.out.println("Press -1 to exit game");
		
		while(continueLoop) {
			
			Scanner input = new Scanner(System.in);
			randNum1 = (rand.nextInt(100));
			randNum2 = (rand.nextInt(100));
			addedAns = (randNum1 + randNum2);

			System.out.print(randNum1 + " + " + randNum2 + " = " );
			int yourGuess = input.nextInt();

			if (yourGuess != -1){
				System.out.println((yourGuess == addedAns) ? "You're Right!" : "You're Wrong!");
				if(yourGuess == addedAns){
					score ++;
				}
				else{
					score --;
				}
				System.out.println("Your Score is " + score);
			}

			else {
				System.out.println("Thanks for playing" + "\n Your score is " + score);
				continueLoop = false;
			}
		}
	}
}
