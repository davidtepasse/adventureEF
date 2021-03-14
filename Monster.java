
/**
 * Realisiert einen Monster
 *
 * @author dt
 * @version 0.1
 */
public class Monster
{
    // instance variables - replace the example below with your own
    private int lebenspunkte;
    private int vermoegen;
    private int kampfkraft;
    private String name;

    /**
     * Constructor for objects of class Monster
     */
    public Monster(int lebenspunkte, int vermoegen, int kampfkraft, String name)
    {
        // initialise instance variables
        this.lebenspunkte = lebenspunkte;
        this.vermoegen = vermoegen;
        this.kampfkraft = kampfkraft;
        this.name = name;
    }

    /**
     * Kommentare!
     */
    public int berechneKampfkraft() {
        return kampfkraft;
    }
    
    public int getLebenspunkte(){
        return lebenspunkte;
    }
    
    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}
