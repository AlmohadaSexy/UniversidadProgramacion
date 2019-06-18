package cinco.ej09;
public class Pelicula extends Producto{
	private String idioma, genero;
	private int duracion;
	
	public Pelicula(String nombre, double precio, int cantidad, String idioma, int duracion, String genero) {
		super(nombre, precio, cantidad);
		this.idioma = idioma;
		this.duracion = duracion;
		this.genero = genero;
	}
	
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean comprobarNombre(String nombre) {
		if(this.getNombre().equals(nombre)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return " (Genero: " + this.genero + ", duracion: " + this.duracion + " minutos, idioma: " + this.idioma + ")";
	}
}