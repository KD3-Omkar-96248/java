package tester;
import com.app.geometry.*;
public class Testpoint {
public static void main(String[] args ) {
	Point2D p1= new Point2D(6,6);
	Point2D p2=new Point2D(6,6);
	p1.getDetails();
	p2.getDetails();
	if(p1.isEqual(p2)) {
		System.out.println("It is located at same position ");
	}
	else {
		System.out.println("Distance Between :" +p1.calculateDistance(p2));
	}
}
}
