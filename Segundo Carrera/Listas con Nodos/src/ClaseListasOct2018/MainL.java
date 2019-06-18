package ClaseListasOct2018;

public class MainL {

	public static void main(String[] args) {
		Lista primeraLista = new Lista();
		primeraLista.agregarNodoALaLista(10);
		primeraLista.agregarNodoALaLista(15);
		primeraLista.agregarNodoALaLista(20);
		primeraLista.toString();
		primeraLista.borrarUltimo();
		primeraLista.toString();
//		primeraLista.mostrarPrimerNodo();
//		System.out.println(primeraLista.cuantosNodos());
//		System.out.println(primeraLista.mostrarNodoEnIndice(2));
//		System.out.println(primeraLista);
//		System.out.println();
//		System.out.println();
//		//10 elementos random
//		for(int i = 0; i < 10; i++) {
//			int rndm = (int)(Math.random()*20+1);
//			primeraLista.agregarNodoALaLista(rndm);
//		}
//		primeraLista.toString();
//		System.out.println();
//		System.out.println();
	}
}