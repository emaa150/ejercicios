package ejercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import ejercicios.Persona.TipoDocumento;



/**
 * A. Crear una clase Persona con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) 
 * NroDocumento - Integer
 * Nombre - String
 * Apellido - String
 * FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia
 * de la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en 
 * consola 
 * (crear método main e imprimir valores) 
 *  
 * @author examen
 *
 */
public class Ejercicio2 {


	
  public static void main(String[] args) {
		// TODO Auto-generated method stub

  
	try {
		
		 String entrada="01/03/1995";
		 
		 DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); 
		 Date fecha;
		
		fecha = format.parse(entrada);
		
		Persona datospersona1=new Persona(38818820, "Emanuel", "Samana", fecha);
		
		Persona datospersona2=new Persona(318882312, "Jose", "Perez", fecha);
		
		System.out.println("El tipo de documento es: "+TipoDocumento.DNI.SelecTipoDoc());
		 
		System.out.println(datospersona1.toString());
		
		System.out.println("El tipo de documento es: "+TipoDocumento.LIBRETACIVICA.SelecTipoDoc());
		
		System.out.println(datospersona2.toString());
			

	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	}
	
}

class Persona{
	
    enum TipoDocumento{
    	
    	DNI("dni"), LIBRETACIVICA("lc");
    	
    private TipoDocumento(String tipodoc) {
    	
    	this.tipodoc=tipodoc;
    }
   
    public String SelecTipoDoc() {
    	
    	return tipodoc;
    	
    }
    
    
    private String tipodoc;
    
    	
   }
    
	private int NroDocumento;
	
	private String Nombre;
	
	private String Apellido;
	
	private Date FechaNacimiento;


	
	@Override
	public String toString() {
		return "Persona [NroDocumento=" + NroDocumento + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", FechaNacimiento=" + FechaNacimiento + "]";
	}

	public Persona(int NroDocumento, String Nombre, String Apellido, Date FechaNacimiento) {
		
		this.NroDocumento=NroDocumento;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.FechaNacimiento=FechaNacimiento;
	
			
	}

	public int getNroDocumento() {
		return NroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		NroDocumento = nroDocumento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	

}