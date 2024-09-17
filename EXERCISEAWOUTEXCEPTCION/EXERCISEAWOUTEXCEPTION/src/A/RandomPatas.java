package A;

public class RandomPatas {
	//method that get a random number 
	public static int getNumberRandom() {
		return (int) ((Math.random()*10));//multiply for 10 to get a large between 0 and 10 
	}
		//numbers of patas hace a axes
		public static int AleatoryAxex() {
		int axex= getNumberRandom();	
		return axex;
		}
		
		//numers of patas have a basilics
		public static int AleatoryBasiliscos() {
		int basiliscos= getNumberRandom();	
		return basiliscos;
		}
		
		//how many patas does have centaury?
		public static int AleatoryCentauros() {
		int centauros=getNumberRandom();
		return centauros;
		}
		
		//WHAT NUMBER/INTERACTIVE LIES?
		public static int LIE() {
		int lie=(int) (Math.random()*5)+1;//multiply for 5 to get a rango between 0 a 5 and the plus 1 to get new rango in 1 to 5 (because cant be 0 interactivies)
		return lie;		
		}
		
}
