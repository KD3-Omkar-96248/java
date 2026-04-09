import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.nextLine();
        
        str = str.toLowerCase();
        
        str = str.replaceAll("[^a-z0-9]", " ");
        
        String reversed = " ";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        
        if (str.equals(reversed)) 
        {
            System.out.println("It's a palindrome!");
        }
        else 
        {
            System.out.println("It's not a palindrome!");
        }
        
        sc.close();
    }
}