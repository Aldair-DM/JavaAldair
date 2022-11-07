import java.util.Scanner;

public class Curso {
    public static void main(String args[]) {
          /*
          CLASE DE REPASO TIPOS DE VARIABLES, CONCATENACIONES, SCANNER ETC...
           */
        //CONCATENACIÓN
        //Definimos las variables
        String miVariableString = "Soy una inferencia de tipo cadena o string";
        int miVariableInt = 10;
        var miVariableVar = "Soy una inferencia de tipo var de texto";
        var miVariableVar2 = 20;

        System.out.println(miVariableString + " " +miVariableInt + " " + miVariableVar + " " + miVariableVar2);

        //Propiedad de la cadena
        System.out.println(miVariableString+ " " + miVariableInt+miVariableVar2);
        //Funcionó correctamente

        //Rompamos la propiedad de la cadena
        System.out.println(miVariableString+(miVariableInt+miVariableVar2));
        /*
        Con el uso del doble paréntesis si se va a efectuar la operación, ya que
        es una regla similar al álgebra donde si lo hacen dentro de los ya mencionados
         */

        //Suma de enteros
        System.out.println(miVariableInt+miVariableVar2);
        //Funcionó

        //Soutv imprime lo siguiente:
        System.out.println("miVariableVar2 = " + miVariableVar2);
        
        //Creación de una variable hibrida con el valor de otras 2
        var miVariableHibrida = miVariableInt+miVariableVar2;
        //Imprimimos con soutv
        System.out.println("miVariableHibrida = " + miVariableHibrida);
        //nice

        //Cambio de valor en variables
        miVariableHibrida = 50;
        //Imprimimos
        System.out.println("miVariableHibrida = " + miVariableHibrida);
        //nice

        /*Caracteres especiales en java Usando ctrl alt más diagonal inversa la obtendremos
        "\".
         */

        //Carácter \n sirve para hacer un salto de línea dentro de una impresión de texto
        var miVariableBrinco = "Brinco";
        System.out.println("miVariableBrinco = \n" + miVariableBrinco + "\n"+ miVariableString);
        //Como vemos, en lugar de imprimirse enfrente lo que se hace es un salto de línea

        //Carácter \t, \b, \' y \"
        var A = "Aldair";
        var B = 20;
        var C = "Años";
        var D = 2002;
        //Haré un pequeño print con todas
        System.out.println("Nombre:\n" + "\"" + A + "\"" + "\n" + "Edad: \b" + "\"" + B + " " + C +
                "\"" + "\n" + "Año de nacimiento:'" + D + "'" + "\t" + "Bienvenido de nuevo.");
        //Funciona perfecto


        /* SCANNER
        Visto lo anterior podemos darle el nombre de código duro o estático
        eso significa que nosotros le estamos dando un valor, pero no es algo
        que pueda cambiar dependiendo el tiempo o persona, scanner se encarga.
        Lo definiremos como una variable de tipo scanner con su nombre y un igual
        más el valor new Scanner(System.in), una vez acabemos eso nos posicionamos en
        el foco o encima de la palabra scanner y le damos en java.util o import ahí
        para que funcione.
         */

        Scanner consola = new Scanner(System.in);
        //Definimos la variable consola de tipo scanner.

        /*Ahora vamos a escribir la indicación a seguir y
        definir una variable que se pueda leer sobre sí misma
        varias veces con diferente información y también bajo otros nombres y
        lo igualaremos al nombre de la variable scanner junto con la propiedad
        .nextLine(); lo cual nos dará el poder para leer muchas cosas.
         */
        System.out.println("Escribe tu nombre:");
        var usuario = consola.nextLine();
        //Debemos escribir info y solo ahí se detendrá el programa
        System.out.println("Bienvenido" + " " + usuario);

        /*metemos otra variable para leer únicamente siguiendo la instrucción
        de poner primero la instrucción luego declarar la variable.
         */

        System.out.println("Escribe tu numero de cuenta:");
        var numeroCuenta = consola.nextLine();
        System.out.println("No.de cuenta:" + numeroCuenta);


        //Tarea: Hacer un ejercicio propio de Scanner.




    }
}

