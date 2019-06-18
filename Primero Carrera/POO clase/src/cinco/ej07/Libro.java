package cinco.ej07;
public class Libro{
		
	private int numEjemplares;
	private String titulo;
	private String referencia;
	
	public Libro(int numEjemplares, String titulo, String referencia) {
		this.numEjemplares = numEjemplares;
		this.titulo = titulo;
		this.referencia = referencia;
	}
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean comprobarReferencia(String referencia) {
		if(this.referencia.equals(referencia)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean anadirEjemplares(int cantidad) {
		if(cantidad>0) {
			this.numEjemplares += cantidad;
			return true;
		} else {
			System.out.println("PONME UN NUMERO POSITIVO, BRONTOSAURIO.");
			return false;
		}
	}
	
	public boolean eliminarEjemplares(int cantidad) {
		if(cantidad>0 && numEjemplares >= cantidad) {
			this.numEjemplares -= cantidad;
			return true;
		} else {
			System.out.println("PONME UN NUMERO POSITIVO, BRONTOSAURIO. O eso o ponme un numero de libros a eliminar menor que la cantidad de libros disponible :D.");
			return false;
		}
	}
}