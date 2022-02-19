import java.util.*;

public class Ejercicio4 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    String carne = "1";
        int peso;
        String modo="";
        int tiempo=0;
        
        System.out.println("¿Tipo de carne? (1: Vacuno |  2: Cordero)");
        int c = 0;
        while (c == 0) {
            String eleccion = teclado.next();
            switch (eleccion) {
                case "1":
                    carne = "Vacuno";
                    c = 1;
                    break;

                case "2":
                    carne = "Cordero";
                    c = 1;
                    break;
                default:
                    System.out.println("No válido");
                    break;
            }
        }
        System.out.println(carne);
        System.out.println("¿Modo de cocción?\n 1: Casi cruda | 2: Al punto | 3: Bien hecha");
        while (c == 1) {
            String eleccion2 = teclado.next();
            switch (eleccion2) {
                case "1":
                    modo = "Poco"; c=0;
                    break;
                case "2":
                    modo = "Punto"; c=0;
                    break;
                case "3":
                    modo = "Hecho"; c=0;
                    break;
                default:
                    break;
            }
        }
        System.out.println("¿Peso de la carne( Gramos)?");
       while(true){
           try{
               peso=teclado.nextInt();
               break;
           }catch(InputMismatchException e){
               teclado.next();
           }
       }
       if(carne.equals("Vacuno")){
           if(modo.equals("Poco")){
               tiempo=((peso*10)/500)*60;
               System.out.println("El tiempo necesario es: " + tiempo + " segundos" );
           }else if(modo.equals("Punto")){
               tiempo=((peso*17)/500)*60;
               System.out.println("El tiempo necesario es: " + tiempo + " segundos" );
           }else{
                tiempo=((peso*25)/500)*60;
               System.out.println("El tiempo necesario es: " + tiempo + " segundos" );
           }
       }else{
            if(modo.equals("Poco")){
               tiempo=((peso*15)/400)*60;
               System.out.println("El tiempo necesario es: " + tiempo + " segundos" );
           }else if(modo.equals("Punto")){
               tiempo=((peso*25)/400)*60;
               System.out.println("El tiempo necesario es: " + tiempo + " segundos" );
           }else{
                tiempo=((peso*40)/400)*60;
               System.out.println("El tiempo necesario es: " + tiempo + " segundos" );
           }
       }
  }
}