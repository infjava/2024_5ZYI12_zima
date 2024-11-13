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
        for (Osoba aktualna : this.zoznamOsob) {
            if (aktualna.getMeno().equals(hladanaOsoba.getMeno())
                        && aktualna.getPriezvisko().equals(hladanaOsoba.getPriezvisko())) {
                return true;
            }
        }
        
        return false;
    }
        
    public int getPocetClenovSkupiny() {
        return this.zoznamOsob.size();
    }
        
    public void vypisClenovSkupiny() {
        for (Osoba osoba : this.zoznamOsob) {
            osoba.vypis();
        }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        // Doplnit!
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        // Doplnit!
    }
    
    public void zrusSkupinu() {
        // Doplnit!
        // Ktory cyklus pouzijete? Foreach? While? Treba vobec cyklus?
    }
}
