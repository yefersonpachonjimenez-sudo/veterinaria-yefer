public class MASCOTAS {
    //ATRIBUTOS

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private Boolean vacunado;

    //CONTRUCTOR VACIO

    public MASCOTAS() {
    }

    //CONTRUSTOR


    public MASCOTAS(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        vacunado = false;

    }

    // METODO VACUNAR

    public void vacunar() {
        vacunado = true;
        System.out.println("La mascota ha sido vacunada.");
    }

    // METODO ALIMENTAR
    public void alimentar(double cantidad) {
        if (cantidad > 0) {
            peso += cantidad;
            System.out.println("La mascota fue alimentada. Nuevo peso: " + peso);
        } else {
            System.out.println("No se permiten cantidades negativas.");
        }
    }

    // METODO CUMPLIR AÑOS
    public void cumplirAnios() {
        edad++;
        System.out.println("La mascota ahora tiene " + edad + " años.");
    }

    // MOSTRAR INFORMACION
    public void mostrarInformacion() {
        System.out.println("----- INFORMACIÓN DE LA MASCOTA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
    }
}

