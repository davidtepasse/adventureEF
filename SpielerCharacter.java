
/**
 * Beschreiben Sie hier die Klasse SpielerCharacter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SpielerCharacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int lebenspunkte;

    /**
     * Konstruktor für Objekte der Klasse SpielerCharacter
     */
    public SpielerCharacter(int lebenspunkte, String name)
    {
        // Instanzvariable initialisieren
        this.name = name;
        this.lebenspunkte = lebenspunkte;
    }
    public String getName(){
        return name;
    }
    
    public void setLebensenpunkte(int lebenspunkte){
        this.lebenspunkte = lebenspunkte;
    }
    
    /**
     * Ich bin eine Beschreibung für die unten stehende Methode.
     */
    public int getLebenspunkte(){
        return lebenspunkte;
    }
}
