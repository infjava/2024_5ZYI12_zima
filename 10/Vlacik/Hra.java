import fri.shapesge.Manazer;

public class Hra {
    private final Manazer manazer;
    private final CastVlaku vlak;
    private Smer smer;
    private boolean zvacsi;
    
    public Hra() {
        this.manazer = new Manazer();
        
        this.smer = Smer.VLAVO;
        
        this.vlak = new CastVlaku(
            new Poloha(150, 150, this.smer),
            TypCastiVlaku.RUSEN
        );
        
        this.zvacsi = false;
        
        this.manazer.spravujObjekt(this);
    }
    
    public void tik() {
        if (this.zvacsi) {
            this.vlak.pripojCast(TypCastiVlaku.VAGON1);
            
            this.zvacsi = false;
        }
        
        this.vlak.pohniNaNovuPoziciu(this.smer);
    }
    
    public void posunHore() {
        this.smer = Smer.HORE;
    }
    
    public void posunDole() {
        this.smer = Smer.DOLE;
    }
    
    public void posunVlavo() {
        this.smer = Smer.VLAVO;
    }
    
    public void posunVpravo() {
        this.smer = Smer.VPRAVO;
    }
    
    public void aktivuj() {
        this.zvacsi = true;
    }
}
