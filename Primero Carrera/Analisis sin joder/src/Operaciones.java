public class Operaciones {
	public static double valorx(double x) {
		NotificacionesPantalla p = new NotificacionesPantalla();
		double Re = p.returnRe();
		double E = p.returnE();
		double Dh = p.returnDh();
		int i = 0;
		for(x = 0.1; i < 10000; i++) {
	        double n = - x / 2;
	        double izquierda = izquierda1(n);
	        double derecha = derecha1(x, Re, E, Dh);
	        double precision = 0.001;
	        int incrementosPrecision = 500;
	        for (int j = 0; j < incrementosPrecision; j++) {
	             if (derecha - izquierda >= precision || izquierda - derecha >= precision) {
	            	 x = x + (precision*10);
	             }
	             precision /= 100;
	             //System.out.println(izquierda + "\t" + derecha + "\t\t" + x);
	        }
	    }
		return x;
	}
	public static double derecha1(double variable, double abajo1, double arriba, double abajo2) {
		return variable * (2.51 / abajo1) + arriba / (3.71 * abajo2);
//(x - ( (x+2*Math.log10( (E/3.71*Dh)+(2.51*x/Re) ) ) / (1+2 / ( (E/3.71*Dh) +(2.51*x/Re) ) * Math.log10(E) * 2.51 * x/Re ) ));		
	}
	public static double izquierda1(double variable) {
		return Math.pow(10, variable);
	}
	public static double thend(double pexis) {
		return 1 / (pexis * pexis);
	}
}