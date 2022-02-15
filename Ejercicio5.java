import java.util.*;
public class Ejercicio5 {
  public static void main(String[] args) {
String tipo;

    Scanner teclado=new Scanner(System.in);
    System.out.println("Apellido de la persona?");
    String Apellido=teclado.nextLine();
    System.out.println("Nombre de la persona?");
    String Nombre=teclado.nextLine();
    
    System.out.println("Puesto? 1:Agente de servicio 2:Empleado de oficina 3:Directivo");
    int puesto=teclado.nextInt();

    System.out.println("Horas trabajadas?:");
    int horas=teclado.nextInt();

    System.out.println("Tarifa horaria?:");
    double tarifa=teclado.nextDouble();

    System.out.println("Numero de hijos?");
    int hijos=teclado.nextInt();
  }
}