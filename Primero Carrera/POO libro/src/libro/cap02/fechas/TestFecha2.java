package libro.cap02.fechas;
public class TestFecha2 
{
   public static void main(String[] args)
   {
	   Fecha f = new Fecha(2, 10, 1970);
	   f.setDia(2);
	   f.setMes(10);
	   f.setAnio(1970);
	   
	   System.out.println(f);
   }
}