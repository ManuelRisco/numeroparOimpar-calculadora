import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner mi_numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float numero1 = mi_numero.nextFloat();
        mi_numero.nextLine();
        System.out.println("Ingrese otro numero: ");
        float numero2 = mi_numero.nextFloat();
        mi_numero.nextLine();
        // Calculadora

        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;

        // Eleccion + For + Switch
        
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Que operacion desea realizar? Suma | Resta | Multiplicacion | Division || Salir");
            String eleccion = mi_numero.nextLine().toLowerCase();
            switch (eleccion) {
                case "suma":
                    System.out.println("La suma es: "+suma);
                    break;
                case "resta":
                    System.out.println("La resta es: "+resta);
                    break;
                case "multiplicacion":
                    System.out.println("La multiplicacion es: "+multiplicacion);
                    break;
                case "division":
                    System.out.println("La division es: "+division);
                    break;
                case "salir":
                    System.out.println("Saliendo...");
                    return; // salir del programa
                default:
                    System.out.println("Ingrese una eleccion valida!");
                    break;
            }
        }
         System.out.println("Numero maximo de intentos | Salida automatica");   
        }
}
