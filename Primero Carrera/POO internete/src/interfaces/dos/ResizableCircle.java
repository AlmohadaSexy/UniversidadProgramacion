package interfaces.dos;

public class ResizableCircle extends Circle implements Resizable{
	
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	public double resize(int percent) {
		return this.radius * percent;
	}
}
