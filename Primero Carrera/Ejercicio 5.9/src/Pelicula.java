
public class Pelicula extends Producto{
	
	private String idioma, genero;
	private double duracion;
	
	public Pelicula (String nombre, double precio, int cantidad, String idioma, String genero, double duracion) {
		super(nombre, precio, cantidad);
		this.idioma = idioma;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	
	public String toString() {
		return super.toString() + ", Idioma: " + idioma + ", Genero: " + genero + ", Duracion: " + duracion;
	}

}
