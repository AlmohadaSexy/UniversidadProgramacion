package examen;
public class main {
	public static void main(String[] args) {
		TorreControl t1 = new TorreControl("Barajas", "ParkingBarajas");
		
		Avion avionVelero1 = new AvionVelero("IE344", 48, 110);
		Avion avionVelero2 = new AvionVelero("AU324", 141, 65);
		Avion avionMotor1 = new AvionMotor("HE379", 234, 54, 4);
		Avion avionMotor2 = new AvionMotor("FG211", 324, 56, 2);
		
		t1.anadirAvion(avionVelero1);
		t1.anadirAvion(avionVelero2);
		t1.anadirAvion(avionMotor1);
		t1.anadirAvion(avionMotor2);
		
		System.out.println(t1.aparcarSigAvion());
		System.out.println(t1.aparcarSigAvion());
		System.out.println(t1.aparcarSigAvion());
		System.out.println(t1.aparcarSigAvion());
		System.out.println(t1.aparcarSigAvion());
		
		System.out.println(t1.listarAvionesParking());
		
	}
}