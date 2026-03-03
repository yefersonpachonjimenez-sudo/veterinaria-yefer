public class MASCOTAS {
    //ATRIBUTOS

        //Atributos
        private String nombre;
        private String especie;
        private int edad;
        private double peso;
        private boolean vacuna;

        //Constructor vacio
        public MASCOTAS(){
        }

        //Constructor
        public MASCOTAS(String nombre, String especie, int edad, double peso) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
            this.peso = peso;
            this.vacuna = false;
        }

        //Set and Get

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

        public boolean isVacuna() {
            return vacuna;
        }

        public void setVacuna(boolean vacuna) {
            this.vacuna = vacuna;
        }

        //To string

        @Override
        public String toString() {
            return "Mascota\n" +
                    "   Nombre: " + nombre + '\n' +
                    "   Especie: " + especie + '\n' +
                    "   Edad: " + edad + '\n' +
                    "   Peso: " + peso + '\n' +
                    "   Vacuna: " + vacuna;
        }

        //Metodos

        public boolean Vacunar(){
            vacuna=true;
            return true;
        }
        public void Alimentar(double cantidad){
            if (cantidad<=0){
                System.out.println("Cantidad digitada negativa: ");
            }else {
                this.peso = this.peso + cantidad;
            }
        }
        public void CumplirAños(){
            edad++;
        }
        public String MostrarInformacion() {
            return "Mascota\n" +
                    "   Nombre: " + nombre + '\n' +
                    "   Especie: " + especie + '\n' +
                    "   Edad: " + edad + '\n' +
                    "   Peso: " + peso + '\n' +
                    "   Vacuna: " + vacuna;
        }
    }

