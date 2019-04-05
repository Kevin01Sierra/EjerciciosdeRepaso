
package ejerciciosr;

import java.util.Scanner;


public class EjercicioN52 {
    public void operation(){
        System.out.println(" *** Suma de numeros positivos *** \n");
        double numero, suma = 0;
        for (int i=1; i <= 10; i++){
            Scanner Ent = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            numero = Ent.nextDouble();
            if (numero >0){
                suma += numero;
            }
        }System.out.println("La suma total es : "+suma+"\n");
    }
}
