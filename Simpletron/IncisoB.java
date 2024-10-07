import java.util.Scanner;

public class IncisoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        int valor;

        while (true) {
            System.out.print("Introduce un valor (0 para terminar): ");
            valor = sc.nextInt();

            if (valor == 0) {
                break;
            }

            suma += valor;
            contador++;
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se introdujeron valores.");
        }
    }
}
