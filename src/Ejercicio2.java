import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número entero");
        int num2 = leer.nextInt();

        System.out.println("El resultado de la suma es: " + (num1 + num2));

    }
}
