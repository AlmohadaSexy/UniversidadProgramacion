public class Operaciones {
	public static double valorx(double x) {
		NotificacionesPantalla p = new NotificacionesPantalla();
		double Re = p.returnRe();
		double E = p.returnE();
		double Dh = p.returnDh();
		double numIt = p.returnnumIt();
		int i = 0;
		for (i = 1; i <= numIt; i++) {
			x = operacion(x, E, Dh, Re);
			System.out.println(x);
		}
		return x;
	}
	public static double operacion(double x, double E, double Dh, double Re) {
		return  (x - ( (x+2*Math.log10( (E/(3.71*Dh)) + (2.51*x/Re) ) ) / (1+2 / ( (E/(3.71*Dh)) +(2.51*x/Re) ) * Math.log10(Math.E) * 2.51 * x/Re ) ));
	}
	public static double thend(double pexis) {
		return 1 / (pexis * pexis);
	}
}