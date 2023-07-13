import java.util.Scanner;
public class NotOrtalamasıProgramı {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double midterm1, midterm2, final1,result;
		System.out.println("Enter the First Midterm:");
		midterm1 = scan.nextDouble();
		System.out.println("Enter the Second Midterm:");
		midterm2 = scan.nextDouble();
		System.out.println("Enter the Final:");
		final1 = scan.nextDouble();
		
		result = (midterm1*30/100) + (midterm2*30/100) + (final1*40/100);
		System.out.println("Result:" + result);
		
		String str = (result >= 50) ? "Congratulations! You Passed." : "You Failed.";
		System.out.println(str);
		scan.close();
	}

}
