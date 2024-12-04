import fri.shapesge.Obrazok;

public class CastVlaku {
    private static final int VELKOST = 35;
    
    private Poloha poloha;
    private final Obrazok obrazok;
    private CastVlaku dalsiaCast;
    
    public CastVlaku(Poloha poloha, TypCastiVlaku typ) {
        this.poloha = poloha;
        
        this.obrazok = new Obrazok(typ.getObrazok(), poloha.getX(), poloha.getY());
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
        this.obrazok.zobraz();
        
        this.dalsiaCast = null;
    }
    
    public Poloha getPoloha() {
        return this.poloha;
    }
    
    private void setPoloha(Poloha poloha) {
        this.poloha = poloha;
        
        this.obrazok.zmenPolohu(poloha.getX(), poloha.getY());
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
    }
    
    public void pripojCast(TypCastiVlaku typNovejCasti) {
        if (this.dalsiaCast == null) {
            Poloha novaPoloha = this.poloha.getPosunutaPoloha(-CastVlaku.VELKOST, this.poloha.getSmer());
            this.dalsiaCast = new CastVlaku(novaPoloha, typNovejCasti);
        } else {
            this.dalsiaCast.pripojCast(typNovejCasti);
        }
    }
    
    public void pohniNaNovuPoziciu(Smer smer) {
        this.pohniNaNovuPoziciu(
            this.poloha.getPosunutaPoloha(CastVlaku.VELKOST, smer)
        );
    }
    
    private void pohniNaNovuPoziciu(Poloha novaPoloha) {
        if (this.dalsiaCast != null) {
            this.dalsiaCast.pohniNaNovuPoziciu(this.poloha);
        }
        
        this.setPoloha(novaPoloha);
    }
}
