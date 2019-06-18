package cinco.ej09;

import java.util.Scanner;

public class main {
	
	static Scanner sc = new Scanner(System.in);
	static VideoClub VC = new VideoClub("El VideoClub de mi Casa");
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a " + VC.getNombre());
		menuPrincipal();
	}
	
	public static void menuPrincipal() {
		System.out.println("—————————————————————————————————————————————————————————");
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1 - Añadir usuario");
		System.out.println("2 - Añadir producto");
		System.out.println("3 - Reservas y devoluciones");
		System.out.println("4 - Salir");
		System.out.println();
		System.out.print("Introduzca un numero - ");
		int seleccionador = sc.nextInt();
		sc.nextLine();
		System.out.println();
		switch( seleccionador ){
        case 1:
            anadirUsuario();
        case 2:
            anadirProducto();
        case 3:
            menuResDev();
        case 4:
        	System.out.println("Adios!!");
        	break;
        default:
            System.out.println("Ingrese un numero entre 1 y 4.");
            menuPrincipal();
		}
	}
	
	public static void anadirUsuario() {
		System.out.print("Nombre - ");
		String nombreUsuario = sc.nextLine();
		VC.addCliente(nombreUsuario);
		System.out.println();
		menuPrincipal();
	}

	private static void anadirProducto() {
		System.out.println("—————————————————————————————————————————————————————————");
		System.out.println("¿Qué producto quiere añadir?");
		System.out.println("1 - Juego");
		System.out.println("2 - CD");
		System.out.println("3 - Película");
		System.out.println("4 - Atrás");
		System.out.println();
		System.out.print("Ingrese un numero - ");
		int seleccionador = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println("—————————————————————————————————————————————————————————");
		
		switch( seleccionador ){
        case 1:
            anadirJuego();
            break;
        case 2:
            anadirCD();
            break;
        case 3:
            anadirPelicula();
            break;
        case 4:
        	menuPrincipal();
            break;
        default:
            System.out.println("Ingrese un numero entre 1 y 4");
            anadirProducto();
		}
	}
	
	private static void anadirJuego() {
		
		System.out.println("Añadiendo Juego: ");
		
		System.out.print("Nombre - ");
		String nombreJuego = sc.nextLine();
		
		System.out.print("Precio - ");
		double precioJuego = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Cantidad - ");
		int cantidadJuego = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Plataforma - ");
		String plataformaJuego = sc.nextLine();
		
		System.out.print("Genero - ");
		String generoJuego = sc.nextLine();
		
		VC.addJuego(nombreJuego, precioJuego, cantidadJuego, plataformaJuego, generoJuego);
		menuPrincipal();
	}

	private static void anadirCD() {
		System.out.println("Añadiendo CD: ");
		
		System.out.print("Nombre - ");
		String nombreCD = sc.nextLine();
		
		System.out.print("Precio - ");
		double precioCD = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Cantidad - ");
		int cantidadCD = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Duracion - ");
		int duracionCD = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Genero - ");
		String generoCD = sc.nextLine();
		
		VC.addCD(nombreCD, precioCD, cantidadCD, duracionCD, generoCD);
		menuPrincipal();
	}

	private static void anadirPelicula() {
		System.out.println("Añadiendo Pelicula: ");
		
		System.out.print("Nombre - ");
		String nombrePelicula = sc.nextLine();
		
		System.out.print("Precio - ");
		double precioPelicula = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Cantidad - ");
		int cantidadPelicula = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Idioma - ");
		String idiomaPelicula = sc.nextLine();
		
		System.out.print("Duracion - ");
		int duracionPelicula = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Genero - ");
		String generoPelicula = sc.nextLine();
		
		VC.addPelicula(nombrePelicula, precioPelicula, cantidadPelicula, idiomaPelicula,duracionPelicula, generoPelicula);
		menuPrincipal();
	}

	private static void menuResDev() {
		System.out.println("—————————————————————————————————————————————————————————");
		System.out.println("¿Qué quiere hacer?");
		System.out.println("1 - Reserva");
		System.out.println("2 - Devolucion");
		System.out.println("3 - Atrás");
		System.out.println();
		System.out.print("Introduzca un número: ");
		int seleccionador = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		System.out.println("—————————————————————————————————————————————————————————");
		
		switch( seleccionador ){
        case 1:
            menuReserva();
            break;
        case 2:
            menuDevolucion();
            break;
        case 3:
        	menuPrincipal();
            break;
        default:
            System.out.println("Introduzca un numero entre el 1 y 2.");
            menuResDev();
		}
	}

	private static void menuReserva() {
		System.out.println("Menu de reserva: ");
		
		System.out.print("Introduzca su usuario - ");
		String usuario = sc.nextLine();
		
		System.out.print("¿Qué quieres reservar? (Juego, CD o Pelicula) - ");
		String articulo = sc.nextLine();
		
		System.out.print("Introduzca el articulo a reservar - ");
		String nombreArticulo = sc.nextLine();
		
		System.out.print("Introduzca la cantidad que quieres reservar - ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		VC.hacerReserva(usuario, nombreArticulo, cantidad, articulo);
		menuPrincipal();
	}
	
	private static void menuDevolucion() {
		System.out.println("Menu de devolucion: ");
		
		System.out.print("Introduzca su usuario - ");
		String usuario = sc.nextLine();
		
		System.out.print("¿Qué quieres devolver? (Juego, CD o Pelicula) - ");
		String articulo = sc.nextLine();
		
		System.out.print("Introduzca el articulo a devolver - ");
		String nombreArticulo = sc.nextLine();
		
		System.out.print("Introduzca la cantidad que quieras devolver - ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		VC.hacerDevolucion(usuario, nombreArticulo, cantidad, articulo);
		menuPrincipal();
	}
}