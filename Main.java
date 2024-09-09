package ejemploAbstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        EquipoFactory equipoFactory = null;

        System.out.println("Seleccione el equipo:");
        System.out.println("1. Real Madrid");
        System.out.println("2. Barcelona");
        int equipoSeleccionado = entrada.nextInt();

        switch (equipoSeleccionado) {
            case 1:
                equipoFactory = new RealMadridFactory();
                break;
            case 2:
                equipoFactory = new BarcelonaFactory();
                break;
            default:
                System.out.println("Selección no válida.");
                System.exit(0);
        }

        System.out.println("Seleccione el tipo de jugador:");
        System.out.println("1. Delantero");
        System.out.println("2. Defensa");
        int jugadorSeleccionado = entrada.nextInt();

        Jugador jugador = null;

        switch (jugadorSeleccionado) {
            case 1:
                jugador = equipoFactory.crearDelantero();
                break;
            case 2:
                jugador = equipoFactory.crearDefensa();
                break;
            default:
                System.out.println("Selección no válida.");
                System.exit(0);
        }

        jugador.jugar();
        entrada.close();
    }

}
