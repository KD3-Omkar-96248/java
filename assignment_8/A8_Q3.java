import java.util.ArrayList;

public class ReplaceElement 
{
	public static void main(String[] args) 
	{
		ArrayList <String> colors = new ArrayList<> ();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		
		colors.set(1, "Black");
		System.out.println("Updated arrayList : ");
		for (String color : colors)
		{
			System.out.println(color);
		}
	}
}
