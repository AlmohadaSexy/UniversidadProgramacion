public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		NotificacionesPantalla p = new NotificacionesPantalla();
		Operaciones o = new Operaciones();
		
	    double f = 0;
	    //Pedimos los valores de E, Dh y Re
	    p.input();
	    //Calculamos el valor de X
	    f = o.valorf(f);
	    
		p.solucion(f);
		}
	public static double thend(double pexis) {
		return 1 / (pexis * pexis);
	}
}
