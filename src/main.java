import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length;
		double width;
		double area;
		double perimeter;
		double volume;
		double height;
		boolean cont = true;
		String ans;
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Welcome to Grand Circus Room Detail Generator!");
		
		while(cont) {
			System.out.print("\nEnter Length: ");
			length = scnr.nextDouble();
			
			System.out.print("Enter Width: ");
			width = scnr.nextDouble();
			
			System.out.print("Enter Height: ");
			height = scnr.nextDouble();
			
			area =  length * width;
			System.out.printf("Area: %s\n", area);
			
			perimeter =  2 * (length + width);
			System.out.printf("Perimeter: %s\n", perimeter);
			
			volume =  length * width * height;
			System.out.printf("Volume: %s\n", volume);
			
			System.out.print("Continue?(y/n): ");
			ans = scnr.next();
			
			if(ans.equals("N") || ans.equals("n")) {
				cont = false;
				System.out.println("Goodbye!");
		}
	}
	}
}
