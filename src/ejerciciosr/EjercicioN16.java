
package ejerciciosr;

import java.util.Scanner;


public class EjercicioN16 {
    public void operation(){
        Double H, Ca, Co, C1, C2;
        System.out.println(" *** Hipotenusa de un triangulo *** \n");
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto adyacente (primer cateto): ");
        Ca = Entrada.nextDouble();
        System.out.println("Ingrese el valor del cateto opuesto (segundo cateto): ");
        Co = Entrada.nextDouble();
        H = Math.sqrt((Math.pow(Ca, 2))+ Math.pow(Co, 2));
        System.out.println("La Hipotenusa del triangulo es: H = La raiz cuadrada de ("+Ca+"u"+" al cuadrado"+" + "+Co+"u"+" al cuadrado)" );
        System.out.println("Por lo tanto la Hipotenusa de triangulo equivale a: " +H+"u"+"\n" );
    }
}
