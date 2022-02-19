import java.util.*;
public class Ejercicio5 {
  public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        System.out.println("Apellido de la persona?");
        String apellido = teclado.next();
        System.out.println("Nombre de la persona?");
        String nombre = teclado.next();
        String puesto = "";
        System.out.println("¿Puesto que ocupa?\n1:Agente de servicio\n2:Empleado de oficina\n3:Directivo");
    
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
        int horasBase = 0;
        int horas50 = 0;
        int horas60 = 0;
        if (horas > 180) {
            horasBase = 169;
            horas50 = horas - 160;
            horas60 = horas - 180;
            bruto += tarifa * horasBase;
            bruto += (horas50) * ((50 * tarifa) / 100);
            bruto += (horas60 - 180) * ((60 * tarifa) / 100);
        }
        if (horas > 169 && horas < 180) {
            horasBase = 169;
            horas50 = horas - 169;
            bruto += tarifa * horasBase;
            bruto += horas50 * ((50 * tarifa) / 100);
        }
        if (horas < 169) {
            horasBase = horas;
            bruto = horasBase * tarifa;
        }
    int primaFamiliar=0;
        if (hijos > 2) {
            primaFamiliar = 70 + (20 * hijos);
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos == 1) {
            primaFamiliar = 20;
        }
        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.println("Estado: " + puesto);
        System.out.println("Salario bruto: " + bruto + "€\n" + horasBase + " horas sin incremento");
        System.out.println(horas50 + " horas con incremento del 50%");
        System.out.println(horas60 + " horas con incremento del 60%");
        System.out.println("Cálculo de deducciones: ");
        double social =  ((bruto * 3.49) / 100);
        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible\n " + bruto + "€" + " x 3.49% = " + social + "€");
        double noImponible =  ((bruto * 6.15) / 100);
        System.out.println("Contribución de contingencias comunes no imponible");
        System.out.println(bruto + "€ x 6.15% = " + noImponible + "€");
        double medico =  ((bruto * 0.95) / 100);
        System.out.println("Seguro médico");
        System.out.println(bruto + "€ x 0.95% = " + medico + "€");
        double pensiones =  ((bruto * 8.44) / 100);
        System.out.println("Fondo de pensiones");
        System.out.println(bruto + "€ x 8.44% = " + pensiones + "€");
        double desempleo =  ((bruto * 3.05) / 100);
        System.out.println("Seguro de desempleo");
        System.out.println(bruto + "€ x 3.05% = " + desempleo + "€");
        double pComplementaria =  ((bruto * 3.81) / 100);
        System.out.println("Pensión complementaria(Entidad privada)");
        System.out.println(bruto + "€ x 3.81% = " + pComplementaria + "€");
          double jubilacion =  ((bruto * 1.02) / 100);
          System.out.println("Contribución de jubilación anticipada");
          System.out.println(bruto + "€ x 1.02% = " + jubilacion + "€");
          double total=social+noImponible+medico+pensiones+desempleo+pComplementaria+jubilacion;
          System.out.println("Deducciones totales de los empleados: " + total+"€");
          double neto=bruto-total;
          System.out.println("Salario neto: " + neto + "€");
          double netoFinal=neto+primaFamiliar;
          System.out.println("Prima familiar: " + primaFamiliar + "€");
          System.out.println("Salario neto a pagar: " + netoFinal + "€");
  }
}