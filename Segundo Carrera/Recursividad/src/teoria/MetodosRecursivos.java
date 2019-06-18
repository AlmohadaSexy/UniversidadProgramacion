package teoria;

import java.util.concurrent.TimeUnit;

public class MetodosRecursivos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MetodosRecursivos factorial = new MetodosRecursivos();
//		System.out.println(factorial.factorialDeUnNumero(5));
//		System.out.println(factorial.pasos(5));
		factorial.llenarPiscina(5, 1, 0);
	}

	public int factorialDeUnNumero(int n) {
		// valido
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else {
			// Otros casos
			return n * factorialDeUnNumero(n - 1);
		}
	}

	public int pasos(int n) throws InterruptedException {
		if (n <= 0) {
			return 0;
		}
		System.out.println(n);
		TimeUnit.SECONDS.sleep(1);
		return pasos(n - 1);
	}

	int cont = 0;

	public void llenarPiscina(int volumen, int abertura, int lleva) throws InterruptedException {
		if (lleva >= volumen) {
			System.out.println("Llena");
			System.out.println("Ha tardado en llenar la piscina de " + volumen + " litros " + cont + " minutos ");
		} else {
			lleva += abertura;
			System.out.println("Volumen: " + volumen + ", lleva: " + lleva);
			TimeUnit.SECONDS.sleep(1);
			cont++;
			llenarPiscina(volumen, abertura, lleva);
		}
	}
}
