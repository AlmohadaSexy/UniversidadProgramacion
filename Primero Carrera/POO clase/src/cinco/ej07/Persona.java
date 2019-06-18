package cinco.ej07;

public class Persona {
	
	private String nombre;
	private String documentoDNI;
	
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.documentoDNI = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return documentoDNI;
	}
	
	public boolean comprobarDNI(String dni) {
		if (this.documentoDNI.equals(dni)) {
			return true;
		}
		return false;
	}
	public void setDNI(String documentoDNI) {
		this.documentoDNI = documentoDNI;
	}
	
	public String toString() {
		return "Su nombre es " + nombre + " y su DNI es " + documentoDNI;
	}
}