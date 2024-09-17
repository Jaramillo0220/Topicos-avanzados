public class RandomPatas {
    private int axex;
    private int basiliscos;
    private int centauros;
    private int Lie;
    private final int range = 100; //Variable para establecer el rango de patas

    // Constructor que genera aleatoriamente los valores de patas para cada animal
    public RandomPatas() {
        this.axex = (int) (Math.random() * range);
        this.basiliscos = (int) (Math.random() * range);
        this.centauros = (int) (Math.random() * range);
        this.Lie = (int) (Math.random() * 5) + 1;
    }

    // Métodos para obtener el número de patas de cada animal
    public int getAxes() {
        return this.axex;
    }
    
    public int getBasiliscos() {
        return this.basiliscos;
    }
    
    public int getCentauros() {
        return this.centauros;
    }
    
    public int getLie() {
        return this.Lie;
    }
}