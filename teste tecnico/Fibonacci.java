import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int a = 0, b = 1;
            while (b <= numero) {
                if (b == numero) {
                    System.out.println(numero + " pertence à sequência de Fibonacci.");
                    return;
                }
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}