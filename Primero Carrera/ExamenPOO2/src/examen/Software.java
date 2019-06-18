package examen;

import java.util.ArrayList;

public class Software{
	private double price;
	private int quantity;
	private String reference;
	private String name;
	
	
	
	public Software(String name, String reference, double price, Brand brand, int quantity) {
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
	
	public boolean checkBrandRef(String reference) {
		if(this.reference.equals(reference)) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getTotalPrice() {
		return price * quantity;
	}
	
	
	public boolean changeQuantityBy(int changeBy) {
		if(this.quantity + changeBy  >= 0) {
			this.quantity = Software.this.quantity + changeBy;
			return true;
		}
		return false;
	}
}