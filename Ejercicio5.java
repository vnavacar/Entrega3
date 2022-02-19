import java.util.*;
public class Ejercicio5 {
  public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        System.out.println("Apellido de la persona?");
        String apellido = teclado.next();
        System.out.println("Nombre de la persona?");
        String nombre = teclado.next();
        String puesto = "";
        System.out.println("¿Puesto que ocupa?");
        int n = 0;
        while (n == 0) {
            String eleccion = teclado.next();
            switch (eleccion) {
                case "1":
                    puesto = "Agente de Servicio";
                    n = 1;
                    break;
                case "2":
                    puesto = "Empleado de oficina";
                    n = 1;
                    break;
                case "3":
                    puesto = "Directivo";
                    n = 1;
                    break;
                default:
                    break;

            }
        }
        System.out.println("Horas trabajadas?:");
        int horas;
        while (true) {
            try {
                horas = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        System.out.println("¿Tarifa horaria?");
        int tarifa;
        while (true) {
            try {
                tarifa = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        int hijos;
        while (true) {
            try {
                hijos = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        int bruto = 0;
        if (horas > 180) {
            bruto += tarifa * 169;
            bruto += (horas - 169) * ((50 * tarifa) / 100);
            bruto += (horas - 180) * ((60 * tarifa) / 100);
        }
        if (horas > 160 && horas < 180) {
            bruto += tarifa * 169;
            bruto += (horas - 169) * ((50 * tarifa) / 100);
        }
        if (horas < 169) {
            bruto = horas * tarifa;
        }
  }
}