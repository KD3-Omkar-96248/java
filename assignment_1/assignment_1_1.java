import java.util.Scanner;
public class assignment_1_1 {
       public static void  main(String[] arg) {
    	   
    	   int num1;
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("Enter the number num1 :");
    	   num1 = sc.nextInt();
    	   Integer num2 = new Integer(num1);
    			   
    	        
    	   System.out.print("number :"+num1);
    	   System.out.println("Given number : " +num2);
    	   System.out.println("Binary number :"+num2.toBinaryString(num1));
    	   System.out.println("Octal number :"+num2.toOctalString(num1));
    	   System.out.print("Hexadecimal :"+num2.toHexString(num1));
    	
    	   
    	 
    	   
    	   
    	   
    	   
    	 
           
       }
}
    	   
       

