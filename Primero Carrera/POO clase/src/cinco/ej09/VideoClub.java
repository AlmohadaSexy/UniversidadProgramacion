package cinco.ej09;

import java.util.ArrayList;

public class VideoClub{
	private String nombre;
	
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Juego> juegos = new ArrayList<>();
	ArrayList<CD> cds = new ArrayList<>();
	ArrayList<Pelicula> peliculas = new ArrayList<>();
	ArrayList<Producto> pedidos = new ArrayList<>();
	
	
	VideoClub(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean addCliente(String nombre) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre());
			if(cliente.comprobarNombre(nombre)) {
				return false;	
			}
		}
		clientes.add(new Cliente(nombre));
		System.out.println("Usuario " + nombre + " añadido.");
		return true;
	}
	
	public boolean addProducto(String nombre, double precio, int cantidad) {
		for(Producto producto : pedidos) {
			if(producto.comprobarPedido(nombre)) {
				System.out.println("Este producto ya existe, añadiendo a nuestro inventario " + cantidad + " juegos más.");
				return false;
			}
		}
		pedidos.add(new Producto(nombre,precio,cantidad));
		return true;
	}
	
	public boolean addJuego(String nombre, double precio, int cantidad,String plataforma, String genero) {
		for(Juego juego : juegos) {
			if(juego.comprobarPedido(nombre)) {
				System.out.println("Este juego ya existe, añadiendo a nuestro inventario " + cantidad + " juegos más.");
				juego.sumarCantidad(cantidad);
				return false;
			}
		}
		juegos.add(new Juego(nombre, precio, cantidad, plataforma, genero));
		return true;
	}
	
	public boolean addCD(String nombre, double precio, int cantidad,int duracion, String genero) {
		for(CD cd : cds) {
			if(cd.comprobarPedido(nombre)) {
				System.out.println("Este CD ya existe, añadiendo a nuestro inventario " + cantidad + " CDs más.");
				cd.sumarCantidad(cantidad);
				return false;
			}
		}
		cds.add(new CD(nombre, precio, cantidad, duracion, genero));
		return true;
	}
	
	public boolean addPelicula(String nombre, double precio, int cantidad,String idioma, int duracion, String genero) {
		for(Pelicula pelicula : peliculas) {
			if(pelicula.comprobarPedido(nombre)) {
				System.out.println("Esta pelicula ya existe,añadiendo a nuestro inventario " + cantidad + " peliculas más.");
				pelicula.sumarCantidad(cantidad);
				return false;
			}
		}
		peliculas.add(new Pelicula(nombre, precio, cantidad, idioma, duracion, genero));
		return true;
	}
	
	public boolean buscarClientes(String nombre) {
		for(Cliente cliente : clientes) {
			if(cliente.comprobarNombre(nombre)) {
				System.out.println("El cliente " + nombre + " ya existe.");
				return true;
			}
		}
		System.out.println("El cliente " + nombre + " no existe.");
		return false;
	}
	
	public boolean buscarProductos(String nombre) {
		for(Producto producto : pedidos) {
			if(producto.comprobarPedido(nombre)) {
				System.out.println("El producto " + nombre + " ya existe.");
				return true;
			}
		}
		System.out.println("El producto " + nombre + " no existe. Prosiga.");
		return false;
	}
	
	public boolean buscarJuegos(String nombre) {
		for(Juego juego : juegos) {
			if(juego.comprobarPedido(nombre)) {
				System.out.println("El Juego " + nombre + " ya existe.");
				return true;
			}
		}
		System.out.println("El Juego " + nombre + " no existe. Prosiga.");
		return false;
	}
	
	public boolean buscarCDs(String nombre) {
		for(CD cd : cds) {
			if(cd.comprobarPedido(nombre)) {
				System.out.println("El CD " + nombre + " ya existe.");
				return true;
			}
		}
		System.out.println("El CD " + nombre + " no existe. Prosiga.");
		return false;
	}
	
	public boolean buscarPeliculas(String nombre) {
		for(Pelicula pelicula : peliculas) {
			if(pelicula.comprobarPedido(nombre)) {
				System.out.println("La pelicula " + nombre + " ya existe.");
				return true;
			}
		}
		System.out.println("La pelicula " + nombre + " no existe. Prosiga.");
		return false;
	}
	
	public boolean hacerReserva(String usuario, String nombreArticulo, int cantidad, String articulo) {
		for (Cliente cliente : clientes) {
			if(cliente.comprobarNombre(usuario)) {
				
				switch (articulo) {
				
				case "Juego":
					for (Juego juego : juegos) {
						if(juego.getNombre().equals(nombreArticulo)) {
							if(juego.restarCantidad(cantidad)) {
								for(Producto producto : pedidos) {
									if(producto.comprobarPedido(nombreArticulo)) {
										producto.sumarCantidad(cantidad);
									}else {
										pedidos.add(juego);
									}
									System.out.println(usuario + " ha reservado " + cantidad + " " + nombreArticulo + juego.toString() + ". Quedan " +  juego.getCantidad() + " juegos.");
									return true;
									
								}
							}
						}
					}
					break;
					
				case "CD":
					for (CD cd : cds) {
						if(cd.getNombre().equals(nombreArticulo)) {
							if(cd.restarCantidad(cantidad)) {
								for(Producto producto : pedidos) {
									if(producto.comprobarPedido(nombreArticulo)) {
										producto.sumarCantidad(cantidad);
									}else {
										pedidos.add(cd);
									}
								System.out.println(usuario + " ha reservado " + cantidad + " " + nombreArticulo + cd.toString() + ". Quedan " + cd.getCantidad() + " CDs.");
								return true;
								}
							}
						}
					}
					break;
					
				case "Pelicula":
					for (Pelicula pelicula : peliculas) {
						if(pelicula.getNombre().equals(nombreArticulo)) {
							if(pelicula.restarCantidad(cantidad)) {
								for(Producto producto : pedidos) {
									if(producto.comprobarPedido(nombreArticulo)) {
										producto.sumarCantidad(cantidad);
									}else {
										pedidos.add(pelicula);
									}
								System.out.println(usuario + " ha reservado " + cantidad + " " + nombreArticulo + pelicula.toString() + ". Quedan " +  pelicula.getCantidad() + " peliculas.");
								return true;	
								}
							}
						}
					}
					break;
				}
			}
		}
		return false;
	}
	
	public boolean hacerDevolucion(String usuario, String nombreArticulo, int cantidad, String articulo) {
		for (Cliente cliente : clientes) {
			if(cliente.comprobarNombre(usuario)) {
				
				switch ( articulo ) {
				
				case "Juego":
					for(Producto producto : pedidos) {
						if(producto.comprobarPedido(nombreArticulo)) {
							for(Juego juego : juegos) {
								if(juego.sumarCantidad(cantidad)) {
									if(producto.getCantidad() - cantidad == 0) {
										pedidos.remove(producto);
										System.out.println(usuario + " ha devuelto " + cantidad + " " + nombreArticulo + juegos.toString() + ". Quedan " +  juego.getCantidad() + " juegos.");
										return true;
									} else if(producto.getCantidad() - cantidad > 0){
										producto.restarCantidad(cantidad);
										juego.sumarCantidad(cantidad);
										System.out.println(usuario + " ha devuelto " + cantidad + " " + nombreArticulo + juegos.toString() + ". Quedan " +  juego.getCantidad() + " juegos.");
										return true;
									} else {
										System.out.println("Tratas de devolver mas articulos de los que has reservado.");
										return false;
									}
								}
							}
						}
					}
					break;
					
				case "CD":
					for (Producto producto : pedidos) {
						if(producto.getNombre().equals(nombreArticulo)) {
							for(CD cd : cds) {
								if(cd.sumarCantidad(cantidad)) {
									if(producto.getCantidad() - cantidad == 0) {
										pedidos.remove(cd);
										System.out.println(usuario + " ha devuelto " + cantidad + " " + nombreArticulo + cd.toString() + ". Quedan " +  cd.getCantidad() + " CDs.");
										return true;
									} else if(producto.getCantidad() - cantidad > 0)	{
										producto.restarCantidad(cantidad);
										cd.sumarCantidad(cantidad);
										System.out.println(usuario + " ha devuelto " + cantidad + " " + nombreArticulo + cd.toString() + ". Quedan " +  cd.getCantidad() + " CDs.");
										return true;
									} else {
										System.out.println("Tratas de devolver más articulos de los que has reservado.");
										return false;
									}
								}
							}
							
						}
					}
					break;
					
				case "Pelicula":
					for (Producto producto : pedidos) {
						if(producto.getNombre().equals(nombreArticulo)) {
							for(Pelicula pelicula : peliculas) {
								if(pelicula.sumarCantidad(cantidad)) {
									if(producto.getCantidad() - cantidad == 0) {
										pedidos.remove(pelicula);
										System.out.println(usuario + " ha devuelto " + cantidad + " " + nombreArticulo + pelicula.toString() + ". Quedan " +  pelicula.getCantidad() + " peliculas.");
										return true;
									} else if(producto.getCantidad() - cantidad > 0) {
										producto.restarCantidad(cantidad);
										pelicula.sumarCantidad(cantidad);
										System.out.println(usuario + " ha devuelto " + cantidad + " " + nombreArticulo + pelicula.toString() + ". Quedan " +  pelicula.getCantidad() + " peliculas.");
										return true;
									} else {
										System.out.println("Tratas de devolver más artículos de los que has reservado.");
										return false;
									}
								}
							}
						}
					}
					break;
					
				default:
					System.out.println("Introduzca el articulo bien");
					break;
				}
			}
		}
		return false;
	}
}