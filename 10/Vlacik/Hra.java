import fri.shapesge.Manazer;
import java.util.Random;

public class Hra {
    private final Manazer manazer;
    private final CastVlaku vlak;
    private Smer smer;
    private boolean zvacsi;
    private Random nahodneCisla;
    
    public Hra() {
        this.manazer = new Manazer();
        
        this.smer = Smer.VLAVO;
        
        this.vlak = new CastVlaku(
            new Poloha(150, 150, this.smer),
            TypCastiVlaku.RUSEN
        );
        
        this.zvacsi = false;
        
        this.nahodneCisla = new Random();
        
        this.manazer.spravujObjekt(this);
    }
    
    public void tik() {
        if (this.zvacsi) {
            TypCastiVlaku[] typyCasti = TypCastiVlaku.values();
            int nahodnyIndex = this.nahodneCisla.nextInt(typyCasti.length - 1) + 1;
            
            this.vlak.pripojCast(typyCasti[nahodnyIndex]);
            
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
