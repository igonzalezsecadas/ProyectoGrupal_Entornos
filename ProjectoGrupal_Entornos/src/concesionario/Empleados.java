package concesionario;

public class Empleados {
	
	
		    private String nombre;
		    private String dni;
		    private String direccion;
		    
		    public Empleados() {
		        nombre = "";
		        dni = "";
		        direccion="";
		    }

		    // Constructor con parámetros
		    public Empleados(String nombre, String dni, String direccion) {
		        this.nombre = nombre;
		        this.dni = dni;
		        this.direccion=direccion;
		    }


}
