package com.student;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        Set<Project> set = new HashSet<>();
        List<Project> list = new ArrayList<>();

        int choice;

        do
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Dummy Data");
            System.out.println("2. Add Project");
            System.out.println("3. Display Projects (Set)");
            System.out.println("4. Delete Project by ID");
            System.out.println("5. Copy Set to List");
            System.out.println("6. Display Projects (List)");
            System.out.println("7. Sort Projects by Cost");
            System.out.println("8. Project with Max Team Size");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) 
            {

            case 1:
                set.add(new Project(1, "Train Reservation System", 5, 5000000, "Java"));
                set.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
                set.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
                set.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
                set.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
                set.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));

                System.out.println("Dummy Data Added!");
                break;

            case 2:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Team Size: ");
                int teamSize = sc.nextInt();

                System.out.print("Enter Cost: ");
                double cost = sc.nextDouble();

                sc.nextLine();

                System.out.print("Enter Technology: ");
                String tech = sc.nextLine();

                boolean added = set.add(new Project(id, title, teamSize, cost, tech));

                if (added)
                    System.out.println("Project Added!");
                else
                    System.out.println("Duplicate ID! Project Not Added.");
                break;

            case 3:
                displaySet(set);
                break;

            case 4:
                System.out.print("Enter ID to delete: ");
                int deleteId = sc.nextInt();

                boolean removed = set.remove(new Project(deleteId, "", 0, 0, ""));

                if (removed)
                    System.out.println("Project Deleted!");
                else
                    System.out.println("Project Not Found!");
                break;

            case 5:
                list.clear();
                list.addAll(set);
                System.out.println("Copied Set to List!");
                break;

            case 6:
                displayList(list);
                break;

            case 7:
                list.sort(Comparator.comparingDouble(Project::getProjectCost));
                System.out.println("Sorted by Cost!");
                displayList(list);
                break;

            case 8:
                if (set.isEmpty()) 
                {
                    System.out.println("Set is empty!");
                }
                else 
                {
                    Project maxProject = Collections.max(set,Comparator.comparingInt(Project::getTeamSize));
                    System.out.println("Project with Max Team Size:");
                    System.out.println(maxProject);
                }
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } 
        while (choice != 0);

        sc.close();
    }

    public static void displaySet(Set<Project> set) 
    {
        if (set.isEmpty()) 
        {
            System.out.println("Set is empty!");
            return;
        }

        System.out.println("\n--- Projects in Set ---");
        for (Project p : set) 
        {
            System.out.println(p);
        }
    }

    public static void displayList(List<Project> list) 
    {
        if (list.isEmpty()) 
        {
            System.out.println("List is empty!");
            return;
        }

        System.out.println("\n--- Projects in List ---");
        for (Project p : list) 
        {
            System.out.println(p);
        }
	}
}
