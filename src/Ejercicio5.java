import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius");
        double celsius = leer.nextDouble();

        System.out.println("La temperatura en grados Fahrenheit es: " + (celsius * 9/5 + 32 ) + " F");

        leer.close();

    }
}
