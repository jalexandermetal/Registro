public class Posgrado extends Estudiante {
    public String modalidad;

    public Posgrado(String nombre, String edad, String programa, String etnia, String modalidad) {
        super(nombre, edad, programa, etnia);
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return  "\t\nEstudiante Posgrado" +
                "\t\nNombre:"+ nombre +
                "\t\nEdad:"+ edad + " anios" +
                "\t\nPrograma:"+ programa +
                "\t\nEtnia:"+ etnia +
                "\t\nModalidad " + modalidad;
    }
}
