package libro.cap02.fechas;
import java.util.Scanner;
public class TestFecha3 
{
   @SuppressWarnings("resource")
public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Ingrese Dia: ");
      int dia = sc.nextInt();
      System.out.print("Ingrese Mes: ");
      int mes = sc.nextInt();
      System.out.print("Ingrese Año: ");
      int anio = sc.nextInt();
      
      Fecha f1 = new Fecha(dia,mes,anio);
      
      System.out.print("Ingrese Dia: ");
      dia = sc.nextInt();
      System.out.print("Ingrese Mes: ");
      mes = sc.nextInt();
      System.out.print("Ingrese Año: ");
      anio = sc.nextInt();
      System.out.println();
      Fecha f2 = new Fecha(dia,mes,anio);
      if( f1.equals(f2) ) {
    	  System.out.println("Son iguales!!");
      } else {
    	  System.out.println("Son distintas...");
      }
   }
}