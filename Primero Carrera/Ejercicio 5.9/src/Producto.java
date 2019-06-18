
public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean comprobarNombre(String nombre) {
		if(this.nombre.equals(nombre)) {
			return true;
		}
		
		return false;
	}
	
	public void anadirCantidad(int cantidad) {
		this.cantidad += cantidad;
	}
	
	public boolean restarCantidad(int cantidad) {
		if(cantidad > 0 && this.cantidad >= cantidad) {
			this.cantidad -= cantidad;
			return true;
		} else {
			System.out.println("No existen tantos ejemplares de este producto o debe intoducir un numero positivo y diferente a 0");
			return false;
		}
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public String toString() {
		return "Producto: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad;
	}
	

}
