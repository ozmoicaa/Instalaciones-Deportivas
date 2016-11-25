package pii.Main;

import java.util.Calendar;

public class Monitor extends Persona {

	private String especialidad;
	private int horasSemanales;
	
	public Monitor(String nombre, String apellidos, int id, Calendar fechaNacimiento, String especialidad,
			int horasSemanales) {
		super(nombre, apellidos, id, fechaNacimiento);
		this.especialidad = especialidad;
		this.horasSemanales = horasSemanales;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	
	
}
