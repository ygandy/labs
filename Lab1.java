import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		//perform room calculations until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Please enter the length.");		
		double length = scanner.nextDouble();
		
		System.out.println("Please enter the width.");
		double width = scanner.nextDouble();
		
		System.out.println("Please enter the height.");
		double height = scanner.nextDouble();	
			//System.out.println(length);
			//System.out.println(width);
			
			double area = width * length; 
			double perimeter = ((length * 2) + (width * 2));
			double volume = (length * width * height);
			
				
			System.out.println("The perimeter of the first room is: " + perimeter);
			System.out.println("The area of the first room is: " + area);
			System.out.println("The volume of the first room is: " + volume);
			
		//see if user want to continue to enter another room
			System.out.print(("Continue?  (y/n): "));
			choice = scanner.next();
		//	System.out.println();
			
		}
		scanner.close();
		System.out.println("Bye!");
			
			/*System.out.println("Please enter the length for the next room: ");		
			System.out.println("Please enter the width: ");		
				
			System.out.println("The perimeter of the next room is" + perimeter);
			System.out.println("The area of the next room is" + area);
			System.out.println("The volume of the next room is: " + volume);
		*/	
	}

}
