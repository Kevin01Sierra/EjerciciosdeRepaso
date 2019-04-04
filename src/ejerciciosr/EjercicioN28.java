
package ejerciciosr;

import java.util.Scanner;

public class EjercicioN28 {
    public void operation(){
        int X;
        System.out.println(" *** Condicionales / Dias de la semana *** \n");
        while (true){
            Scanner Ent = new Scanner(System.in);
            System.out.println("Digite un numero del 1 al 7 para saber a qué dia de la semana corresponde: ");
            X = Ent.nextInt();
            if (X == 1){
                System.out.println("El numero #"+X+" es = al dia Lunes \n");
                break;
            }if (X == 2){
                System.out.println("El numero #"+X+" es = al dia Martes \n");
                break;
            }if (X == 3){
                System.out.println("El numero #"+X+" es = al dia Miercoles \n");
                break;
            }if (X == 4){
                System.out.println("El numero #"+X+" es = al dia Jueves \n");
                break;
            }if (X == 5){
                System.out.println("El numero #"+X+" es = al dia Viernes \n");
                break;
            }if (X == 6){
                System.out.println("El numero #"+X+" es = al dia Sabado \n");
                break;
            }if (X == 7){
                System.out.println("El numero #"+X+" es = al dia Domingo \n");
                break;
            }else{
                System.out.println("Por favor digite un numero del 1 al 7: ");
            }
        }
        
    }
}
