
package ejerciciosr;

import java.util.Scanner;


public class EjercicioN40 {
    public void operation(){
        System.out.println(" *** Ciclos/ While True *** \n");
        while (true){
            Scanner sn = new Scanner(System.in);
            System.out.println("¿Desea continuar?: S/N");
            String SN = sn.nextLine();
            if ("N".equals(SN)){
                System.out.println("El programa a terminado \n");
                break;
            }else{
            }
        }  
    }
}
