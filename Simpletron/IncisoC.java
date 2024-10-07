import java.util.Scanner;

public class IncisoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorFinal, contador = 0, valor, mayor = Integer.MIN_VALUE;

        System.out.print("Introduce el valor final: ");
        valorFinal = sc.nextInt();

        while (true) {
            System.out.print("Introduce un valor (igual al valor final para terminar): ");
            valor = sc.nextInt();

            if (valor == valorFinal) {
                break;
            }

            if (valor > mayor) {
                mayor = valor;
            }

            contador++;
        }

        System.out.println("El valor más grande es: " + mayor);
    }
}
