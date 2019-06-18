package libro.cap02.fechas;

import java.util.Scanner;

public class TestFecha4 
{
   @SuppressWarnings("resource")
public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Ingrese fecha (dd/mm/aaaa): ");
      
      String sFecha = sc.next();
      
      Fecha f = new Fecha(sFecha);
      
      System.out.println("La fecha ingresada es: " + f);
      
      System.out.print("Ingrese dias a sumar (puede ser negativo): ");
      int diasSum = sc.nextInt();
      
      f.addDias(diasSum);
      System.out.println("Sumando " + diasSum + " dias, queda: " + f);
      
   } 
}

