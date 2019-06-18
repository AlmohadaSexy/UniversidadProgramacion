package ejercicio1;

public class MainEj1 {

	public static void main(String[] args) {
		Lista lista = new Lista(); 
		lista.add((int) (Math.random() * 10) + 9);
		lista.add((int) (Math.random() * 10) + 9);
		lista.add((int) (Math.random() * 10) + 9);
		lista.add((int) (Math.random() * 10) + 9);
		lista.add((int) (Math.random() * 10) + 9);
		System.out.println(lista.toString());
		lista.cuantosPares();
	}

}
