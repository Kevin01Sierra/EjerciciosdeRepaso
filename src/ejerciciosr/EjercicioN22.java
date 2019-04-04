
package ejerciciosr;

import java.util.Scanner;


public class EjercicioN22 {
    public void operation(){
        Double A, B;
        System.out.println(" *** Conversión a Entero *** \n");
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Inserte un numero, perteneciente al conjunto de los Reales: ");
        A = Entrada.nextDouble();
        int z = A.intValue();
        System.out.println("Inserte un segundo numero, perteneciente al conjunto de los Reales: ");
        B = Entrada.nextDouble();
        int y = B.intValue();
        int C = z/y;
        int r = z%y;
        System.out.println("Suponiendo que "+A+" y "+B+" son numeros racionales, al convertirlos en enteros se expresan como: "+z+" y "+y);
        System.out.println("La división entre "+z+ " y "+y+" la respuesta optenida es (altamente probable) otro numero racional, asi que en exprecion de entero es: " +C);
        System.out.println("Y el residuo en expreción entera de esta división es: "+r+"\n");
    }
}
