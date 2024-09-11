import java.util.Scanner;

public class Prom4ReemplazarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número entero: ");
        int numero = sc.nextInt();
        
        String numeroStr = Integer.toString(numero);
        String resultado = numeroStr.replace('1', '6');
        
        System.out.println("Resultado: " + resultado);
        
        sc.close();
    }
}
