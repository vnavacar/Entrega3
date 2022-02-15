import java.util.*;
public class Ejercicio1 {
  public static void main(String[] args) {

    //int temperatura;

    System.out.println("introducir temperatura: ");
    Scanner teclado=new Scanner(System.in);
    int temperatura=teclado.nextInt();
    teclado.close();
    
            if(temperatura < 2){
              System.out.println("Riesgo de hielo");

            }
            if(temperatura >= 2 && temperatura <15){
              System.out.println("Hace frio");

            }
            if(temperatura >= 15 && temperatura <30){
              System.out.println("Buena temperatura");

            }
            if(temperatura >= 30){
              System.out.println("Demasiado calor");

            }
  }
}
