public class Curso {
    public static void main(String args[]){
        //Ahora trabajaré con una variable de tipo String.
        //Now i will use a String Type variable.
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        //Tarea: Darle un nuevo valor a la variable y diga adios.
        //HW: Change the String variable value into Goodbye.
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        //Éxito.
        //Success.

        /**Aqui haré un punto y aparte respecto al código anterior
         *
         */
//Variable de tipo var se refiere a que se dará por hecho el tipo se variable que
        //estemos usando según el valor que le demos, ya sea String, float o int.

        /**Definimos la variable
         *
         */
        var miVariableVar = 15;
        System.out.println(miVariableVar);
        //Tarea escribir mi variable var 2 en forma de string e imprimirlo
        var miVariableVar2 = "Soy una variable String reconocida mediante var";
        System.out.println(miVariableVar2);
        System.out.println("miVariableVar2 = " + miVariableVar2);
        //En esa última variable lo que hicimos fue usar el comando soutv
        //el cual va a generar ese atajo en el que escribirá el nombre de la variable
        //y el valor de la misma y la inferencia es a partir de la versión 9 de jdk
        //en adelante.
    }
}
