package NicolasCastroConstructor;

public class Constructor {
	public static void main(String[] args) {
		// Crear Array de usuarios
		Persona usuarios[] = new Persona[4];
		usuarios[0] = new Persona();
		usuarios[1] = new Persona(12345678);
		usuarios[2] = new Persona(12344321, "Pablo");
		usuarios[3] = new Persona(87654321, "Juan", "Rodriguez");
		for (int i = 0; i < usuarios.length; i++) {
			usuarios[i].mostrarDatos();
		}
	}
}