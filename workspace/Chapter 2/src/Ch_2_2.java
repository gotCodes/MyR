import java.util.Scanner;
import java.text.DecimalFormat;
public class Ch_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.####");
		DecimalFormat ef = new DecimalFormat("#.#");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		
		System.out.println("Enter length: ");
		double length = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " + df.format(area));
		System.out.println("The volume is " + ef.format(volume));
	}

}
