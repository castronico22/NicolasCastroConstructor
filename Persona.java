package NicolasCastroConstructor;

public class Persona {
	// Definir propiedades del objeto Persona
	int dni;
	String nombre, apellido;

	// Crear Constructores
	public Persona() {
		System.out.println("Creando Persona..");
	}

	public Persona(int dni) {
		this.dni = dni;
		System.out.println("Creando Persona " + dni + "..");
	}

	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		System.out.println("Creando Persona " + dni + " " + nombre + "..");
	}

	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Creando Persona " + dni + " " + nombre + " " + apellido + "..");
	}

	// Crear metodo para mostrar datos del objeto Persona
	public void mostrarDatos() {
		if (this.apellido == null && this.nombre == null && this.dni == 0) {
			System.out.println("El objeto sin datos fue creado");
		} else if (this.apellido == null && this.nombre == null) {
			System.out.println("El objeto " + dni + " fue creado");
		} else if (this.apellido == null) {
			System.out.println("El objeto " + dni + " " + nombre + " fue creado");
		} else {
			System.out.println("El objeto " + dni + " " + nombre + " " + apellido + " fue creado");
		}
	}
}