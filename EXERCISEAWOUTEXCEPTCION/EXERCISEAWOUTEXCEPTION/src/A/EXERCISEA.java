/**
 * HERRERA GARCIA JOSE SALVADOR  
 * JARAMILLO LUNA JOSE ANGEL
 * 
 */

package A;

import java.util.Scanner;

public class EXERCISEA {

	public static void main(String args[]) {
		int i = 1;
		Scanner ent = new Scanner(System.in);

		int axex = RandomPatas.AleatoryAxex();
		int basiliscos = RandomPatas.AleatoryBasiliscos();
		int centauros = RandomPatas.AleatoryCentauros();
		int lie = RandomPatas.LIE();

		do {
			System.out.println("INTERACTION: " + i);
			System.out.printf(":");
			int patasAxex = ent.nextInt();
			int patasBasiliscos = ent.nextInt();
			int patasCentauros = ent.nextInt();

			if ((patasAxex >= 0 && patasAxex <= 10) && (patasBasiliscos >= 0 && patasBasiliscos <= 10)
					&& (patasCentauros >= 0 && patasCentauros <= 10)) {
				if (i != lie) {
					System.out
							.print((patasAxex * axex) + (patasBasiliscos * basiliscos) + (patasCentauros * centauros));
					System.out.println("");
				} else {
					System.out.print((int) (((Math.random() * 5) + 1) * axex + basiliscos + centauros) + " ");
					System.out.println("");
				}
				i++;
			} else {
				System.out.println("GIVE ME NUMERS BETWEN 0 AND 10 PLIS >:\\");
			}
		} while (i <= 5);
		// esta parte no se si dejarla o quitarla, al final el programa nos dice
		// realemnete cuanatas tiene cada uno
		System.out.println("ACTUALLY YHE REAL NUMBER OF PATAS HAVE THESE MITOLOGIC ANIMAL IS: ");
		System.out.println(axex + " " + basiliscos + " " + centauros);
		ent.close();
	}
}
