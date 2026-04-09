import java.util.Scanner;

public class Count_String 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String[] words = input.trim().split("\\s+");
        
        int wordCount = 0;
        if (!input.trim().isEmpty()) 
        {
            wordCount = words.length;
        }
        
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
}
