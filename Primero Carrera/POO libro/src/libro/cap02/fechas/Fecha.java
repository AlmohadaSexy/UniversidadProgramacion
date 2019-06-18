package libro.cap02.fechas;
public class Fecha {
	
   private int dia;
   private int mes;
   private int anio; 
   
   private int fechaToDias() {
	   return anio * 360 + mes * 30 + dia;
   }
   
   private void diasToFecha(int i) {
	   anio = (int) i / 360;
	   
	   int resto = i % 360;
	   
	   mes = (int) resto / 30;
	   
	   resto = i % 30;
	   
	   dia = resto % 30;
	   
	   if (dia==0) {
		   dia = 30;
		   mes--;
	   }
	   if (mes==0) {
		   mes = 12;
		   anio--;
	   }
   }
   
   public void addDias (int d) {
	   //convierto la fecha a dias y le sumo d
	   int sum = fechaToDias() + d;
	   
	   //La fecha resultante sum la separo en dias mes y anio
	   diasToFecha(sum);
   }
   
   public Fecha(String s) {
	   //busco la primera ocurrencia de '/'
	   int pos1 = s.indexOf('/');
	   //busco la �ltima ocurrencia de '/'
	   int pos2 = s.lastIndexOf('/');
	   
	   //proceso el dia
	   String sDia = s.substring(0,pos1);
	   dia = Integer.parseInt(sDia);
	   
	   //proceso el mes
	   String sMes = s.substring(pos1+1,pos2);
	   mes = Integer.parseInt(sMes);
	
	   //proceso el anio
	   String sAnio = s.substring(pos2+1);
	   anio = Integer.parseInt(sAnio);
   }
   
   public Fecha(int d, int m, int a) {
	   dia = d;
	   mes = m;
	   anio = a;
   }
   public Fecha() {
	   
   }
   
   public boolean equals(Object o) {
	   Fecha otra = (Fecha)o;
	   return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
   }
   
   public String toString(String string) {
	   return dia + "/" + mes + "/" + anio;
   }
   
   public int getDia() {
		//retorna el valor de dia
		return dia;
   }
   
   public void setDia(int dia) {
	   // asigna el valor del parametro a la variable dia
	   this.dia = dia; 
   }
   
   public int getMes(){
	   return mes;
   }
	
   public void setMes(int mes){
	   this.mes = mes;
   }
	
   public int getAnio(){
	   return anio;
   }
	
   public void setAnio(int anio){
	   this.anio = anio;
   } 
}
