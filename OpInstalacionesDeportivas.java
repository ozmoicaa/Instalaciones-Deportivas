package pii.Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class OpInstalacionesDeportivas {

	public static void comprobarOperacion(String linea, ArrayList<Monitor> monitores, ArrayList<Usuario> usuarios ) {
		
		String[] lineaPartida = linea.split("\\s");
		String instruccion = lineaPartida[1];

		switch (instruccion.toUpperCase()) {
		case "INSERTAPERSONA":
			//Partimos la cadena elemento a elemento hasta los apellidos, a partir de ahí está todo en un mismo string
			String[] partes1 = linea.split("(\"\\s+\"|\\s+\"|\"\\s+)");
			String[] partes2 = partes1[(partes1.length-1)].split("\\s* \\s*");
			String[] partes3 = partes1[0].split("\\s");
			//ARRAY QUE CONTIENE TODA LA INFORMACION CON LOS ELMENTOS POR SEPARADO
			String[] partes= new String[10];
			//CONCATENO LOS ARRAYS DE STRINGS
			System.arraycopy(partes3, 0, partes, 0, partes3.length);
			System.arraycopy(partes1, 1, partes, partes3.length-1, 2);
			System.arraycopy(partes2, 0, partes, partes3.length+1, partes2.length);
			for (String string : partes) {
				System.out.println(string);
			}
			insertaPersona(partes, monitores, usuarios);
			break;
			
		case  "ASIGNARMONITORGRUPO":
			System.out.println("Asignar monitor grupo");
		
		case "ALTA":
			System.out.println("Alta");
			break;
			
		default:
			System.out.println("No existe el comando:" + lineaPartida[1]);
		}
	}

	public static void insertaPersona(String[] partes, ArrayList<Monitor> monitores, ArrayList<Usuario> usuarios) {
		
		//Compruebo si estoy introduciendo un monitor en el sistema.
		if( partes[2].equals("monitor")){ 
			String perfil = partes[2];
			String nombre = partes[3].replace("\"", " ").trim();
			String apellidos = partes[4].replace("\"", " ").trim();
			//GENERO LOS ELEMENTOS DE LA FECHA
			String[] fecha = partes[5].split("/");
			int dia = Integer.parseInt(fecha[0]);
			int mes = Integer.parseInt(fecha[1]);
			int año = Integer.parseInt(fecha[2]);
			int horasAsignables = Integer.parseInt(partes[6]);
			//Introduzco la fecha como año, mes, día.
			Calendar fecha1 = new GregorianCalendar(año,mes,dia);
			int id = 1;
			System.out.println(perfil+" "+nombre+" "+ apellidos+" " +fecha1.get(Calendar.DAY_OF_MONTH));
			Monitor monitor1 = new Monitor(nombre, apellidos, id, fecha1,"Body Combat" ,horasAsignables);
			monitores.add(monitor1);
			}//	else if(partes[2].equals(anObject)){
				
		//	}
			else{
				System.out.println("no entra en el bucle");
			}
		
	}

}
