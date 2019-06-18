package examen;

import java.util.ArrayList;

public class TorreControl {
	private String nombreAeropuerto;
	ArrayList<Avion> avionesEnVuelo = new ArrayList<>();
	Parking parking;
	
	public TorreControl(String nombreAeropuerto, String nombreParking) {
		this.nombreAeropuerto = nombreAeropuerto;
		parking = new Parking(nombreParking);
	}
	
	public void anadirAvion (Avion avion) {
		avionesEnVuelo.add(avion);
	}
	
	private int getSigAvionPos() {
		int posicion = 0;
		
		if(avionesEnVuelo.isEmpty()) {
			return -1;
		}
		
		double menorAutonomia = avionesEnVuelo.get(0).calcularAutonomia();
		
		for(Avion aviones : avionesEnVuelo) {
			if(aviones.calcularAutonomia() < menorAutonomia) {
				menorAutonomia = aviones.calcularAutonomia();
				posicion = avionesEnVuelo.indexOf(aviones);
			}
		}
		return posicion;
		
	}
	
	public boolean aparcarSigAvion() {
		int posicion = getSigAvionPos();
		
		if(getSigAvionPos() == -1) {
			System.out.println("No quedan aviones volando.");
			return false;
		}else {
			System.out.println("Aparcado el avion " + avionesEnVuelo.get(posicion).getAvionId() + ".");
			parking.aparcarAvion(avionesEnVuelo.get(posicion));
			avionesEnVuelo.remove(posicion);
			return true;
		}
		
	}
	
	public String listarAvionesParking() {
		return "Los aviones que hay aparcados son: " + parking.listarAviones();
	}
}