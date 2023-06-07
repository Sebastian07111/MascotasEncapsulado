import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mascota> listaMascotas = new ArrayList<>();
		Mascota mascota1 = new Mascota();
		mascota1.setNombre("Max");
		mascota1.setEspecie("Perro");
		mascota1.setEdad(3);
		listaMascotas.add(mascota1);
		Mascota mascota2 = new Mascota();
		mascota2.setNombre("Luna");
		mascota2.setEspecie("Gato");
		mascota2.setEdad(2);
		listaMascotas.add(mascota2);
		Mascota mascota3 = new Mascota("Paco", "Perro", 4);
		listaMascotas.add(mascota3);

		for (Mascota mascota : listaMascotas) {
			System.out.println("Nombre: " + mascota.getNombre());
			System.out.println("Especie: " + mascota.getEspecie());
			System.out.println("Edad: " + mascota.getEdad());
			System.out.println("---------------------------");
			}

	}

}
