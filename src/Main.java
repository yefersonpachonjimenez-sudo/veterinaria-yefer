import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    void main() {

        DecimalFormat of = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        List<MASCOTAS> lstMascota = new ArrayList<>();
        int opc, opc1;

    /*
         CREAR
         MOSTRAR
         BUSCAR
     */
        do {
            System.out.println("""
                        Menu
                            1. Crear
                            2. Mostrar todo
                            3. Buscar por nombre
                            4. Salir
                    """);
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("    Creacion de Objeto");
                    System.out.println("Ingrese el nombre:");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el especie:");
                    String especie = teclado.next();
                    System.out.println("Ingrese el edad:");
                    int edad = teclado.nextInt();
                    System.out.println("Ingrese el peso:");
                    double peso = teclado.nextDouble();
                    lstMascota.add(new MASCOTAS(nombre, especie, edad, peso));
                    break;
                case 2:
                    for (MASCOTAS m : lstMascota) {
                        System.out.println(m.toString());
                    }
                    ;
                    break;
                case 3:

                    System.out.println("Ingrese el nombre a buscar:");
                    String nombreB = teclado.next();
                    MASCOTAS mas1 = null;

                    for (MASCOTAS m : lstMascota) {
                        if (m.getNombre().equalsIgnoreCase(nombreB)) {
                            mas1 = m;
                        }
                    }
                    do {

                        System.out.println("""
                                Submenu
                                    1. Alimentar
                                    2. Vacunar
                                    3. Cumplir Años
                                    4. salir
                                """);
                        opc1 = teclado.nextInt();
                        switch (opc1) {
                            case 1:
                                System.out.println("Ingresa el peso a añadir: ");
                                mas1.Alimentar(teclado.nextDouble());
                                break;
                            case 2:
                                mas1.Vacunar();
                                break;
                            case 3:
                                mas1.CumplirAños();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");
                        }
                        ;
                    } while (opc1 != 4);

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opc != 4);
    }
}