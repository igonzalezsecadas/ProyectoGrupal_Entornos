package concesionario;

public class Coches {
	
	private String matricula;
	private float kilomentros;
	private float precio;
	
	public Coches(String matricula, float kilometros, float precio) {
		this.matricula = matricula;
		this.kilomentros = kilometros;
		this.precio = precio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getKilomentros() {
		return kilomentros;
	}

	public void setKilomentros(float kilomentros) {
		this.kilomentros = kilomentros;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Matricula: " + matricula + ", kilometros: " + kilomentros + ", precio: " + precio;
	}
}