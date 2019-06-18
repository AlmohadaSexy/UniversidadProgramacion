package cinco.ej09;
public class CD extends Producto{
	private String genero;
	private int duracion;
	
	public CD (String nombre, double precio, int cantidad, int duracion, String genero){
		super(nombre, precio, cantidad);
		this.duracion = duracion;
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString() {
		return " (Genero: " + this.genero + ", duracion: " + this.duracion + " minutos)";
	}
}