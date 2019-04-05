
package ejerciciosr;

import java.util.Scanner;


public class EjercicioN46 {
    public void operation(){
        System.out.println(" *** Calcular la media de los datos *** \n");
        int numero, elementos = 0, suma = 0;
        double media;
        while (true){
           Scanner Entx = new Scanner(System.in);
           System.out.println("Digite un numero positivo: ");
           numero = Entx.nextInt();
           suma += numero;
           elementos ++;
           Scanner Ent = new Scanner(System.in);
           System.out.println("¿Desea ingresar más datos?: S/N");
           String SN = Ent.nextLine();
           if ("N".equals(SN)){
                System.out.println("El programa a terminado \n");
                media = (double) suma/elementos;
                System.out.println("La media de los datos ingresados es: "+media+"\n");
                break;
            }else{        
           }
        }  
    }
}
