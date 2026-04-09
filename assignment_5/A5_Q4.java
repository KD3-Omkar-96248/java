import java.util.Scanner;

enum TrafficLight 
{
    RED, GREEN, YELLOW;

    private int duration;

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }

    public int getDuration() 
    {
        return duration;
    }
}

public class TrafficLightTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        for (TrafficLight light : TrafficLight.values()) 
        {
            System.out.print("Enter duration for " + light.name() + ": ");
            int duration = scanner.nextInt();
            light.setDuration(duration);
        }

        System.out.println("\nTraffic Light Durations:");
        
        for (TrafficLight light : TrafficLight.values()) 
        {
            System.out.println(light.name() + ": " + light.getDuration() + " seconds");
        }

        scanner.close();
    }
}