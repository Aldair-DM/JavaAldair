import java.util.Scanner;

public class Curso {
    public static void main(String args[]) {
//TAREA DATOS DEL LIBRO
        Scanner miVariableLectura = new Scanner(System.in); //Declaro con Scanner la variable universal de lectura
        //Ahora voy a imprimir la instrucción para el usuario
        System.out.println("Proporciona el título del libro que buscas:");
        //Ahora voy a declarar el nombre de mi variable con la funcionalidad de la variable de lectura universal
        //mediante el uso del nextLine le doy la propiedad de lectura diversa así como de no poder pasar hasta
        //haber escrito algo y esto lo hago 2 veces con 2 variables diferentes de las cuales quiero obtener información
        var miNombreLibro = miVariableLectura.nextLine();
        System.out.println("Autor: ");
        var miNombreAutor = miVariableLectura.nextLine();
        //Por último mando a imprimir extras junto con las variables para darle sentido al texto a imprimir
        System.out.println("El libro" + " " + miNombreLibro + " " + "fue escrito por" + " " + miNombreAutor);
        //ÉXITO y aplicada la corrección de un solo uso de la clase de lectura.
        //FINAL SECCIÓN 2
    }
}

