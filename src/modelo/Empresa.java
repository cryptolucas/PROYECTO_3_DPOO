package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;

public class Empresa {
	
	private ArrayList<String[]> usuarios;
	private  HashMap<String, ArrayList<Carro>>  inventario = new HashMap<>();
	
	private HashMap<String, ArrayList<Empleado>> empleados = new HashMap<>();
	private HashMap<Integer, Reserva> reservas = new HashMap<>();; 
	
	//public Restaurante () throws FileNotFoundException  {   PONER CONSTRUCTOR ACA!!!
		
		//CargarInformacionRestaurante();
		
		//int numeroPedidos = 0;
		//pedidos = new ArrayList<Pedido>();
		//this.pedidoEnCurso = false;
		//pedidosPorId = new ArrayList<HashMap<String, String>>();
		

	
	public void CargarInformacionEmpresa() throws FileNotFoundException
	
	{
		String archivoUsuarios = "data/users.txt";
		//String archivoInventario = "data/inventario.txt";
		
		
		loaderUsuarios(archivoUsuarios);
		loaderInventario(); // 
		
		
	}
	
		
	public HashMap<String, ArrayList<Carro>> getInventario() {
		return inventario;
	}


	public void setInventario(HashMap<String, ArrayList<Carro>> inventario) {
		this.inventario = inventario;
	}


	public HashMap<String, ArrayList<Empleado>> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(HashMap<String, ArrayList<Empleado>> empleados) {
		this.empleados = empleados;
	}


	public HashMap<Integer, Reserva> getReservas() {
		return reservas;
	}


	public void setReservas(HashMap<Integer, Reserva> reservas) {
		this.reservas = reservas;
	}


