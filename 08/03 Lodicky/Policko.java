import fri.shapesge.Stvorec;

public class Policko {
    private Stvorec stvorec;
    private Lodicka lodicka;
    private boolean trafene;
    
    public Policko(int x, int y) {
        this.stvorec = new Stvorec(x * 20, y * 20);
        this.stvorec.zmenStranu(19);
        this.stvorec.zmenFarbu("blue");
        this.stvorec.zobraz();
        
        this.lodicka = null;
        this.trafene = false;
    }
    
    public void postavLodicku(Lodicka lodicka) {
        this.lodicka = lodicka;
        this.lodicka.priradPolicko(this);
    }
    
    public void zasiahni() {
        this.trafene = true;
        if (this.lodicka == null) {
            this.stvorec.zmenFarbu("#C0C0C0");
        } else {
            this.stvorec.zmenFarbu("red");
            
            this.lodicka.skontrolujZnicenie();
        }
    }
    
    public boolean jeTrafene() {
        return this.trafene;
    }
    
    public void prefarbiNaCierno() {
        this.stvorec.zmenFarbu("black");
    }
}
