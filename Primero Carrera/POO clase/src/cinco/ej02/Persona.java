package cinco.ej02;

public class Persona {
	private String nombre;
	private int edad;
	private String documentoDNI;
	private String sexo;
	private double peso;
	private double altura;
	
	public Persona(String nombre,int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.documentoDNI = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
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
	private double setAltura() {
		return altura;
	}

	private double setPeso() {
		return peso;
	}
	
	public double calculasIMC() {
		return setPeso() / Math.pow(setAltura(), 2);
	}
	
	public double getIMC() {
		return calculasIMC();
	}
	
	private double setEdad() {
		return edad;
	}
	
	public String esMayorDeEdad() {
		if(setEdad() >= 18) {
			return "Si";
		} else {
			return "No";
		}
	}
	
	public String comprobarSexo() {
		return sexo;
	}
	
	public String toString() {
		return "Su nombre es " + nombre + ",tiene " + edad + " años y su DNI es " + documentoDNI +". Mide " + altura + " metros, pesa " + peso + " kilogramos y su sexo es " + sexo;
	}
}