	public void loaderUsuarios(String archivoUsuarios) throws FileNotFoundException
	{
		
		try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios)))
		{
		ArrayList<String[]> usuarios = new ArrayList<>();
		String linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(",");
			String[] comps = new String[3];
			String username = partes[0];
			String password = partes[1];
			String tipousuario = partes[2];
			comps[0]=username;
			comps[1]=password;
			comps[2]=tipousuario;
			usuarios.add(comps);
			
			linea = br.readLine();
			
			
		}
		this.usuarios = usuarios;
		}
		catch(Exception e)  
		{ e.printStackTrace();
		
		}
			
		}
	
	public void loaderInventario() throws FileNotFoundException
	{
		
		String	archivoInventario = "data/inventario.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(archivoInventario)))
		{
		
		HashMap<String, ArrayList<Carro>> general = new HashMap<>();
		ArrayList<Carro> arr = new ArrayList<>();
		String llave = "Disponible";
		
		String linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(",");
			
			int capacidad = Integer.parseInt(partes[5]);
			Carro car = new Carro(partes[0], partes[1], partes[2], partes[3], partes[4], capacidad, partes[6], partes[7]);
			arr.add(car);
			general.put(llave, arr);

			linea = br.readLine();
			
			
		}
		this.inventario = general;
		br.close();
		}
		catch(Exception e)  
		{ e.printStackTrace();
		
		}
			
		}
	
	
	public void loaderInventarioSedeNorte() throws FileNotFoundException
	{
		String archivoInventario = "data/inventario_sede_norte.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(archivoInventario)))
		{
		
		HashMap<String, ArrayList<Carro>> general = new HashMap<>();
		ArrayList<Carro> arr = new ArrayList<>();
		String llave = "Disponible";
		
		String linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(",");
			
			int capacidad = Integer.parseInt(partes[5]);
			Carro car = new Carro(partes[0], partes[1], partes[2], partes[3], partes[4], capacidad, partes[6], partes[7]);
			arr.add(car);
			general.put(llave, arr);

			linea = br.readLine();
			
			
		}
		this.inventario = general;
		br.close();
		}
		catch(Exception e)  
		{ e.printStackTrace();
		
		}
			
		}
	
	public void loaderInventarioSedeSur() throws FileNotFoundException
	{
		String archivoInventario = "data/inventario_sede_sur.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(archivoInventario)))
		{
		
		HashMap<String, ArrayList<Carro>> general = new HashMap<>();
		ArrayList<Carro> arr = new ArrayList<>();
		String llave = "Disponible";
		
		String linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(",");
			
			int capacidad = Integer.parseInt(partes[5]);
			Carro car = new Carro(partes[0], partes[1], partes[2], partes[3], partes[4], capacidad, partes[6], partes[7]);
			arr.add(car);
			general.put(llave, arr);

			linea = br.readLine();
			
			
		}
		this.inventario = general;
		br.close();
		}
		catch(Exception e)  
		{ e.printStackTrace();
		
		}
			
		}
	
	public void loaderInventarioSedeCentro() throws FileNotFoundException
	{
		String archivoInventario = "data/inventario_sede_centro.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(archivoInventario)))
		{
		
		HashMap<String, ArrayList<Carro>> general = new HashMap<>();
		ArrayList<Carro> arr = new ArrayList<>();
		String llave = "Disponible";
		
		String linea = br.readLine();
		while (linea != null)
		{
			String[] partes = linea.split(",");
			
			int capacidad = Integer.parseInt(partes[5]);
			Carro car = new Carro(partes[0], partes[1], partes[2], partes[3], partes[4], capacidad, partes[6], partes[7]);
			arr.add(car);
			general.put(llave, arr);

			linea = br.readLine();
			
			
		}
		this.inventario = general;
		br.close();
		}
		catch(Exception e)  
		{ e.printStackTrace();
		
		}
			
		}
	
	
	
		
	
	
	
		public void CrearCliente(String nombre, String correo, String login, String password, String tipoUsuario,
						String fechaNacimiento, String nacionalidad,int licenciaConduccion, String paisExpedicion, 
						String fechaVencimientoLicencia, int telefonoContacto, int numeroTarjetaCredito) throws IOException{
			
			if (tipoUsuario.equals("cliente")){
			
				Cliente nuevoCliente = new Cliente(nombre, correo, login, password, tipoUsuario, fechaNacimiento, nacionalidad,
												licenciaConduccion, paisExpedicion, fechaVencimientoLicencia, telefonoContacto,
												numeroTarjetaCredito);}
			
				String rutaArchivo = "data/users.txt";
				String contenido = login + "," + password + "," + tipoUsuario ;
				BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true));
				writer.write(contenido);
				writer.newLine(); 
				writer.close();
				
				
				String ruta2 = "data/clientes.txt";
				String contenido2 = nombre + "," + correo + "," + fechaNacimiento + "," + nacionalidad + "," +
							licenciaConduccion + "," + paisExpedicion + "," +  fechaVencimientoLicencia + "," + telefonoContacto
							+ "," + numeroTarjetaCredito;
				BufferedWriter writer1 = new BufferedWriter(new FileWriter(ruta2, true));
				writer1.write(contenido2);
				writer1.newLine(); 
				writer1.close();
			
		}
		
		
	
		public void CrearEmpleado(String login, String password, String tipoUsuario, String nombre, String id, String sede) throws IOException {
			
			if(tipoUsuario.equals("empleado")){
				
				Empleado nuevoEmpleado = new Empleado(login,password,tipoUsuario,nombre,id,sede);
				
				
					String rutaArchivo = "data/users.txt";
					String contenido = login + "," + password + "," + tipoUsuario ;
					BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true));
					writer.write(contenido);
					writer.newLine(); 
					writer.close();
					
					
					String ruta2 = "data/empleados.txt";
					String contenido2 = nombre + "," + id + "," + sede;
					BufferedWriter writer1 = new BufferedWriter(new FileWriter(ruta2, true));
					writer1.write(contenido2);
					writer1.newLine(); 
					writer1.close();
	
			}
			
				
			}
		
		
		
		public int CrearReserva (String nombre, String licencia, String cedula, String sedeOrigen, String sedeDestino, String hora_recogida, String hora_entrega, String metodo_pago,
		         int conductor_adicional, String seguros, String tipo_vehiculo) throws IOException {
			
			
			boolean x = false;
			Reserva reserva = new Reserva(sedeOrigen, sedeDestino, hora_recogida, hora_entrega, metodo_pago, conductor_adicional, seguros, tipo_vehiculo);
			reservas.put(reserva.getIdReserva(), reserva);
			int preciofinal = reserva.PrecioFinal(sedeOrigen, sedeDestino, hora_recogida, hora_entrega, seguros, tipo_vehiculo, conductor_adicional);
			
			
			String rutaArchivo = "data/reservados.txt";
			String contenido = Integer.toString(reserva.getIdReserva()) + "," + nombre + "," + licencia + "," + cedula + ","+ sedeDestino + "," + hora_entrega + "," + tipo_vehiculo + "," + Integer.toString(preciofinal);
			BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true));
			writer.write(contenido);
			writer.newLine(); 
			writer.close();
			
			
			while (x==false) {
			
			   for (Carro carro : inventario.get("Disponible")) {
	            	
	            	if (carro.getTipovehiculo().equals(tipo_vehiculo)) {
	            		ArrayList<Carro> ca = new ArrayList<>();
	            		ca.add(carro);
	            		inventario.put("Reservados", ca);
	            		inventario.get("Disponible").remove(carro);
	            		x = true;
	            		break;
	            		
	            		
	            	}		
						
			}	
			}
			
			return preciofinal;
		}
		
		
		
		public void RecibirCarro(int ID, String sede) throws IOException {
			
			String tipo_veh = null;
			

			if (sede.equalsIgnoreCase("norte")) 
				loaderInventarioSedeNorte();

			else if (sede.equalsIgnoreCase("sur")) 
				loaderInventarioSedeSur();

			else if (sede.equalsIgnoreCase("centro")) 
				loaderInventarioSedeCentro();

			
			
			try {
	            FileReader fileReader = new FileReader("data/reservados.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String linea;
	            while ((linea = bufferedReader.readLine()) != null) {
	                // Dividir la línea en partes usando comas como delimitador
	                String[] partes = linea.split(",");

	                // Verificar si la primera posición contiene el string buscado
	                if (partes.length > 0 && partes[0].equals(Integer.toString(ID))) {
	                    
	                	tipo_veh = partes[6];
	                    
	                    break; // Detener la búsqueda después de encontrar la primera línea
	                }
	            }

	            bufferedReader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
  
//			ArrayList<Carro> lista_reservados = inventario.get("Reservados");
//			ArrayList<Carro> lista_disponible= inventario.get("Disponible");
//			boolean x = false;
//			
//			while (x==false) {
//			
//				for (Carro carro : lista_reservados) {
//            	
//            	if (carro.getTipovehiculo().equals(tipo_veh)) {
//            		lista_disponible.add(carro);
//            		lista_reservados.remove(carro);
//            		x = true;
//            		break;}
//			}		
//			}
//			
			
			
			
			try (BufferedReader br = new BufferedReader(new FileReader("data/reservados.txt"));
		             BufferedWriter bw = new BufferedWriter(new FileWriter("data/temporal.txt"))) {

		            String linea;

		            // Lee cada línea del archivo
		            while ((linea = br.readLine()) != null) {
		                // Verifica si la línea cumple con la condición
		                if (obtenerCampo(linea, 0).equals(Integer.toString(ID))) {
		                    // Agrega "finalizado" al final de la línea
		                    linea += " (Finalizado)";
		                }

		                // Escribe la línea (modificada o no) en el archivo temporal
		                bw.write(linea);
		                bw.newLine(); // Agrega un salto de línea después de cada línea escrita
		            }
		            

		        // Renombra el archivo temporal al nombre original
		            renombrarArchivo("data/temporal.txt", "data/reservados.txt");
		            
			}	
			
		}
		
		
		
		
		public String obtenerCampo(String linea, int posicion) {
	        // Divide la línea en campos utilizando algún delimitador (por ejemplo, comas)
	        String[] campos = linea.split(",");
	        // Retorna el campo en la posición especificada
	        return campos.length > posicion ? campos[posicion].trim() : "";
	    }
		
		public void renombrarArchivo(String archivoOrigen, String archivoDestino) {
			
            File origen = new File(archivoOrigen);
            File destino = new File(archivoDestino);
            boolean exito = origen.renameTo(destino);
	    
		}
		
		public void EliminarCarro (String modelo, String sede){
			
			boolean x = false;
			
			while (x==false) {
			
			for (Carro carro : inventario.get("Disponible")) {
            	
            	if (carro.getModeloCarro().equals(modelo)) {
            		inventario.get("Disponible").remove(carro);
            		x = true;
            		break;}
			}		
			}
			
			
			try {
	            FileReader fileReader = new FileReader("data/inventario.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String linea;
	            StringBuilder contenido = new StringBuilder();

	            while ((linea = bufferedReader.readLine()) != null) {
	                String[] palabras = linea.split(",");
	                if (palabras.length > 2 && palabras[2].equals(modelo)) {
	                    // La palabra deseada está en la posición 3, no agregamos esta línea al contenido
	                    continue;
	                }
	                contenido.append(linea).append("\n");
	            }

	            bufferedReader.close();

	            FileWriter fileWriter = new FileWriter("data/inventario.txt");
	            fileWriter.write(contenido.toString());
	            fileWriter.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
			String nombrearchivo = null;
			if (sede.equals("centro"))
				nombrearchivo = "data/inventario_sede_centro.txt";
			else if (sede.equals("sur"))
				nombrearchivo = "data/inventario_sede_sur.txt";
			else if (sede.equals("norte"))
				nombrearchivo = "data/inventario_sede_norte.txt";
			
			try {
	            FileReader fileReader = new FileReader(nombrearchivo);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String linea;
	            StringBuilder contenido = new StringBuilder();

	            while ((linea = bufferedReader.readLine()) != null) {
	                String[] palabras = linea.split(",");
	                if (palabras.length > 2 && palabras[2].equals(modelo)) {
	                    // La palabra deseada está en la posición 3, no agregamos esta línea al contenido
	                    continue;
	                }
	                contenido.append(linea).append("\n");
	            }

	            bufferedReader.close();

	            FileWriter fileWriter = new FileWriter(nombrearchivo);
	            fileWriter.write(contenido.toString());
	            fileWriter.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		
		
		
		
		
		
		
		public void EnviarAMantenimiento(String placa, String sede, String fecha_estimada) throws IOException {
			
			boolean x = false;
			String rutaArchivo = null;
			
			if (sede.equalsIgnoreCase("norte")) {
				loaderInventarioSedeNorte();
				rutaArchivo = "data/mantenimiento_norte.txt";}
			else if (sede.equalsIgnoreCase("sur")) {
				loaderInventarioSedeSur();
				rutaArchivo = "data/mantenimiento_sur.txt";}
			else if (sede.equalsIgnoreCase("centro")) {
				loaderInventarioSedeCentro();
				rutaArchivo = "data/mantenimiento_centro.txt";}
			
			while (x==false) {
				
				   for (Carro carro : inventario.get("Disponible")) {
		            	
		            	if (carro.getPlaca().equals(placa)) {
		            		ArrayList<Carro> ca = new ArrayList<>();
		            		ca.add(carro);
		            		inventario.put("Mantenimiento", ca);
		            		inventario.get("Disponible").remove(carro);
		            		x = true;
		            		break;
		            		
		            		
		            	}		
							
				}
			
			
			}
			
		
			String contenido = placa + "," + sede + "," + fecha_estimada;
			BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true));
			writer.write(contenido);
			writer.newLine(); 
			writer.close();
			
		}
		
		
		
		
		
		
		
		
		
		public void SacarMantenimiento(String placa, String sede) throws IOException { 
				
				String rutaArchivo = null;
				
				if (sede.equalsIgnoreCase("norte")) {
					rutaArchivo = "data/mantenimiento_norte.txt";}
				else if (sede.equalsIgnoreCase("sur")) {
					rutaArchivo = "data/mantenimiento_sur.txt";}
				else if (sede.equalsIgnoreCase("centro")) {
					rutaArchivo = "data/mantenimiento_centro.txt";}
				
				
				ArrayList<Carro> lista_mantenimiento = inventario.get("Mantenimiento");
				ArrayList<Carro> lista_disponible= inventario.get("Disponible");
				boolean x = false;
				
				while (x==false) {
				
					for (Carro carro : lista_mantenimiento) {
	            	
	            	if (carro.getPlaca().equals(placa)) {
	            		lista_disponible.add(carro);
	            		lista_mantenimiento.remove(carro);
	            		x = true;
	            		break;}
				}		
				}
				
			
				try {
		            FileReader fileReader = new FileReader(rutaArchivo);
		            BufferedReader bufferedReader = new BufferedReader(fileReader);

		            // Crear un nuevo archivo temporal
		            String nombreArchivoTemporal = "temporal.txt";
		            FileWriter fileWriter = new FileWriter(nombreArchivoTemporal);
		            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		            String linea;
		            while ((linea = bufferedReader.readLine()) != null) {
		                // Verificar si la primera posición de la línea contiene el string a buscar
		                String[] partes = linea.split(",");
		                if (partes.length > 0 && partes[0].equals(placa)) {
		                    // No escribir la línea en el archivo temporal
		                    continue;
		                }

		                // Escribir la línea en el archivo temporal
		                bufferedWriter.write(linea);
		                bufferedWriter.newLine();
		            }

		            // Cerrar los lectores y escritores
		            bufferedReader.close();
		            bufferedWriter.close();

		            // Renombrar el archivo temporal al nombre del archivo original
		            File archivoOriginal = new File(rutaArchivo);
		            File archivoTemporal = new File(nombreArchivoTemporal);
		            archivoTemporal.renameTo(archivoOriginal);


		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
			
			
			
			

		public void AgregarCarro(String marca, String placa, String modeloCarro, String color, String transmision, 
									int capacidad, String tipoMotor, String tipovehiculo, String sede) throws IOException {
		
			ArrayList<Carro> lista = inventario.get("Disponible");
			Carro nuevo = new Carro(marca, placa, modeloCarro, color, transmision, capacidad, tipoMotor, tipovehiculo);
			lista.add(nuevo);
			
			String nombrearchivo = null;
			if (sede.equals("centro"))
				nombrearchivo = "data/inventario_sede_centro.txt";
			else if (sede.equals("sur"))
				nombrearchivo = "data/inventario_sede_sur.txt";
			else if (sede.equals("norte"))
				nombrearchivo = "data/inventario_sede_norte.txt";
			
			
			String contenido = marca + "," + placa + "," + modeloCarro + "," + color + "," + transmision + "," + Integer.toString(capacidad) + "," + tipoMotor + ","+ tipovehiculo ;
			BufferedWriter writer = new BufferedWriter(new FileWriter(nombrearchivo, true));
			writer.write(contenido);
			writer.newLine(); 
			writer.close();
			
			String rutaArchivo = "data/inventario.txt";
			String contenido2 = marca + "," + placa + "," + modeloCarro + "," + color + "," + transmision + "," + Integer.toString(capacidad) + "," + tipoMotor + ","+ tipovehiculo ;
			BufferedWriter writer2 = new BufferedWriter(new FileWriter(rutaArchivo, true));
			writer2.write(contenido2);
			writer2.newLine(); 
			writer2.close();
			
			
		}
		
		public String ConsultarReserva(String ID) {
			
			String reserva = null;
			
			try {
	            FileReader fileReader = new FileReader("data/reservados.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String linea;
	            while ((linea = bufferedReader.readLine()) != null) {
	                // Dividir la línea en partes usando comas como delimitador
	                String[] partes = linea.split(",");

	                // Verificar si la primera posición contiene el string buscado
	                if (partes.length > 0 && partes[0].equals(ID)) {
	                    
	                	reserva = linea;
	                    
	                    break; // Detener la búsqueda después de encontrar la primera línea
	                }
	            }

	            bufferedReader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
			return reserva;
			
		}
		
		
}


	


