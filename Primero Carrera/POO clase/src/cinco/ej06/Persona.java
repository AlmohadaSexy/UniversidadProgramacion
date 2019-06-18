package cinco.ej06;

public class Persona {
	private String nombre;
	private String documentoDNI;
	
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.documentoDNI = dni;
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return "Su nombre es " + nombre + " y su DNI es " + documentoDNI;
	}
}