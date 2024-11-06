public class Rozhodca {
    private Hrac hrac;
    private Pocitac pocitac;
    
    public Rozhodca(Hrac hrac, Pocitac pocitac) {
        this.hrac = hrac;
        this.pocitac = pocitac;
    }
    
    public String rozhodni() {
        return "remiza";
    }
}
