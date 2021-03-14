
/**
 * Realisiert einen Helden
 *
 * @author dt
 * @version 0.1
 */
public class Held extends SpielerCharacter
{
    // instance variables - replace the example below with your own
    private int lebenspunkte;
    private int vermoegen;
    private int kampfkraft;
    private String name;
    private Waffe waffe;

    /**
     * Constructor for objects of class Held
     */
    public Held(int lebenspunkte, int vermoegen, int kampfkraft, String name)
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
    public void waffeAufnehmen(Waffe waffe) {
        this.waffe = waffe;
    }
    
    /**
     * Kommentare!
     */
    public void waffeAblegen() {
        this.waffe = null;
    }
    
    
    /**
     * Kommentare!
     */
    public int berechneKampfkraft() {
        return kampfkraft + waffe.getStaerke();
    }
    
    /**
     * Kommentare!
     */
    public void greifeAn(Monster monster) {
        int monsterkraft = monster.berechneKampfkraft();
        int heldenkraft = this.berechneKampfkraft();
        if (heldenkraft >= monsterkraft) { // held hat gewonnen
            this.kampfkraft++;
            monster.setLebenspunkte(monster.getLebenspunkte()-1);
        } else {
            // Held hat verloren.. was tun?
        }
    }
}
