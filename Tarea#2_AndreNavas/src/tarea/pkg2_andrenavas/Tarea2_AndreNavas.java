/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2_andrenavas;
import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class Tarea2_AndreNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Esta línea crea un objeto Scanner llamado input, que se utiliza para leer la entrada del usuario desde la consola.
        
        int retorno=0;
        //Se declara e inicializa una variable llamada retorno con el valor 0. Esta variable se utiliza más adelante en un 
        //bucle while para controlar si el usuario desea salir del programa o volver al menú.
        while (retorno==0){ //Esto inicia un bucle while que continuará ejecutándose mientras la variable retorno tenga el valor 0. 
            //Dentro de este bucle se encuentra el menú interactivo.
        System.out.println("*Bienvenido al programa*");
        System.out.println("--------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Replace");
        System.out.println("2. Factorial ");
        System.out.println("3. Mensajes");
        System.out.println("4. Promedios");
        System.out.println("5. Aprovado y Reprobados");
        System.out.println("6. Contains");
        int  menu=input.nextInt();
        //Impresión del menú
        switch (menu) { //esto lo hizo para el menu dependiendo la opción que ingrese el usuario sera dirigido ha uno de los siguientes case
            case 1: {
                System.out.print("Ingrese la cadena: "); 
                String cadenaOriginal = input.nextLine();//leo cadena como string
                cadenaOriginal=input.nextLine(); //salto de linea para que no se pegue, y mas adelante puede leer,es necesaria esta linea aunque parezca
                //lo contrario sino va ver una confusion en el siguiente string que lea
                System.out.print("Ingrese el carácter a reemplazar: ");
                char caracterAntiguo = input.nextLine().charAt(0); //Lee la línea ingresada por el usuario y toma el primer carácter de esa línea.
                //Esto asume que el usuario ingresará solo un carácter.
                System.out.print("Ingrese el nuevo carácter: "); 
                char nuevoCaracter = input.nextLine().charAt(0);
                // Lee la línea ingresada por el usuario y toma el primer carácter de esa línea, 
                //que será el nuevo carácter a utilizar en el reemplazo.
                // Llamar al método y mostrar el resultado
                String resultado = Remplazo(cadenaOriginal, caracterAntiguo, nuevoCaracter);
                System.out.println("Resultado: " + resultado);
                // retorno al menu 
                System.out.println("Desea volver al menu 0.Si o 1.No: ");
                retorno=input.nextInt(); //si desea volver al menu principal si/no
                break;} //termino case 
            case 2: { //según la opci+on ingresada por el usuario 
                // Pedir al usuario que ingrese un número
                System.out.print("Ingrese un número para calcular su factorial: ");
                int numero = input.nextInt();

                // Calcula el factorial para mostrarlo en la pantalla
                long factorial = calcularFactorial(numero); //lo mismo que int pero mas grande el valor
                System.out.println("El factorial de " + numero + " es: " + factorial); //leo numero y factorial
                // retorno al menu 
                System.out.println("Desea volver al menu 0.Si o 1.No: ");
                retorno=input.nextInt(); //retorno
                break;}
            case 3: { 
                System.out.println("Ingrese texto deseado: ");
                String texto=input.nextLine();
                texto=input.nextLine();
                imprimirEnPantalla(texto);
                //retorno al menu 
                System.out.println("Desea volver al menu 0.Si o 1.No: ");
                retorno=input.nextInt();
                break;}
            case 4: {
                // Llamar al método para calcular el promedio
                double promedio = calcularPromedio();
                // Imprimir el resultado en pantalla
                System.out.println("El promedio de las 4 notas es: " + promedio);
                // rotorno al menu
                System.out.println("Desea volver al menu 0. Si o 1. No: ");
                retorno=input.nextInt();
                break;}
            case 5: {
                // Pedir al usuario que ingrese la nota del alumno
                System.out.print("Ingrese la nota del alumno: ");
                int nota = input.nextInt();
                // Llamar al método y obtener el resultado
                boolean aprobado = esAprobado(nota);

                // Imprimir el resultado en pantalla
                if (aprobado) {
                    System.out.println(" Aprobado ");
                } else {
                    System.out.println(" Reprobado ");
                }
                // retorno al menu 
                System.out.println("Desea volver al menu 0. Si 1. No: ");
                retorno=input.nextInt();
                break;}
            case 6: {
                 System.out.print("Ingrese la cadena principal: ");
                 String cadenaPrincipal = input.nextLine();
                 cadenaPrincipal= input.nextLine();
                 // Pedir al usuario que ingrese la subcadena a buscar
                 System.out.print("Ingrese la subcadena a buscar: ");
                 String subcadena = input.nextLine();

                // Llamar al método y obtener el resultado
                boolean contieneSubcadena = contain(cadenaPrincipal, subcadena);

                // Imprimir el resultado en pantalla
                if (contieneSubcadena) {
                    System.out.println("La cadena principal contiene la subcadena.");
                } else {
                    System.out.println("La cadena principal no contiene la subcadena.");
                }
                System.out.println("Desea volver al menu 0.Si o 1.No: ");
                 retorno =input.nextInt();
                break;}
            case 0: {
                retorno=1;
            break;}
        }
        /*
         Esto es como un ciclo donde uno tiene diferentes caminos a tomar,
        //que son los case, la funcion del swicth es poner la condición como si
        //fuera un if, el break sirve para terminar el ciclo (en otras palabras 
        //terminar con el caso y no seguir adelante.La condición se pone adentro
        // de los parentesis. 
        */  
        }
    }
    public static double calcularPromedio() {
        
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las 4 notas
        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Ingrese la nota 4: ");
        double nota4 = scanner.nextDouble();
        // Calcula el promedio de  nota
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        // Retornar el promedio
        return promedio;
    }
    
     public static boolean esAprobado(int nota) {
        // Verificar si la nota es mayor o igual a 60
        if (nota >= 60) {
            return true; // El alumno aprobó
        } else {
            return false; // El alumno reprobó
        }
    }
     
      public static long calcularFactorial(int n) {
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1; // Retornar un valor indicando un error o resultado no válido
        }
            long resultado = 1;
        // Calcular el factorial utilizando un bucle
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
      public static String Remplazo(String cadena, char caracterAntiguo, char nuevoCaracter) {
        int index = cadena.indexOf(caracterAntiguo);
        // Realizar el reemplazo mientras se encuentre el carácter a reemplazar
        while (index != -1) {
            // hace la nueva cadena antes del que va reemplazar
            String parteAnterior = cadena.substring(0, index);
            // hace la nueva cadena después del que va reemplazar
            String partePosterior = cadena.substring(index + 1);
            // Une ambas partes con el nuevo carácter
            cadena = parteAnterior + nuevoCaracter + partePosterior;
            // Busca la siguientes del carácter a reemplazar
            index = cadena.indexOf(caracterAntiguo);
        }

        return cadena;
    }
      public static boolean contain(String cadenaPrincipal, String subcadena) {
        // Obtiene la longitud de la subcadena
        int longitudSubcadena = subcadena.length();

        // Itera sobre la cadena principal
        for (int i = 0; i <= cadenaPrincipal.length() - longitudSubcadena; i++) {
            // Extrae una subcadena de la longitud de la subcadena a buscar
            String subcadenaActual = cadenaPrincipal.substring(i, i + longitudSubcadena);

            // Verifica si la subcadena actual es igual a la subcadena a buscar
            if (subcadenaActual.equals(subcadena)) {
                return true; // Se encontró la subcadena
            }
        }

        // Si no se encontró la subcadena después de recorrer toda la cadena principal
        return false;
    }
       public static void imprimirEnPantalla(String texto) {
        
           // Imprimir la cadena en pantalla
           System.out.println(texto);
    }
}


   
