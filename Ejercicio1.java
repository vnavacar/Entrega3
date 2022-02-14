import java.util.*;
public class Ejercicio1 {
  public static void main(String[] args) {

    //int temperatura;

    System.out.println("introducir temperatura: ");
    Scanner teclado=new Scanner(System.in);
    int temperatura=teclado.nextInt();
    teclado.close();
            //temperatura = Integer.parseInt(in.readline());
            if(temperatura < 2){
              System.out.println("Riesgo de hielo");

            }
  }
}
