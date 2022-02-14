import java.util.*;
public class Ejercicio3 {
  public static void main(String[] args) {

    //int temperatura;

    System.out.println("introducir mes en numero: ");
    Scanner teclado=new Scanner(System.in);
    int temperatura=teclado.nextInt();
    teclado.close();
            //temperatura = Integer.parseInt(in.readline());
    switch(temperatura){
            case 1:
      System.out.println("Mes: Enero ");
      break;
            case 2:
      System.out.println("Mes:Febrero   ");
      break;
            case 3:
      System.out.println("Mes:Marzo   ");
      break;
            case 4:
      System.out.println("Mes:Abril   ");
      break;
            case 5:
      System.out.println("Mes:Mayo   ");
      break;
            case 6:
      System.out.println("Mes: Junio  ");
      break;
            case 7:
      System.out.println("Mes: Julio  ");
      break;
            case 8:
      System.out.println("Mes:Agosto   ");
      break;
            case 9:
      System.out.println("Mes: Septiembre  ");
      break;
            case 10:
      System.out.println("Mes:Octubre   ");
      break;
            case 11:
      System.out.println("Mes: Noviembre  ");
      break;
            case 12:
      System.out.println("Mes: Diciembre  ");
      break;
      default:
      System.out.println("Eso no es un mes");
      break;
    }
  }
}
