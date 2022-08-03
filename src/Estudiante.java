public class Estudiante {
    // atributos de la clase
    public String nombre;
    public String edad;
    public String programa;
    public String etnia;



    //constructor
    public Estudiante(String nombre, String edad, String programa, String etnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.etnia = etnia;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ",edad='" + edad + '\'' +
                ",programa='" + programa + '\'' +
                ",etnia='" + etnia + '\'' +
                '}';
    }




}
