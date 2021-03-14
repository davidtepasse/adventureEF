
/**
 * Write a description of class Waffe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Waffe
{
    // instance variables - replace the example below with your own
   
    private int schaden;
    private int zustand;
    private String name;
    private String material;
    /**
     * Constructor for objects of class Waffe
     */
    public Waffe(int schaden, int zustand, String name, String Material)
    {
        // initialise instance variables
        this.name = name;
        this. zustand = zustand;
        this. material = material;
        this.schaden = schaden;
    }
    
    /**
     * Kommentare!
     */
    public int getStaerke() {
        return schaden * zustand;
    }
    
    
}
