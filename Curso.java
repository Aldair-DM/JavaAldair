import java.util.Scanner;

public class Curso {
    public static void main(String args[]){
        //CLASE SCANNER
        //CAPTURAR INFORMACIÓN DINÁMICA
        //Definiré una variable con cualquier valor y mando a imprimir
        var usuario = "Carlos";
        System.out.println(usuario);
        System.out.println("usuario = " + usuario);
        //Esto es información estática, pero si queremos que un usuario escriba
        //y guarde su info usaremos la clase Scanner.
        //Definiré, usaré e importaré la clase Scanner
        Scanner miVariableScanner = new Scanner(System.in);
        //Definí e importé la clase Scanner exitosamente.

        //Ahora haré uso de la instrucción ".nextLine()", después del valor de mi
        //nueva variable para permitir que se lea más veces y que el programa
        //no avance hasta escribir algo, pero antes pondré la instrucción necesaria.

        
        //Scanner miVariableScanner = new Scanner(System.in); //Adjuntada arriba
        System.out.println("Escribe tu nombre de usuario: ");
        var miUsuario = miVariableScanner.nextLine();
        //Ahora después de recibir la información voy a imprimir a la variable 
        //con el valor que el usuario haya asignado.
        //System.out.println("Usuario = " + miUsuario + " " + "Bienvenido");
        //La variable debería correr desde aquí, pero la moví más abajo para
        //que se impriman la variable "usuario" y edad una vez dada la información.
        //Funcionó perfecto, estamos orgullosos de nosotros:D

        //Por probar haré mi propia prueba. //(Moví la variable de impresión vista
        //en clase a mi prueba persona (impresión de la variable miUsuario).

        Scanner miVariableEdad = new Scanner(System.in); //Declaro la nueva variable
        //que también va a escanear.
        System.out.println("Edad: "); //Mando a pedir el dato mediante instrucción soutln
        var miEdad = miVariableEdad.nextLine(); //Asigno a mi variable a
        // leer un nombre
        //(Moví la instrucción de impresión de la variable "usuario" aquí para que
        //se impriman ambos datos una vez dados y no uno por uno
        System.out.println("Usuario = " + miUsuario + " " + "Bienvenido");
        System.out.println("Edad: " + miEdad + " " + "años.");
        //Una vez obtuve los datos entonces la mando a imprimir con unas cosas extra
        // para así complementar.
        //Éxito.
        //Cometí un error por adelantarme y es que la primera variable de Scanner
        //es conveniente ponerle un nombre universal como Consola o Lector, ya que
        //podemos reutilizarla únicamente asignando otro nombre después de ya haber
        //leído algún dato previo por lo cual no es útil asignar una segunda variable
        //de tipo Scanner cuando ya tenemos una.

        //FIN CLASE SCANNER


        



    }
}
