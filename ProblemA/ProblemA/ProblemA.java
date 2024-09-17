/*
 * HERRERA GARCIA JOSE SALVADOR  
 * OVIEDO CUEVA EDGAR URIEL
 * JARAMILLO LUNA JOSE ANGEl
 */

import java.util.Scanner;
import java.util.Vector;

public class ProblemA {
    private static boolean repeat = true;
    private static int axex = 0;
    private static int basiliscos = 0;
    private static int centauros = 0;
    private static Vector<String> previousInputs = new Vector<>(); // Vector para almacenar todas las entradas
                                                                   // anteriores

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomPatas rand = new RandomPatas();

        int patasAxex = rand.getAxes(); // Asignamos el numero de patas que va a tener el axex
        int patasBasiliscos = rand.getBasiliscos(); // Asignamos el numero de patas que va a tener el basilisco
        int patasCentauros = rand.getCentauros(); // Asignamos el numero de patas que va a tener el centauro
        int lie = rand.getLie(); // Asignamos en qué interacción metemos la mentira

        String entrada;

        for (int i = 1; i <= 5; i++) {
            do {
                System.out.printf("%nInteraction %d%n", i);
                entrada = scanner.nextLine(); // Leemos la entrada en un string ya que es una cadena de caracteres

                // Verificamos si la entrada ya se ingresó anteriormente
                if (previousInputs.contains(entrada)) {
                    System.out.println(
                            "Esta combinación de respuestas ya fue ingresada. Por favor, ingresa una diferente.");
                    repeat = true;
                    continue; // Volvemos a pedir una nueva entrada
                }

                try {
                    separarParametros(entrada); // Separamos los valores ingresados en cada variable

                    NumberValidation(axex, basiliscos, centauros); // Validamos que sean valores entre 0 y 10

                    repeat = false; // Sale del bucle si está correcto
                    previousInputs.add(entrada); // Almacenamos la entrada en el vector
                } catch (NumberFormatException e) {
                    System.out.println("Solo se aceptan numeros " + e.getMessage());
                    repeat = true;
                } catch (NumberRangeExcepcion e) {
                    System.out.println(e.getMessage());
                    repeat = true;
                }

            } while (repeat);

            // Decide en qué momento de las preguntas nos da la mentira
            if (i != lie) {
                int resp = (axex * patasAxex) + (basiliscos * patasBasiliscos) + (centauros * patasCentauros);
                System.out.printf("%d%n", resp);
            } else {
                int falseAnswer = lie * (patasAxex + patasBasiliscos + patasCentauros); // Respuesta falsa
                System.out.printf("%d%n", falseAnswer);
            }
        }

        // Mostrar el número de patas de cada animal al final
        System.out.printf("%d %d %d%n", patasAxex, patasBasiliscos, patasCentauros);
        // Este código lo estoy dejando solo para validar la respuesta final. Se quita
        // cuando lo presentemos

        // Ingresar los valores finales para verificar si acertó con las patas de cada
        // animal
        System.out.println("¿Cuál crees que sea el números de patas de cada animal individualmente?");
        entrada = scanner.nextLine();
        separarParametros(entrada);

        // Comparar los resultados individuales
        if ((axex == patasAxex) || (basiliscos == patasBasiliscos) || (centauros == patasCentauros)) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }

        scanner.close();
    }

    // Valida que el valor ingresado en cada variable sea entre 0 y 10
    public static void NumberValidation(int a, int b, int c) throws NumberRangeExcepcion {
        boolean axes = a < 0 || a > 10;
        boolean basiliscos = b < 0 || b > 10;
        boolean centauros = c < 0 || c > 10;

        if (axes || basiliscos || centauros) {
            throw new NumberRangeExcepcion("El numero debe estar entre 0 y 10");
        } else {
            repeat = false;
        }
    }

    // Separa los valores ingresados en cada variable del string de entrada en
    // variables enteras
    public static void separarParametros(String entrada) {
        String[] valores = entrada.split(" ");

        axex = Integer.parseInt(valores[0]);
        basiliscos = Integer.parseInt(valores[1]);
        centauros = Integer.parseInt(valores[2]);
    }
}
