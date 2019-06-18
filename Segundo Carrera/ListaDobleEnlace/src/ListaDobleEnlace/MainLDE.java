package ListaDobleEnlace;

public class MainLDE {

	public static void main(String[] args) {
		ListaDobleEnlace lista = new ListaDobleEnlace();

		lista.agregarNodoAlPrincipio(5);
		lista.agregarNodoAlPrincipio(10);
		lista.agregarNodoAlPrincipio(15);
		lista.agregarNodoAlPrincipio(20);
		lista.agregarNodoAlPrincipio(25);
		lista.agregarNodoAlPrincipio(30);
		lista.agregarNodoAlPrincipio(35);
		System.out.println(lista);
		lista.coincidenNodos((int) (Math.random() * 10) + 1);
	}
}
