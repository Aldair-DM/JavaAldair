import java.util.Scanner; //Uso que se añadió gracias al paso de java.util.

public class Curso {

    public static void main(String args[]) {

        /**
        EJERCICIO SCANNER Y DOCUMENTACIÓN.
        (TODOS LOS SALTOS ("\n") SON ESTÉTICOS).
         **/

        Scanner lector = new Scanner(System.in);
        /*Declaro una variable de tipo "Scanner" la cual tiene el nombre de "lector" y utilizo la estructura "new
        Scanner(System.in);" la cual me da acceso a la consola de escritura mediante Scanner, después de esto me
        sitúo con el cursor encima de la palabra "Scanner" y saldrá una pequeña ventana donde nos va a facilitar
        la opción java.util la cual asigno y de esta forma ya está activa la función Scanner.
         */

        System.out.println("\n");
        //Salto estético de línea.

        System.out.println("Bienvenido a HSBC\n");
        System.out.println("Para crear una cuente ingrese los siguientes datos.\n");
        System.out.println("Nombre(s):");
        //Primero declaro el feed de la empresa junto con las instrucciones y la sección de datos.

        var nombresUsuario = lector.nextLine(); //(PASO 1.0).
        /*Declaro una variable con un nombre relacionado el dato pedido y la igualo a la variable "lector" y añado
        el termino ".nextLine();" el cual hace que el programa no avance hasta que escribamos la información que se
        nos pide. (POR PRACTICIDAD ESTE PASO SE LLAMARÁ "1.0").
         */
                                                 //----//
        /*
        REPETÍ EL PROCESO ANTERIOR PERO SIN DECLARAR OTRA VARIABLE SCANNER, ÚNICAMENTE SEGUÍ LOS MISMOS PASOS
        QUE EN EL PASO "1.0".
         */

        System.out.println("Apellido paterno:");
        var apellidoUno = lector.nextLine();

        System.out.println("Apellido materno:");
        var apellidoDos = lector.nextLine();

        System.out.println("Correo electrónico:");
        var correoEmail = lector.nextLine();

        System.out.println("Número telefónico:");
        var numeroDeTel = lector.nextLine();

        System.out.println("Número de tarjeta a 16 dígitos:");
        var numeroDeTarjeta = lector.nextLine();

        var nombreCompleto = nombresUsuario + " " + apellidoUno + " " + apellidoDos;
        //Hago una variable que contenga todos los datos leídos previamente sobre los nombres para imprimir todo junto.

        System.out.println("\n");

        System.out.println("Bienvenido(a) a HSBC" + " " + "\"" + nombreCompleto + "\"" + " " + "con dirección" + " " +
                "de correo electrónico" +" "+ "\"" + correoEmail + "\"" + "\n" + "te hemos enviado una clave de" +" "+
                "activación vía correo electrónico, la cual tiene vigencia de 5 minutos, te esperamos!.\n");
        /*Hago un mensaje donde confirmo que he recibido todos los datos y con ello mandar una confirmación de cuenta
        mediante el correo electrónico proporcionado por el usuario.
        (Hago uso de "+" para concatenar, " " para hacer espacio entre palabras y "\n" para saltos de linea).
         */

        System.out.println("Número de tarjeta:" + " "+ numeroDeTarjeta + "." + "\n");
        //Imprimo la confirmación del número de tarjeta dado.

        System.out.println("\n");
        System.out.println("HSBC " + "\"" + "Todos los derechos reservados SA de CV 2022." + "\"");
        //Salto de línea estético y copyright de la empresa.

        //FIN.
    }
}

