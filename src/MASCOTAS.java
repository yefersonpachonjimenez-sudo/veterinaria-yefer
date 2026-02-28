public class MASCOTAS {
    //ATRIBUTOS

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private Boolean vacunado;

    //CONSTRUCTOR VACIO

    public MASCOTAS() {
    }
    //

    public MASCOTAS(String nombre, String especie, int edad, double peso, Boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
    }

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "MASCOTAS{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                '}';
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
        System.out.println("\n--- INFORMACIÓN DE LA MASCOTA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
    }

}


