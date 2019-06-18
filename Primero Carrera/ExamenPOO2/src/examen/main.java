package examen;
public class main {
	public static void main(String[] args) {
		Computer c = new Computer("Mi ordenador");
		
		Brand Microsoft = new Brand("Microsoft", "microsoft");
		Brand Avast = new Brand("Antivirus", "Avast");
		
		Component ram = new Component("RAM 8GB", "ram", 90, 2);
		Component cpu = new Component("Intel i7", "cpu", 250, 1);
		Software ofimatica = new Software("Office", "office1", 100, Microsoft, 1);
		Software antivirus = new Software("Antvirus", "avast1", 50, Avast, 1);
		Software windows = new Software("Sistema Operativo", "windows10", 40, Microsoft, 1);
		
		c.addComponent(ram);
		c.addComponent(cpu);
		c.addProgram(ofimatica);
		c.addProgram(antivirus);
		c.addProgram(windows);
		
		
		
		System.out.println("El PC cuesta " + c.totalPrice() + "€");
		
	}
}