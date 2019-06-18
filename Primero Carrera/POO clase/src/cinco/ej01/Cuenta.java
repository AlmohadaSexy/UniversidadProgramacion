package cinco.ej01;

public class Cuenta {
	private double saldo = 0;
	
	public double obtenerSaldo() {
		return saldo;
	}
	public void añadirSaldo(double newSaldo) {
		saldo = newSaldo + saldo;
	}
}