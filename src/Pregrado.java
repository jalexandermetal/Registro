public class Pregrado extends  Estudiante{
    //Atributo
    public String cantidad_creditos;


    //constructor

    public Pregrado(String nombre, String edad, String programa, String etnia, String cantidad_creditos) {
        super(nombre, edad, programa, etnia);
        this.cantidad_creditos = cantidad_creditos;
    }


    @Override
    public String toString() {
        return "\t\nEstudiante Pregrado" +
                "\t\nNombre:"+ nombre +
                "\t\nEdad:"+ edad + " anios" +
                "\t\nPrograma:"+ programa +
                "\t\nEtnia:"+ etnia +
                "\t\nCreditos Aprobados: '" + cantidad_creditos;
    }
}
