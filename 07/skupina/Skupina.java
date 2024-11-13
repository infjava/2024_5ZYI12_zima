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
        // Doplnit!
        // Poznamka: V metóde nepouzivajte vetvenie (prikaz IF)!
        return false;
    }
        
    public int getPocetClenovSkupiny() {
        return this.zoznamOsob.size();
    }
        
    public void vypisClenovSkupiny() {
        for (int index = 0; index < this.zoznamOsob.size(); index++) {
            this.zoznamOsob.get(index).vypis();
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
