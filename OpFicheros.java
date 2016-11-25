package pii.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class OpFicheros {

	public static ArrayList<String> leerFichero(String archivo, ArrayList<String> lineas) {

		try {
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains("*") || line.length()==0) {
				} else
					lineas.add(line);
			}
			bufferedReader.close();
			fileReader.close();
		} catch (Exception IOException) {
			System.out.println("Error al leer el fichero");
		}
		return lineas;
	}

}
