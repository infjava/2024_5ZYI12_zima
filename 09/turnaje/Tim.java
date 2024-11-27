public class Tim {
    private String nazovTimu;
    private Krajina krajina;
    
    public Tim(String nazovTimu, Krajina krajina) {
        this.nazovTimu = nazovTimu;
        this.krajina = krajina;
    }
    
    public String getNazovTimu() {
        return this.nazovTimu;
    }
    
    public Krajina getKrajina() {
        return this.krajina;
    }
}
