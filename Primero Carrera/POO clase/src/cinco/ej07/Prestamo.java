package cinco.ej07;

import java.util.Date;

public class Prestamo{
	
	@SuppressWarnings("unused")
	private Date fechaInicio;
	public Date fechaFin;
	private Libro libro;
	private Persona prestatario;
	
	public Prestamo(Libro libro, Persona prestatario, Date fechaInicio, Date fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public Prestamo() {
		// TODO Auto-generated constructor stub
	}

	public String getTituloLibro() {
		return libro.getTitulo();
	}
	
	public String getDNIPersona() {
		return prestatario.getDNI();
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public Libro getLibro() {
		return libro;
	}
}