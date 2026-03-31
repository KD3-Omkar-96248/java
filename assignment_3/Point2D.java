package com.app.geometry;
import java.util.Scanner;
public class Point2D {
  private int x;
  private int y;
  public Point2D(int x ,int y){
	  this.x=x;
	  this.y=y;
  }
  public String getDetails(){
	return "Point [ x ="+x +" y "+y+"]";  
  }
  public boolean isEqual(Point2D P) {
	  return this.x==P.x && this.y==P.y;  
  }
  public double calculateDistance(Point2D p) {
      int dx = this.x - p.x;
      int dy = this.y - p.y;

      return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
  }
}
