import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // PEDIR DATOS (forma segura)
        System.out.println("Ingrese el nombre de la mascota:");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese la especie:");
        String especie = teclado.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese el peso:");
        double peso = Double.parseDouble(teclado.nextLine());

        // CREAR OBJETO
        MASCOTAS mascota1 = new MASCOTAS();

        int opcion;

        // MENU
        do {
            System.out.println("\n--- MENU VETERINARIA ---");
            System.out.println("1. Mostrar información");
            System.out.println("2. Alimentar");
            System.out.println("3. Vacunar");
            System.out.println("4. Cumplir años");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:
                    mascota1.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Ingrese cantidad de alimento: ");
                    double cantidad = Double.parseDouble(teclado.nextLine());
                    mascota1.alimentar(cantidad);
                    break;

                case 3:
                    mascota1.vacunar();
                    break;

                case 4:
                    mascota1.cumplirAnios();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        // INFORMACION FINAL
        System.out.println("\n=== ESTADO FINAL DE LA MASCOTA ===");
        mascota1.mostrarInformacion();

        teclado.close();
    }
}