
public class Cliente {
	
	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean comprobarNombre(String nombre) {
		if(this.nombre.equals(nombre)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Cliente: " + nombre;
	}

}
