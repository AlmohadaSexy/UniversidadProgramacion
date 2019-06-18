package cinco.ej06;
public class Pista {
	CD cd = new CD();
	Persona p = new Persona();
	
	private String titulo;
	private int duracionSeg;
	Persona artista;
	
	public Pista(String titulo, int duracionSeg, Persona artista) {
		this.titulo = titulo;
		this.duracionSeg = duracionSeg;
		this.artista = artista;
	}
	
	public Pista() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getDuracion() {
		return duracionSeg;
	}
	public String getNombreArtista() {
		return p.getNombre();
	}
	
	
}