import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de los números enteros es:" + suma);

        scanner.close();
    }
}
