
package ejerciciosr;

import java.util.Scanner;

public class EjercicioN10 {
    public void opration(){
        Double Km, t, cm, cs, v;
        System.out.println(" *** Ejercicio de conversión *** \n");
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la distancia recorrida por el proyectil en Km: ");
        Km = Entrada.nextDouble();
        System.out.println("Ingrese el valor del tiempo en que demora el proyectil en Minutos: ");
        t = Entrada.nextDouble();
        cm = Km * 1000;
        cs = t * 60;
        v = cm / cs;
        System.out.println("La Velocidad del proyectil es: " +v+"m/s \n");
    }
}
