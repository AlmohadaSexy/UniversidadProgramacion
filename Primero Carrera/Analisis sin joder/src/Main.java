 public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		NotificacionesPantalla p = new NotificacionesPantalla();
		Operaciones f = new Operaciones();
		double x = 0.1;
		
	    //Pedimos los valores de E, Dh y Re
	    p.input();
	    
	    //Calculamos el valor de X
	    x = f.valorx(x);
	    
	    double resulfin = f.thend(x);
		p.solucion(x, resulfin);
	}
}