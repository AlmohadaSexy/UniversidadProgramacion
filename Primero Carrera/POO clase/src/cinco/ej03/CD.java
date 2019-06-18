package cinco.ej03;

import java.util.ArrayList;

public class CD {
	ArrayList<String> nombreCanciones = new ArrayList<>();
	
	public double numeroCanciones(){
		return nombreCanciones.size();
	}
	
	public String dameCancion(int posicion) {
		return nombreCanciones.get(posicion);
	}
	
	public void grabaCancion(int posicion, String cancion) {
		nombreCanciones.add(posicion, cancion);
	}
	
	public void agregaCancion(String cancion) {
		nombreCanciones.add(cancion);
	}
	
	public void elimina(int posicion) {
		nombreCanciones.remove(posicion);
	}
}