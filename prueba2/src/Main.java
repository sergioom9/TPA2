
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce el primer número primo:");
        int numero1 = scanner.nextInt();

        if (esPrimo(numero1)) {
            System.out.println("Número primo válido.");
        } else {
            System.out.println("El número ingresado no es primo.");
            return;
        }

        System.out.println("Por favor, introduce el primer número primo:");
        int numero2 = scanner.nextInt();

        if (esPrimo(numero2)) {
            System.out.println("Número primo válido.");
        } else {
            System.out.println("El número ingresado no es primo.");
            return;
        }

        int suma = numero1 + numero2;
        System.out.println("La suma de los números primos es: " + suma);

        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

