import java.util.Scanner;
public class assigment_1_2 {
	public static void main(String [] args) {
		
	

	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter num1 :");
	if(!sc.hasNextDouble()) {
		System.out.println("Erroe : First input is not a double value.");
		return ;		
		}
	double num1 = sc.nextDouble();
	System.out.println("enter second num :");
	if(!sc.hasNextDouble()) {
		System.out.println("Error:Second input is not a double value. ");
	    return;	
	
	
    }
	double num2 = sc.nextDouble();
	double average = (num1 + num2)/2;
	System.out.println("Average ="+ average);
	}
}

