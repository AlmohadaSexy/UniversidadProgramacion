package examen;

import java.util.ArrayList;

public class Parking {
	private String nombreParking;
	
	ArrayList<Avion> avionesEnParking = new ArrayList<>();
	
	public Parking(String nombreParking) {
		this.nombreParking = nombreParking;
	}
	
	public void aparcarAvion(Avion avion) {
		avionesEnParking.add(avion);
	}
	
	public String listarAviones() {
		return avionesEnParking.toString();
	}
}