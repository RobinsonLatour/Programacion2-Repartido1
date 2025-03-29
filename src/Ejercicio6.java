import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese precio en pesos del primer producto");
        double producto1 = leer.nextDouble();

        System.out.println("Ingrese precio en pesos del segundo producto");
        double producto2 = leer.nextDouble();

        System.out.println("Ingrese precio en pesos del tercer producto");
        double producto3 = leer.nextDouble();

        double subTotal = producto1 + producto2 + producto3;
        double iva = 22 * subTotal / 100;
        double totalFinal = subTotal + iva;

        System.out.println("El total final es de: " + totalFinal + " Pesos");

        leer.close();

    }
}
