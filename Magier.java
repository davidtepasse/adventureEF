
/**
 * Write a description of class Magier here.
 *
 * @author dt
 * @version 0.1
 */
public class Magier extends SpielerCharacter
{
    // instance variables - replace the example below with your own
    private String name;
    private int zauberkraft;
    private int lebenspunkte;

    /**
     * Constructor for objects of class Magier
     */
    public Magier()
    {
        // initialise instance variables
        this.name = "Merlin";
        this.zauberkraft = 100;
        this.lebenspunkte = 100;
    }

    public Magier(String name, int zauberkraft, int lebensenergie)
    {
        this.name = name;
        this.zauberkraft = zauberkraft;
        this.lebenspunkte = lebenspunkte;
    }
    
    //getter und setter
    
    public void setZauberkraft(int zauberkraft){
        this.zauberkraft = zauberkraft;
    }
    
    public int getZauberkraft(){
        return zauberkraft;
    }
    

    
}
