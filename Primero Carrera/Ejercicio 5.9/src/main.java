import java.util.Scanner;

public class main {
	
	static VideoClub v1 = new VideoClub("El Club");

	public static void main(String[] args) {
		System.out.println("BIENVENIDO A " + v1);
		System.out.println("----------------------------------------------------------");
		
		menuPrincipal();
	}
	
	
	public static void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que desea hacer?");
		System.out.println("----------------------------------------------------------");
		System.out.println("1 - Importar Cliente");
		System.out.println("2 - Crear un nuevo producto");
		System.out.println("3 - Reservas y devoluciones");
		System.out.println("4 - Salir");
		System.out.println("----------------------------------------------------------");
		int seleccion = sc.nextInt();
		
		switch (seleccion) {
		case 1:
			importarCliente();
		case 2:
			nuevoProducto();
		case 3:
			reservasDevoluciones();
		case 4:
			System.exit(1);
		default: 
			System.out.println("La opcion introducida no existe");
			break;
		}
		
		
	}
	
	public static void importarCliente() {
		Scanner sc = new Scanner(System.in);
		String nombreCliente;
		
		System.out.println("Introduzca nombre del cliente: ");
		nombreCliente = sc.next();
		
		v1.importarCliente(nombreCliente);
		
		menuPrincipal();
	}
	
	public static void nuevoProducto() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que tipo de producto desea importar?");
		System.out.println("1 - Juego");
		System.out.println("2 - Pelicula");
		System.out.println("3 - CD");
		System.out.println("4 - Menu Principal");
		
		int seleccion = sc.nextInt();
		
		switch (seleccion) {
		case 1:
			impJuego();
		case 2:
			impPelicula();
		case 3:
			impCD();
		case 4:
			menuPrincipal();
		default:
			System.out.println("La opcion introducida no existe");
			nuevoProducto();
		}
	}
	
	public static void impJuego() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titulo: ");
		String titulo = sc.nextLine();
		
		System.out.println("Precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.println("Plataforma: ");
		String plataforma = sc.next();
		
		System.out.println("Genero: ");
		String genero = sc.next();
		
		v1.importarJuego(titulo, precio, cantidad, plataforma, genero);
		
		menuPrincipal();
		
	}
	
	public static void impPelicula() {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Titulo: ");
		String titulo = sc.nextLine();
		
		System.out.println("Precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.println("Idioma: ");
		String idioma = sc.next();
		
		System.out.println("Genero: ");
		String genero = sc.next();
		
		System.out.println("Duracion: ");
		double duracion = sc.nextDouble();
		
		v1.importarPelicula(titulo, precio, cantidad, idioma, genero, duracion);
		
		menuPrincipal();
	}
	
	public static void impCD() {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Titulo: ");
		String titulo = sc.nextLine();
		
		System.out.println("Precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.println("Duracion: ");
		double duracion = sc.nextDouble();
		
		System.out.println("Genero: ");
		String genero = sc.next();
		
		v1.importarCD(titulo, precio, cantidad, duracion, genero);
		
		menuPrincipal();
		
	}
	
	public static void reservasDevoluciones() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que desea hacer?");
		System.out.println("1 - Reserva");
		System.out.println("2 - Devolucion");
		
        int seleccion = sc.nextInt();
		
		switch (seleccion) {
		case 1:
			opcionReserva();
		case 2:
			devolucion();
		case 3:
			menuPrincipal();
		default:
			System.out.println("La opcion introducida no existe");
			reservasDevoluciones();
		}
	}
	
	public static void opcionReserva() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Reservar juego");
		System.out.println("2 - Reservar pelicula");
		System.out.println("3 - Reservar CD");
		System.out.println("4 - Menu Principal");
        
		int seleccion = sc.nextInt();
		
		switch (seleccion) {
		case 1:
			reservaJuego();
		case 2:
			reservaPelicula();
		case 3:
			reservaCD();
		case 4:
			menuPrincipal();
		default:
			System.out.println("La opcion introducida no existe");
			opcionReserva();
		}
	}
	
	public static void reservaCD() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba titulo del producto:");
		String nombre = sc.nextLine();
		System.out.println("Escriba nombre del cliente:");
		String nombreCliente = sc.nextLine();
		
		v1.reservaCD(nombre, nombreCliente);
		
		menuPrincipal();
	}
	
	public static void reservaJuego() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba titulo del producto:");
		String nombre = sc.nextLine();
		System.out.println("Escriba nombre del cliente:");
		String nombreCliente = sc.nextLine();
		
		v1.reservaJuego(nombre, nombreCliente);
		
		menuPrincipal();
	}
	
	public static void reservaPelicula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba titulo del producto:");
		String nombre = sc.nextLine();
		System.out.println("Escriba nombre del cliente:");
		
		String nombreCliente = sc.nextLine();
		
		v1.reservaPelicula(nombre, nombreCliente);
		
		menuPrincipal();	
	}
	
	public static void devolucion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del producto que desea devolver:");
		String nombre = sc.nextLine();
		
		v1.devolucion(nombre);
		
		menuPrincipal();
		
	}

}