
import java.util.ArrayList;

import pii.Main.Monitor;
import pii.Main.OpFicheros;
import pii.Main.OpInstalacionesDeportivas;
import pii.Main.Usuario;

public class InstalacionesDeportivas {

	public static void main(String[] args) {

		int id = 0;
		String fileEjecucion = "ejecucion.txt";
		String filePersona = "avisos.txt";
		String fileAvisos = "avisos.txt";
		String fileActividades = "actividades.txt";

		// ArrayList donde almacenamos las líneas de comandos
		ArrayList<String> lineas = new ArrayList<String>();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Monitor> monitores = new ArrayList<Monitor>();
		// obtenemos las líneas del fichero de los comandos
		lineas = OpFicheros.leerFichero(fileEjecucion, lineas);
		for (String lineaPartir : lineas) {
			System.out.println(lineaPartir + "*");
			OpInstalacionesDeportivas.comprobarOperacion(lineaPartir, monitores, usuarios);
			// OpFicheros.comprobarOperacion(lineaPartir);
		}

	}

	public static void asignarMonitorGrupo() {

	}

	public static void asignarGrupo() {

	}

	public static void gestionarPagoActividades() {

	}

	public static void obtenerCalendario() {

	}

}
