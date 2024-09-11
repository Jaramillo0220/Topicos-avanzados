import java.util.Scanner;

class Prom1SerieSumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.println("Ingresa un número natural N: ");
        int N = sc.nextInt();
        
        System.err.println("Números naturales: ");
        int conteo = 1;
        int tempN = N;
        while (tempN > 0) {
            System.out.println(conteo);
            tempN--;
            conteo++;
        }
        
        conteo = 1;
        int suma = 1;
        System.err.println("\n_________________________________________");
        System.err.println("Serie sumatoria: ");
        
        tempN = N;
        while (tempN > 0) {
            System.out.println(suma);
            tempN--;
            conteo++;
            suma = conteo + suma;
        }

        conteo = 1;
        suma = 1;
        int sumaSerie = 1;
        System.err.println("\n_________________________________________");
        System.err.println("Suma de la serie sumatoria: ");
        
        tempN = N;
        while (tempN > 0) {
            System.out.println(sumaSerie);
            tempN--;
            conteo++;
            suma = conteo + suma;
            sumaSerie = suma + sumaSerie;
        }
        
        sc.close();
    }
}
