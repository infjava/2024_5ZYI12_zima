import java.util.ArrayList;

public class Skupina {
    private ArrayList<Osoba> zoznamOsob;
        
    public Skupina() {
        this.zoznamOsob = new ArrayList<Osoba>();
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        this.zoznamOsob.add(novaOsoba);
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        this.zoznamOsob.add(new Osoba(noveMeno, novePriezvisko));
    }
    
    public boolean jeClenomSkupiny(Osoba hladanaOsoba) {
        return this.zoznamOsob.contains(hladanaOsoba);
    }
        
    public int getPocetClenovSkupiny() {
        return this.zoznamOsob.size();
    }
        
    public void vypisClenovSkupiny() {
        for (Osoba osoba : this.zoznamOsob) {
            osoba.vypis();
        }
    }
    
    public void vypisClenovSkupinyBezDuplicit() {
        ArrayList<Osoba> vypisaneOsoby = new ArrayList<Osoba>();
        
        for (Osoba osoba : this.zoznamOsob) {
            if (!vypisaneOsoby.contains(osoba)) {
                osoba.vypis();
                vypisaneOsoby.add(osoba);
            }
        }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        this.zoznamOsob.remove(poradie);
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        this.zoznamOsob.remove(osoba);
    }
    
    public void zrusSkupinu() {
        this.zoznamOsob.clear();
    }
}
