/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracksuma10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author profesoresi
 */
public class BacktrackSuma10 {

	static int solucion;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lista de numeros dados por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        int numLeido;
        do {
            System.out.print("Dame un numero positivo, 0 para salir: ");
            numLeido = sc.nextInt();
            if (numLeido != 0) {
                numeros.add(numLeido);
            }
        } while (numLeido != 0);

        System.out.println("Introduzca la solucion: ");
        solucion = sc.nextInt();
        // creo el estado.
        Estado inicial = new Estado(numeros);
        ArrayList<Estado> soluciones = backtracking(inicial);
        System.out.println("soluciones -> " + soluciones);
        sc.close();
    }

    public static ArrayList<Estado> backtracking(Estado inicial) {
        ArrayList<Estado> soluciones = new ArrayList<>();
        ArrayList<Estado> actuales = new ArrayList<>();
        actuales.add(inicial);

        boolean terminado = false;
        while (!terminado) {
            // ver cuales estados no tienen solucion
            for (int i = 0; i < actuales.size(); i++) {
                if (esImposible(actuales.get(i))) {
                    actuales.remove(i);
                }
            }

            // ver cuales de los estados actuales son solución
            for (Estado estado : actuales) {
                if (esSolucion(estado)) {
                    soluciones.add(new Estado(estado));
                }
            }

            // explorar nuevas soluciones.
            for (int i = 0; i < actuales.size(); i++) {
                Estado estado = actuales.get(i);
                if (esExtensible(estado)) {
                    ArrayList<Estado> nuevosEstados = extender(estado);
                    // añado los nuevos estados
                    for (int j = 0; j < nuevosEstados.size(); j++) {
                        Estado nuevo = nuevosEstados.get(j);
                        actuales.add(nuevo);
                    }
                }
                actuales.remove(i);
            }

            terminado = actuales.isEmpty();

        }
        return soluciones;
    }

    public static boolean esSolucion(Estado estado) {
        int suma = 0;

        // comprobar si la suma es 0. -> sería solución
        for (int numero : estado.actual) {
            suma += numero;
        }
        return suma == 10;
//		return suma == solucion;
    }

    public static boolean esExtensible(Estado estado) {
        return !estado.candidatos.isEmpty();
    }

    public static boolean esImposible(Estado estado) {
        int suma = 0;

        // comprobar si la suma > 10. No quiero buscar soluciones
        // a partir de aquí
        for (int numero : estado.actual) {
            suma += numero;
        }
        return suma > 10;
//		return suma > solucion;
    }

    public static ArrayList<Estado>
            extender(Estado actual) {

        ArrayList<Estado> extension = new ArrayList<>();

        // crear todas las posibles extensiones (añadir cada número) 
        // de los no usados
        for (int i = 0; i < actual.candidatos.size(); i++) {
            // hago copia de el estado actual
            Estado nuevo = new Estado(actual);
            // le meto el número de la posición i
            nuevo.actual.add(actual.candidatos.get(i));
            // le quito el número añadido de candidatos
            nuevo.candidatos.remove(i);

            // lo sumo a la lista de extensiones.
            extension.add(nuevo);
        }
        return extension;
    }

}
