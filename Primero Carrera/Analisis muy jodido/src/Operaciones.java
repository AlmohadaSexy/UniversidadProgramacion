public class Operaciones {
	public static double valorf(double f) {
		NotificacionesPantalla p = new NotificacionesPantalla();
		double Re = p.returnRe();
		double E = p.returnE();
		double Dh = p.returnDh();
		int i = 0;
		for(f = 0; i < 300000000; i++) {
	        double izquierda = izquierda1(f);
	        double derecha = derecha1(f, Re, E, Dh);
	        double precision = 0.000000001;
	        int incrementosPrecision = 500;
	        for (int j = 0; j < incrementosPrecision; j++) {
	             if (derecha - izquierda >= precision || izquierda - derecha >= precision) {
	            	 f = f + (precision*10);
	             }
	             precision /= 100;
	        }
	        System.out.println(izquierda + "\t" + derecha + "\t\t" + f);
	    }
		return f;
	}
	public static double derecha1(double variable, double abajo1, double arriba, double abajo2) {
		return (Math.log10((2.51 / (abajo1 * Math.sqrt(variable)) + (arriba / (3.71 * abajo2)))));
	}
	public static double izquierda1(double variable) {
		return 1 / ((-2) * Math.sqrt(variable));
	}
}