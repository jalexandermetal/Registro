import java.util.ArrayList;
import java.util.Scanner;
public class Registro {
    public static ArrayList<Estudiante> estudiante=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String opcion;
            do {
                String entrada = sc.nextLine();
                String[] datos = entrada.split("&");
                opcion = datos[0];
                if (opcion.equals("1")) {
                    agregarEstudiante(datos);
                } else if (opcion.equals("2")) {
                    listarEstudiantes();
                }

            } while (!opcion.equals("3"));

    }
    public static void agregarEstudiante(String[] datos){
        String tipo=datos[1];
        String nombre=datos[2];
        String edad=datos[3];
        String programa=datos[4];
        String etnia=datos[5];
        String variable=datos[6];

        if(tipo.equals("Pregrado")){
            Pregrado estud=new Pregrado(nombre, edad, programa, etnia,variable);
            estudiante.add(estud);
        } else if (tipo.equals("Posgrado")) {
            Posgrado estud=new Posgrado(nombre , edad, programa, etnia,variable);
            estudiante.add(estud);
        }
    }
    public static void listarEstudiantes(){
        System.out.println("***Listado de estudiantes***");
        for(Estudiante i: estudiante){
            System.out.println(i);
        }
    }
}
