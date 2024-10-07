import java.util.Scanner;

public class IncisoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int valor;

        while (true) {
            System.out.print("Introduce un valor (negativo para salir): ");
            valor = sc.nextInt();

            if (valor < 0) {
                break;
            }

            suma += valor;
        }

        System.out.println("La suma total es: " + suma);
    }
}
