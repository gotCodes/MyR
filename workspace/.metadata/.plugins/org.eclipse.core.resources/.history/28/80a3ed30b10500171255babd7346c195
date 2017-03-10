import java.util.Random;
import java.util.Scanner;

public class Ch_3_17 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		int max = 3;
		int cpu;
		int player;
		boolean play = true;
		int score = 0;

		System.out.println("Let's play rock paper scsiors.");


		while(play){
			cpu = rand.nextInt(max);
			System.out.println("Enter \n\t[0] for rock \n\t[1] for paper \n\t[2] for scissors");
			System.out.print("\t\nYou guess: ");
			player = input.nextInt();
			
			if (player == -1){
				break;
			}

			else{
				if (player == cpu){
					System.out.println("Draw!");
				}

				else if(player == 0){
					System.out.println("cpu guessed: " + cpu);
					System.out.println((cpu == 2) ? "You Win!" : "You Lose!" );
					if(cpu == 2){
						score ++;
					}
					
					else {
						score --;
					}
				}

				else if(player == 1){
					System.out.println("cpu guessed: " + cpu);
					System.out.println((cpu == 0) ? "You Win!" : "You Lose!" );
					if(cpu == 0){
						score ++;
					}
					
					else {
						score --;
					}
				}

				else if(player == 2){
					System.out.println("cpu guessed: " + cpu);
					System.out.println((cpu == 1) ? "You Win!" : "You Lose!" );
					if(cpu == 1){
						score ++;
					}
					
					else {
						score --;
					}
				}

				else {
					System.out.println("Sorry wrong number!");
				}
			}
		}
		
		System.out.println("Thanks for playing!" 
						+ "\nYour score is " + score);
		
	}
}
