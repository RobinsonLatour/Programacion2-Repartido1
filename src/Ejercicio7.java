import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();

        // Consumir el salto de línea que queda después de nextInt()
        leer.nextLine();

        System.out.println("Ingrese ciudad de residencia");
        String ciudad = leer.nextLine();

        System.out.println("Hola " + nombre + ", tenes " + edad + " años y vivis en " + ciudad);

        leer.close();

    }
}
