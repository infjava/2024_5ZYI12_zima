public class DvojciferneCislo {
    private Cislica desiatky;
    private Cislica jednotky;
    
    public DvojciferneCislo(int x, int y) {
        this.desiatky = new Cislica(x, y);
        this.jednotky = new Cislica(x + 80, y);
    }
    
    public void nastavCislo(int cislo) {
        this.desiatky.nastavCislo((char)(cislo / 10 + '0'));
        this.jednotky.nastavCislo((char)(cislo % 10 + '0'));
    }
}
