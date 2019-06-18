package examen;

import java.util.ArrayList;

public class Computer{
	private String ownerName;
	
	ArrayList<String> discountBrandRef = new ArrayList<>();
	
	ArrayList<Component> componentes = new ArrayList<>();
	ArrayList<Software> programas = new ArrayList<>();
	
	
	
	public Computer(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public boolean addComponent(Component component) {
		
		for (int i = 0; i < componentes.size(); i++) {
			if(component.getReference() == componentes.get(i).getReference()){
				
				return false;
			}
			
			
		}
		componentes.add(component);
		return true;
		
	}
	
	public boolean addProgram(Software program) {
		for (int i = 0; i < programas.size(); i++) {
			if(programas.get(i).checkBrandRef(program.getReference())) {
				return true;
			}
			
		}
		programas.add(program);
		return false;
	}
	
	public boolean changeQuantityComponent(String reference, int changeBy) {
		for(int i = 0; i < componentes.size(); i++) {
			if(componentes.get(i).getReference().equals(reference)) {
				componentes.get(i).changeQuantityBy(changeBy);
				return true;
			}		
		}
		return false;
	}
	
	public boolean changeQuantitySoftware(String reference, int changeBy) {
		for(int i = 0; i < programas.size(); i++) {
			if(programas.get(i).getReference().equals(reference)) {
				programas.get(i).changeQuantityBy(changeBy);
				return true;
			}		
		}
		return false;
	}
	
	public double totalPrice() {
		double precio = 0;
		for(int i = 0; i < componentes.size(); i++) {
			precio = precio + componentes.get(i).getTotalPrice();
		}
		for(int j = 0; j < programas.size(); j++) {
			precio = precio + programas.get(j).getTotalPrice();
		}
		
		return precio;
	}
	
	
	public boolean addDiscountBrand(String reference) {
		
		for(int i = 0; i < programas.size(); i++) {
			if(programas.get(i).checkBrandRef(reference)) {
				
				//Esto está mal no se hacerlo pero es mi intento :D
				//programas.get(i).getTotalPrice() = ( programas.get(i).getTotalPrice() * 0.85 );
			}
		}
		
		return true;
	}
}