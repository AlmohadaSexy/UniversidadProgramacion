package examen;
public class Component{
	private double price;
	private int quantity;
	private String reference;
	private String name;
	
	public Component(String name, String reference, double price, int quantity)	{
		this.name = name;
		this.reference = reference;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getReference() {
		return reference;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTotalPrice() {
		return price * quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public boolean changeQuantityBy(int changeBy) {
		if(this.quantity + changeBy  >= 0) {
			this.quantity = getQuantity() + changeBy;
			return true;
		}
		return false;
	}
}