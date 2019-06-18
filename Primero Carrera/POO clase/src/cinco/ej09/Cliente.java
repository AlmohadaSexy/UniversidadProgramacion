package cinco.ej09;
public class Cliente{
	
	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public boolean comprobarNombre(String nombre) {
		if(this.nombre.equals(nombre)) {
			return true;
		}
		return false;
	}
}