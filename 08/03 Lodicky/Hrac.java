import fri.shapesge.Manazer;

public class Hrac {
    private Plocha plocha;
    private Manazer manazer;
    
    public Hrac(Plocha plocha) {
        this.plocha = plocha;
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }
    
    public void vyberSuradnice(int x, int y) {
        if (this.plocha.obsahuje(x / 20, y / 20)) {
            this.plocha.zasiahni(x / 20, y / 20);
        }
    }
}
