
public class CD extends Producto{
	
	private double duracion;
	private String genero;
	
	public CD(String nombre, double precio, int cantidad, double duracion, String genero) {
		super(nombre, precio, cantidad);
		this.duracion = duracion;
		this.genero = genero;
	}
	
	public double getDuration() {
		return duracion;
	}
	
	public void setDuration(double duracion) {
		this.duracion = duracion;
	}
	
	public String getGenre() {
		return genero;
	}
	
	public void setGenre(String genero) {
		this.genero = genero;
	}
	
	
	public String toString() {
		return super.toString() + ", Duracion: " + duracion + ", Genero: " + genero;
	}

}
