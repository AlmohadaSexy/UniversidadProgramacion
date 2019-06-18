package ejercicio2;

public class MainEj2 {
	static int cont;
	public static void main(String[] args) {
		cont = 0;
		System.out.println(pasos(1));
	}
	 
	public static int pasos(int n) {
		if(cont == 4) {
			return 0;
		} 
		System.out.println(n);
		cont++;
		return n + pasos(n + 1);
	}
}
