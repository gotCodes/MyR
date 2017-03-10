import java.util.Scanner;
public class Ch_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1-1000: ");
		int a = input.nextInt();

		if (a > 1000){
			System.out.println("That number is too high");
		}
		else if (a < 1){
			System.out.println("That number is too small");
		}
		else{
			System.out.println("Good number!");
		}

		int b = (a % 10);

		int c = ((a / 10) % 10);

		int d = ((a / 100) % 10);
		
		int e = ((a / 1000) % 10);

		System.out.println("The integers of " + a + " are " 
				+ b + ", " + c + ", " + d + ", and " + e);

		System.out.println(b + " + " + c + " + " + d + " + " + e + " = " 
				+ (b+c+d+e));
	}
}