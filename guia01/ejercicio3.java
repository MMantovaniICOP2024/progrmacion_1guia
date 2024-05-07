import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es: " + mayusculas);

        String minusculas = frase.toLowerCase();
        System.out.println("La frase en minúsculas es: " + minusculas);

        scanner.close();
    }
}
