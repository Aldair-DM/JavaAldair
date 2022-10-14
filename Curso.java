public class Curso {
    public static void main(String args[]){
        /**
         * CONCATENACIÓN DE CADENAS
         */
        //Usando var con inferencia de tipos vamos a definir 2 variables las cuales
        //vamos a concatenar
        var miVariable1 = "Hola Usuario numero";
        var miVariable2 = 25;
        System.out.println(miVariable1 + miVariable2);
        //Debajo voy a definir una nueva variable la cual automáticamente va a
        //sumar ambas variables y de esa forma solo imprimiré una sola variable
        var miVariableUnion = miVariable1+miVariable2;
        System.out.println(miVariableUnion);
        //Ahora imprimiré la variable unión con su valor
        System.out.println("miVariableUnion = " + miVariableUnion);
        //Ahora meteré un comando nuevo para crear espacio" "entre la concatenación

        miVariableUnion= miVariable1 + " " + miVariable2;
        System.out.println(miVariableUnion);
//Aquí volví a asignar valor a la Variable union con el cambio de las comillas para
        //asi generar un espacio y al final la imprimí
        //De esta forma ya concatenamos una variable entera y una variable string
        /**
         * Operaciones de variables de tipo entero y concatenación
         */
       var A = 5;
       var B = 6;
        System.out.println(A+B);
        //En la línea de arriba concatené mediante signo más ambas variables
        //lo cual da como resultado la suma de sus valores y ahora lo haré con
        //los otros símbolos de operación * / -.
        System.out.println(A-B);
        //Funcionó
        System.out.println(A*B);
        System.out.println(A/B);
        //En este punto me dio 0 por lo cual voy a aumentar el valor de alguna
        //variable "A" con el fin de que tenga más cantidad sobre la cual se va a
        //dividir.
        A = 30;
        System.out.println(A/B);
        //Efectivamente, podemos aumentar el numero y que de esta forma no nos de
        //0.
        System.out.println(A+B+miVariableUnion);
        //En esta variable lo que hice fue concatenar 2 variables enteras que se
        //van a sumar y luego se les va a sumar la variable unión que consta de
        //una previa concatenación de variable entera con string entonces eso se
        //verá impresa con una suma de la variable A y B y se va a concatenar con unión
        //Corrió perfectamente.
        /**
         * CONTEXTO CADENA
         */
        //Ahora empezaré de izquierda a derecha, pero iniciaré con una cadena
        //para que actúe la regla contexto cadena de izquierda a derecha y únicamente
        //se impriman los números sin interactuar de manera operacional
        System.out.println(miVariable1 + A + B);
        //Éxito
        /**
         * EVITAR CONTEXTO CADENA
         */
        //Evitaré el contexto cadena escribiendo las enteras dentro un paréntesis
        //extra dentro del print
        System.out.println(miVariable1+(A+B));
        //Funciona.
        //Significa que los paréntesis cambian la prioridad de lo que se va a generar.
        //FinClase


        
    }
}
