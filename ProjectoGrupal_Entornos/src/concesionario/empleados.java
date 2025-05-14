package concesionario;

public class empleados {
	
	
		    private String nombre;
		    private String dni;
		    private int tamaño;

		    public empleados() {
		        nombre = "";
		        dni = "";
		        tamaño = 0;
		    }

		    // Constructor con parámetros
		    public empleados(String nombre, String dni, int tamaño) {
		        this.nombre = nombre;
		        this.dni = dni;
		        this.tamaño = tamaño;
		    }


}
