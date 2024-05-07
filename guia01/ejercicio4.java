import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("La temperatura equivalente en grados Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}
