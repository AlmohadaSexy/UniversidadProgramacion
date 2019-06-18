package cinco.ej07;

import java.util.Date;

public class main {
	public static void main(String[] args) {
		Date fechaActual = new Date();
		Biblioteca b1 = new Biblioteca("Hola", "Mundo");
		
		b1.anadirLibros(12, "12 Holas", "1234567890");
		b1.anadirUsuario("Javier", "21738213Z");
		
		b1.hacerReserva("1234567890", "221738213Z");
		b1.eliminarReservasAntiguas(fechaActual);
		
	
	}
}