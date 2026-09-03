import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");

        String texto = scanner.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {

            textoInvertido = textoInvertido + texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);

        scanner.close();
    }
}