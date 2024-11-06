public class Hrac {
    private Ruka ruka;
    private Manazer manazer;
    
    public Hrac() {
        this.ruka = new Ruka(100, 100);
        
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }
    
    public void posunHore() {
        this.ruka.nasledujuceGesto();
    }
    
    public void posunDole() {
        this.ruka.predchadzajuceGesto();
    }
}
