import java.util.Scanner;
public class Assignmet1_3 {
public static void main(String [] args) {
	  
	  int totalbill = 0;
	  int menu;
	  int quty;
	 do{ 
	  System.out.println("1.Enter Dosa :");
	  System.out.println("2.Enter Samosa :");
	  System.out.println("3.Enter Idali :");
	  System.out.println("4.total bill");
	  Scanner sc = new Scanner(System.in);
      menu= sc.nextInt();
	  
		  switch(menu) {
		  case 1:
		        System.out.println("enter 1st choice :");
		        sc = new Scanner(System.in);
		         menu = sc.nextInt();
		         int k=sc.nextInt();
		         totalbill = totalbill+k* menu;
		         
		         
		         break;
		         
		  case 2:
			  System.out.println("enter 2nd choice :");
			  sc = new Scanner(System.in);
			  menu = sc.nextInt();
			  totalbill = totalbill+25*menu;
			  break;
			
		  case 3:
			  System.out.println("Enter 4nd choice :");
			  sc = new Scanner(System.in);
			  menu = sc.nextInt();
			  totalbill = totalbill+30*menu;
			  break;
		  case 4:
			  System.out.println("total bill :" +totalbill);
			  break;
			  
		  }
		  
	  
}while(menu!=5 );
}
}