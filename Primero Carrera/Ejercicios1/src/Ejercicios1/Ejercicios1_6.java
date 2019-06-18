package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_6{
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dinero que quiera dividir en billetes y monedas de 1 y 2 euros.");
        //mensaje para el usuario
        System.out.print("Ingrese un valor cualquiera de X: ");
        int resto = scanner.nextInt();
        
        //Variables
//        int resto = 1;
        int solucion = 1;
        while( resto != 0 ){
            if (resto >= 500){
                solucion = resto / 500;
                resto = resto % 500;
                System.out.println(solucion + " billetes de 500€");
            } else{
                if (resto >= 200){
                    solucion = resto / 200;
                    resto = resto % 200;
                    System.out.println(solucion + " billetes de 200€");
                } else{
                    if (resto >= 100){
                        solucion = resto / 100;
                        resto = resto % 100;
                        System.out.println(solucion + " billetes de 100€");
                    } else{
                        if (resto >= 50){
                            solucion = resto / 50;
                            resto = resto % 50;
                            System.out.println(solucion + " billetes de 50€");
                        } else{
                            if (resto >= 20){
                                solucion = resto / 20;
                                resto = resto % 20;
                                System.out.println(solucion + " billetes de 20€");
                            } else{
                                if (resto >= 10){
                                    solucion = resto / 10;
                                    resto = resto % 10;
                                    System.out.println(solucion + " billetes de 10€");
                                } else{
                                    if (resto >= 5){
                                        solucion = resto / 5;
                                        resto = resto % 5;
                                        System.out.println(solucion + " billetes de 5€");
                                    } else{
                                        if (resto >= 2){
                                            solucion = resto / 2;
                                            resto = resto % 2;
                                            System.out.println(solucion + " monedas de 2€");
                                        } else{
                                            if (resto >= 1){
                                                solucion = resto / 1;
                                                resto = resto % 1;
                                                System.out.println(solucion + " monedas de 1€");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
            
            
        
    

