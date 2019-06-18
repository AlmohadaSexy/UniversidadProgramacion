import java.util.ArrayList;
import java.util.Scanner;



public class VideoClub {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Juego> juegos = new ArrayList<Juego>();
	ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	ArrayList<CD> cds = new ArrayList<CD>();
	ArrayList<Producto> pedidos = new ArrayList<Producto>();
	
	private String nombre;
	
	public VideoClub(String nombre) {
		this.nombre = nombre;
	}
	
	public String getName() {
		return nombre;
	}
	
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void verClientes() {
		System.out.println(clientes.toString());
	}
	
	public boolean importarCliente(String nombre) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).comprobarNombre(nombre)) {
				System.out.println("Este cliente ya existe");
				return false;
			}
		}
		
		clientes.add(new Cliente(nombre));
		return true;
	}
	
	public boolean importarJuego(String nombre, double precio, int cantidad, String plataforma, String genero) {
		for (int i = 0; i < juegos.size(); i++) {
			if(juegos.get(i).comprobarNombre(nombre)) {
				System.out.println("Este producto ya existe, sumando a la cantidad " + cantidad);
				return true;
			}
		}
		
		juegos.add(new Juego(nombre, precio, cantidad, plataforma, genero));
		System.out.println("Juego importado");
		return false;
	}
	
	public boolean importarPelicula(String nombre, double precio, int cantidad, String idioma, String genero, double duracion) {
		for (int i = 0; i < peliculas.size(); i++) {
			if(peliculas.get(i).comprobarNombre(nombre)) {
				System.out.println("Este producto ya existe, sumando a la cantidad " + cantidad);
				return true;
			}
		}
		
		System.out.println("Pelicula importada");
		peliculas.add(new Pelicula(nombre, precio, cantidad, idioma, genero, duracion));
		return false;
	}
	
	public boolean importarCD(String nombre, double precio, int cantidad, double duracion, String genero) {
		for (int i = 0; i < cds.size(); i++) {
			if (cds.get(i).comprobarNombre(nombre)) {
				System.out.println("Este producto ya existe, sumando a la cantidad " + cantidad);
				return true;
			}
		}
		
		System.out.println("CD importado");
		cds.add(new CD(nombre, precio, cantidad, duracion, genero));
		return false;
	}
	
	public boolean reservaJuego(String nombre, String nombreCliente) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).comprobarNombre(nombreCliente)) {
				for (int j = 0; j < juegos.size(); j++) {
					
					//Aquí usas i cuando deberia ser j, estas recorriendo el arraylist de juegos con j y el arraylist de clientes con i
					
					if (juegos.get(i).comprobarNombre(nombre)) {
						juegos.get(i).restarCantidad(1);
						pedidos.add(juegos.get(i));
						System.out.println(nombreCliente + " ha reservado " + juegos.get(i));
						return true;
					}
				}
			}
		}
		
		System.out.println("Sin exito");
		return false;
	}
	
	public boolean buscarClientes(String nombre) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).comprobarNombre(nombre)) {
				System.out.println("El cliente" + nombre + " existe");
				return true;
			}
		}
		
		System.out.println("El cliente " + nombre + " no existe");
		return false;
	}
	
	public boolean buscarProductos(String nombre) {
		
		//No mira en todos los arraylists, si hay un cd con el mismo nombre que un juego no se llega a saber.
		//YO haria un contador que vaya sumando y luego al final fuera de los for un if para que si el contador sea distinto de 0 returnee true
		
		for (int i = 0; i < juegos.size(); i++) {
			if (juegos.get(i).comprobarNombre(nombre)) {
				System.out.println("Existe juego con nombre " + nombre);
				return true;
			}
		}
		
		for (int j = 0; j < peliculas.size(); j++) {
			if (peliculas.get(j).comprobarNombre(nombre)) {
				System.out.println("Existe pelicula con nombre " + nombre);
				return true;
			}
		}
		
		for (int k = 0; k < cds.size(); k++) {
			if (juegos.get(k).comprobarNombre(nombre)) {
				System.out.println("Existe CD con nombre " + nombre);
				return true;
			}
		}
		
		System.out.println("No existe ningun producto en ninguna categoria con el nombre " + nombre);
		return false;
	}
	
	public boolean reservaCD(String nombre, String nombreCliente) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).comprobarNombre(nombreCliente)) {
				
				//usas i en cds cuando lo estas recorriendo con j
				
				for (int j = 0; j < cds.size(); j++) {
					if (cds.get(i).comprobarNombre(nombre)) {
						cds.get(i).restarCantidad(1);
						pedidos.add(cds.get(i));
						System.out.println(nombreCliente + " ha reservado " + cds.get(i));
						return true;
					}
				}
			}
		}
		
		System.out.println("Sin exito");
		return false;
	}
	
	public boolean reservaPelicula(String nombre, String nombreCliente) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).comprobarNombre(nombreCliente)) {
				
				//usas i en cds cuando lo estas recorriendo con j
				
				for (int j = 0; j < peliculas.size(); j++) {
					if (peliculas.get(i).comprobarNombre(nombre)) {
						peliculas.get(i).restarCantidad(1);
						pedidos.add(peliculas.get(i));
						System.out.println(nombreCliente + " ha reservado " + peliculas.get(i));
						return true;
					}
				}
			}
		}
		
		System.out.println("Sin exito");
		return false;
	}
	
	public boolean devolucion(String nombre) {
		int indice;
		for (int i = 0; i < pedidos.size(); i++) {
			if(pedidos.get(i).comprobarNombre(nombre)) {
				if (juegos.contains(pedidos.get(i))) {
					indice = juegos.indexOf(pedidos.get(i));
					juegos.get(indice).anadirCantidad(1);
					return true;
				} else if (peliculas.contains(pedidos.get(i))) {
					indice = peliculas.indexOf(pedidos.get(i));
					peliculas.get(indice).anadirCantidad(1);
					return true;
				} else if (cds.contains(pedidos.get(i))) {
					indice = cds.indexOf(pedidos.get(i));
					cds.get(indice).anadirCantidad(1);
					return true;
				}
			}
		}
		System.out.println("Pedido no existe");
		return false;
	}
	
	public String verJuegos() {
		return juegos.toString();
	}
	
	public String verPedidos() {
		return pedidos.toString();
	}
		
	public String toString() {
		return "VideoClub: " + nombre;
	}

}

