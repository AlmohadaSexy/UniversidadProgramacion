package cinco.ej07;

import java.util.ArrayList;
import java.util.Date;

public class Biblioteca{
	ArrayList<Prestamo> prestamos = new ArrayList<>();
	ArrayList<Persona> prestatarios = new ArrayList<>();
	ArrayList<Libro> libros = new ArrayList<>();
	
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String direccion;
	
	
	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	//añadirLibros devuelve true si no es necesario crear un libro nuevo
	public boolean anadirLibros(int numEjemplares, String titulo, String referencia) {
		for(int i = 0; i < libros.size(); i++) {
			if(libros.get(i).comprobarReferencia(referencia)) {
				return true;
			}
		}
		libros.add(new Libro(numEjemplares, titulo, referencia));
		return false;
	}
	
	//añadirUsuario devuelve false si existe un usuario con el mismo DNI
	public boolean anadirUsuario(String nombre, String dni) {
		for(int i = 0; i < prestatarios.size(); i++) {
			if(prestatarios.get(i).comprobarDNI(dni)) {
				return false;
			}
			
		}
		prestatarios.add(new Persona(nombre, dni));
		return true;
	}
	
	@SuppressWarnings("deprecation")
	public boolean hacerReserva(String referenciaLibro, String dni) {
		Date date = new Date();
		Date dateDelta = new Date(70,0,15);
		Date dateFin = new Date(date.getTime()+dateDelta.getTime());
		
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).comprobarReferencia(referenciaLibro) == true && libros.get(i).eliminarEjemplares(1) == true) {
				for(int j = 0; j < prestatarios.size(); j++) {
					if(prestatarios.get(j).comprobarDNI(dni) == true) {
						prestamos.add(new Prestamo(libros.get(i), prestatarios.get(j), date, dateFin));
						System.out.println("RESERVA PUTO HECHA, FIERA");
						return true;
					}
				}
			}
		}
		System.out.println("NO SE HA HECHO LA RESERVA, MÁQUINA.");
		return false;
	}
	
	public void eliminarReservasAntiguas(Date fechaActual) {
		for(int i = 0; i < prestamos.size();i++) {
			if(fechaActual.after(prestamos.get(i).getFechaFin())) {
				prestamos.get(i).getLibro().anadirEjemplares(1);
				prestamos.remove(i);
			}
		}
	}
}