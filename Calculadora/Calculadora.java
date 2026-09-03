import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        int opcion;

        System.out.println("=== CALCULADORA ===");

        System.out.print("Ingrese el primer numero: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = scanner.nextDouble();

        System.out.println("\nSeleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        System.out.print("Opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:

                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }

                break;

            default:
                System.out.println("Opcion no valida.");
        }

        scanner.close();
    }
}