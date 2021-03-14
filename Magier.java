
/**
 * Write a description of class Magier here.
 *
 * @author dt
 * @version 0.1
 */
public class Magier extends SpielerCharacter
{
    // instance variables - replace the example below with your own
    private int zauberkraft;

    /**
     * Constructor for objects of class Magier
     */
    public Magier(String name, int zauberkraft, int lebensenergie)
    {
        super(lebensenergie, name);
        this.zauberkraft = zauberkraft;
    }
    
    //getter und setter
    
    public void setZauberkraft(int zauberkraft){
        this.zauberkraft = zauberkraft;
    }
    
    public int getZauberkraft(){
        return zauberkraft;
    }
    

    
}
