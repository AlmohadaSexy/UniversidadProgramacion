package cinco.ej09;
public class Producto{
	protected String nombre;
	private double precio;
	private int cantidad;
	
	Producto(String nombre, double precio, int cantidad){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
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
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public boolean comprobarPedido(String nombre) {
		if(this.nombre.equals(nombre)) {
			return true;
		}
		return false;
	}
	
	public boolean sumarCantidad(int cantidad) {
		if(this.cantidad + cantidad  >= 0) {
			this.cantidad = getCantidad() + cantidad;
			return true;
		}
		return false;
	}
	
	public boolean restarCantidad(int cantidad) {
		if(this.cantidad - cantidad  >= 0) {
			this.cantidad = getCantidad() - cantidad;
			return true;
		}
		System.out.println("Introduzca un numero menor.");
		return false;
	}
}