
public class Juego extends Producto{
	
	private String plataforma, genero;
	
	public Juego(String nombre, double precio, int cantidad, String plataforma, String genero) {
		super(nombre, precio, cantidad);
		this.plataforma = plataforma;
		this.genero = genero;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public String getGenero() {
		return genero;
	}
	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return super.toString() + ", Plataforma: " + plataforma + ", Genero: " + genero;
	}

}
