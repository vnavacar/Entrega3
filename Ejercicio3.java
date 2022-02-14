import java.util.*;
public class Ejercicio1 {
  public static void main(String[] args) {

    //int temperatura;

    System.out.println("introducir mes en numero: ");
    Scanner teclado=new Scanner(System.in);
    int temperatura=teclado.nextInt();
    teclado.close();
            //temperatura = Integer.parseInt(in.readline());
    switch(temperatura){
            case 1:
      System.out.println("Mes:   ");
      break;
            case 2:
      System.out.println("Mes:   ");
      break;
            case 3:
      System.out.println("Mes:   ");
      break;
            case 4:
      System.out.println("Mes:   ");
      break;
            case 5:
      System.out.println("Mes:   ");
      break;
            case 6:
      System.out.println("Mes:   ");
      break;
            case 7:
      System.out.println("Mes:   ");
      break;
            case 8:
      System.out.println("Mes:   ");
      break;
            case 9:
      System.out.println("Mes:   ");
      break;
            case 10:
      System.out.println("Mes:   ");
      break;
            case 11:
      System.out.println("Mes:   ");
      break;
            case 12:
      System.out.println("Mes:   ");
      break;
      default:
      System.out.println("Eso no es un mes");
      break;
    }
  }
}
