package cinco.ej02;

public class TestPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona ("Juan", 18, "21773823V", "masculino", 69.34, 1.74);
		Persona p2 = new Persona ("María", 17, "70426541X", "femenino", 65.4, 1.63 );
		System.out.println(p1);
		System.out.println("Su IMC es " + p1.getIMC());
		System.out.println("¿Es mayor de edad? " + p1.esMayorDeEdad());
		System.out.println("¿Cuál es su sexo? " + p1.comprobarSexo());
		System.out.println("-------------");
		
		
		System.out.println(p2);
		System.out.println("Su IMC es " + p2.getIMC());
		System.out.println("¿Es mayor de edad? " + p2.esMayorDeEdad());
		System.out.println("¿Cuál es su sexo? " + p2.comprobarSexo());
		System.out.println("-------------");
		
	}
}