package cinco.ej04;

public class Circle {
	private double radius = 1;
	@SuppressWarnings("unused")
	private String color = "red";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
}