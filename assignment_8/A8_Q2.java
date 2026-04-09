import java.util.ArrayList;
import java.util.Collections;

public class ColorList 
{
	public static void main(String[] args) 
	{
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		
		Collections.sort(colors);
		System.out.println("Sorted Color List : ");
		for (String color : colors)
		{
			System.out.println(color);
		}
	}

}
