import java.sql.SQLOutput;

public class Curso {
    public static void main(String args[]){
        var miVariableCadena = "Karla";
                var miVariableEntera = 20;
                //Probaré a imprimir ambas situaciones apara mostrar dicha diferencia
        System.out.println(miVariableCadena+miVariableEntera);
        //Se imprime directamente después de las instrucciones de entrada
        //Probemos con el sout de las variables con el salto de línea
        System.out.println("\n"+miVariableCadena+miVariableEntera);
        //Funciona de manera adecuada
//Ahora usaré el comando tabulador el cual, genera un espacio.
        System.out.println(miVariableCadena + "\t" + miVariableEntera);
        //Funciona
        //Usaré el comando retroceso "\b" el cual borra los espacios dejados en código
        System.out.println(miVariableCadena + "espacio: \b" + miVariableEntera);
// En este como notamos dejamos un espacio dentro del string donde después de los 2
        //puntos debería de haber un espacio, pero ya no lo hay.
//Probemos a acumular varios de los comandos

        System.out.println(miVariableCadena+ "\n"+"\n" + miVariableEntera);
        System.out.println(miVariableCadena+ "\t"+"\t"+"\t"+"\t"+miVariableEntera);
        System.out.println("Hola, me van a quitar muchas letras \b\b\b\b" + miVariableEntera);
        //Efectivamente, todas son acumulativas y funcionan adecuadamente.

        // USO DE COMILLAS
        //Para usar comillas y dobles comillas lo haremos con:
        //    "\'" Ó "\""     \\
        System.out.println("Nombre de alumna:  " + "\"" + miVariableCadena + "\"");
        //Funciona perfecto, probemos con comillas simples y usando un poco de todos
        //los comandos
        System.out.println("Nombre de alumna: "+ "\b" + "\'"+ "\t"+ miVariableCadena + "\'");
        //Al imprimir puede ser raro, pero todos los comandos funcionan.
        //También podemos usar las comillas simples entre dobles comillas
        System.out.println("'"+miVariableCadena+"'");
        //FIN LECCIÓN
//Nota: IntelliJ recomienda usar las comillas simples dentro de las comillas dobles
        //en lugar de usar el paréntesis invertido y comillas simples
        //Cambio de nombre a Caracteres especiales en Java

    }
}
