package examen;

public abstract class Avion {
	private String avionId;
	private int numPasajeros;
	
	public Avion(String avionId, int numPasajeros) {
		this.avionId = avionId;
		this.numPasajeros = numPasajeros;
	}
	
	public String getAvionId() {
		return avionId;
	}
	
	public int getNumPasajeros() {
		return numPasajeros;
	}
	
	public abstract boolean tieneMotor();
	public abstract double calcularAutonomia();
	
	public String toString() {
		return getAvionId() + " (" + getNumPasajeros() + ")";
	}
}