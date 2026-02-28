import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<MASCOTAS>lstMascota = new ArrayList<>();

        int op;

        do{
            System.out.println("""
                    1. CREAR OBJETO
                    2. MOSTRAR TODO
                    3. BUSCAR POR NOMBRE
                    """);
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el nombre de la mascota:");
                    String nombre = teclado.nextLine();

                    System.out.println("Ingrese la especie:");
                    String especie = teclado.nextLine();

                    System.out.println("Ingrese la edad:");
                    int edad = Integer.parseInt(teclado.nextLine());

                    System.out.println("Ingrese el peso:");
                    double peso = Double.parseDouble(teclado.nextLine());
                }
                case 2 -> for (MASCOTAS m : MASCOTAS )
                    System.out.println(m);
                case 3 -> String numCod ;
                numCod = teclado.next();



            }



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