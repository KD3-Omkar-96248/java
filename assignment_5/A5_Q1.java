import java.util.Scanner;

public class Reverse_a_String 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string to be reversed : ");
        String input = sc.nextLine();
        
        String reversed = reverse(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        
        sc.close();
    }

    public static String reverse(String str) 
    {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}