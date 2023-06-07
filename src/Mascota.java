public class Mascota {
// Atributos
	private String nombre;
	private String especie;
	private int edad;

public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Constructor sin parametros
	public Mascota() {
	}

// Constructor con parametros
	public Mascota(String nombre, String especie, int edad) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
	}

// Método para mostrar información de la mascota
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Especie: " + especie);
		System.out.println("Edad: " + edad + " años");
	}

// Método para hacer que la mascota realice un sonido
	public void hacerSonido() {
		if (especie.equalsIgnoreCase("perro")) {
			System.out.println("¡Guau guau!");
		} else if (especie.equalsIgnoreCase("gato")) {
			System.out.println("¡Miau miau!");
		} else {
			System.out.println("La mascota no hace sonidos conocidos.");
		}
	}
}