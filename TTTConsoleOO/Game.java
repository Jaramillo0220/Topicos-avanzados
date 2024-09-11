package TTTConsoleOO;

public class Game {
   private Seed currentPlayer;  // declare variable currentPlayer as an instance of enum Seed
   private Seed content;        // declare variable content as an instance of enum Seed

   public Game() {
      // Assign values to these variables
      currentPlayer = Seed.CROSS;  // assign a value (an enum item) to the variable currentPlayer
      content = Seed.NO_SEED;      // assign a value (an enum item) to the variable content
   }

   // Ejemplo de un método que usa currentPlayer
   public void printCurrentPlayer() {
      System.out.println("The current player is: " + currentPlayer.getIcon());
   }
   
   // Otros métodos y lógica de tu clase Game
}
