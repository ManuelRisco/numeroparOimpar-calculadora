import java.util.Scanner;

public class ejercicio{
    public static void main(String[] args) {
        Scanner mi_numero = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = mi_numero.nextInt();
        mi_numero.nextLine();
        int almacenador = numero%2;
        System.out.println("El numero es: "+(almacenador==0 ? " Es par" : " Es impar")); 
    }
}