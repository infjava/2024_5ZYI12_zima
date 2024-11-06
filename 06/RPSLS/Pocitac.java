import java.util.Random;

public class Pocitac {
    private Ruka ruka;
    private Manazer manazer;
    private Random nahoda;
    
    public Pocitac() {
        this.ruka = new Ruka(200, 100);
        
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        
        this.nahoda = new Random();
    }
    
    public void tik() {
        var gesto = this.nahoda.nextInt(5);
        
        this.ruka.setGesto(gesto);
    }
}
