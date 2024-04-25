package com.app.geometry;

public class Point2D {
	private static final Point2D Point2D = null;
	public int x;
	public int y;
	public double distance;
	
	public Point2D() {
	}
	
	
	public Point2D(int x, int y){
		this.x = x ;
		this.y = y ;
	}
	
	public String getDetails() {
		return " X:" + this.x + " Y:" + this.y;
	}
	
	public boolean isEqual (Point2D point) {
		return this.x == point.x && this.y==point.y;
	}
	
	public Point2D createNewPoint(int xoff, int yoff) {
		return new Point2D (this.x + xoff , this.y + yoff);
	}
	
	public double calculateDistance(Point2D point) {
		if(isEqual(point)==false) {
			distance =Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y, 2));
			System.out.println("Distance = "+ distance);
			return distance;
		}else {
			System.out.println("Points are equal therefore distance is zero");
			return 0.0;
			
		}
	}
}


