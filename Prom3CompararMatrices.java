import java.util.Scanner;

public class Prom3CompararMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        
        System.out.println("Ingresa los elementos de la primera matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Ingresa los elementos de la segunda matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }
        
        boolean sonIguales = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    sonIguales = false;
                    break;
                }
            }
            if (!sonIguales) {
                break;
            }
        }
        
        if (sonIguales) {
            System.out.println("Las matrices son iguales.");
        } else {
            System.out.println("Las matrices no son iguales.");
        }
        
        sc.close();
    }
}
