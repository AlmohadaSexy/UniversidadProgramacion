package cinco.ej06;

import java.util.ArrayList;

public class CD {
	Pista pista = new Pista();
	ArrayList<Pista> canciones = new ArrayList<>();
	
	public double numeroCanciones(){
		return canciones.size();
	}
	
	public void añadirPista(Pista pista) {
		canciones.add(pista);
	}
	
	public boolean reemplazarPista(Pista pista, int posicion) {
		if(canciones.get(posicion) == null) {
			return false;
		}else {
			canciones.set(posicion, pista);
			return true;
		}
		
	}
	
	public ArrayList<String> consultarNombreArtistas(){
		ArrayList<String> artistas = new ArrayList<>();
		for ( int i = 0; i < artistas.size(); i++) {
			artistas.add(canciones.get(i).getNombreArtista());
		}
		return artistas;
	}
	
	public int duracionTotal() {
		int duracion = 0;
		for (int i = 0; i < canciones.size(); i++) {
			duracion =+ canciones.get(i).getDuracion();
		}
		return duracion;
	}
	public Pista getPista(int posicion) {
		if(canciones.get(posicion) == null) {
			return null;
		}
		return canciones.get(posicion);
	}
}