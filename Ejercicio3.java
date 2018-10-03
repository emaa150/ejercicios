/**
 * 
 */
package ejercicios;

import java.util.Date;

/**
 * A. Crear una clase Alumnno con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * Persona
 * Legajo - Integer
 * 
 *  
 * @author examen
 *
 */
public class Ejercicio3 {

	/**
	 * 
	 */
	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public class Alumno {
		
	private String tipodoc;
	
	private int nrodocumento;
	
	private String nombre;
	
	private String apellido;
	
	private Date fechanac;
	
	private int legajo;
	

	public Alumno(String tipodoc, int nrodocumento, String nombre, String apellido, Date fechanac, int legajo) {
	
		this.tipodoc = tipodoc;
		this.nrodocumento = nrodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.legajo = legajo;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public int getNrodocumento() {
		return nrodocumento;
	}

	public void setNrodocumento(int nrodocumento) {
		this.nrodocumento = nrodocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "Alumno [tipodoc=" + tipodoc + ", nrodocumento=" + nrodocumento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechanac=" + fechanac + ", legajo=" + legajo + "]";
	}
	

		
		
	}
}
