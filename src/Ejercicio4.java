import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese base del rectangulo en metros");
        double base = leer.nextDouble();

        System.out.println("Ingrese altura del rectangulo en metros");
        double altura = leer.nextDouble();

        System.out.println("El área del rectangulo es de: " + (base * altura) + " metros cuadrados");

        leer.close();

    }
}
